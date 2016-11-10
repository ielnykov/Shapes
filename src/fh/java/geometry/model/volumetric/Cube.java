package fh.java.geometry.model.volumetric;

public class Cube extends VolumetricShape {

    private double sideA;

    public Cube(int x, int y, int z, double sideA) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calcSurface() {
        return 6 * sideA;
    }

    @Override
    public double calcVolume() {
        return sideA * sideA * sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        return Double.compare(cube.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube{");
        sb.append("sideA=").append(sideA);
        sb.append('}');
        return sb.toString();
    }
}
