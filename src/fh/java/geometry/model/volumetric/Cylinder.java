package fh.java.geometry.model.volumetric;

public class Cylinder extends VolumetricShape {

    private double height;
    private double radius;

    public Cylinder(int x, int y, int z, double height, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSurface() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calcVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.height, height) != 0) return false;
        return Double.compare(cylinder.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

}
