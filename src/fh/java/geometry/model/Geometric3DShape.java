package fh.java.geometry.model;

public abstract class Geometric3DShape extends GeometricShape {

    protected int z = 0;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public abstract double calcSurface();

    public abstract double calcVolume();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Geometric3DShape that = (Geometric3DShape) o;

        return z == that.z;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + z;
        return result;
    }
}
