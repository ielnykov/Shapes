package fh.java.geometry.model.volumetric;

import fh.java.geometry.model.volumetric.VolumetricShape;

public class Pyramid extends VolumetricShape {

    private double sideA;
    private double sideB;
    private double height;
    private double heightSideA;
    private double heightSideB;

    public Pyramid(int x, int y, int z, double sideA, double sideB, double height, double heightSideA, double heightSideB) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.heightSideA = heightSideA;
        this.heightSideB = heightSideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeightSideA() {
        return heightSideA;
    }

    public void setHeightSideA(double heightSideA) {
        this.heightSideA = heightSideA;
    }

    public double getHeightSideB() {
        return heightSideB;
    }

    public void setHeightSideB(double heightSideB) {
        this.heightSideB = heightSideB;
    }

    @Override
    public double calcSurface() {
        return sideA * sideB + 2 * sideA * heightSideA / 2 + 2 * sideB * heightSideB / 2;
    }

    @Override
    public double calcVolume() {
        return 1 / 3 * sideA * sideB * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramid pyramid = (Pyramid) o;

        if (Double.compare(pyramid.sideA, sideA) != 0) return false;
        if (Double.compare(pyramid.sideB, sideB) != 0) return false;
        if (Double.compare(pyramid.height, height) != 0) return false;
        if (Double.compare(pyramid.heightSideA, heightSideA) != 0) return false;

        return Double.compare(pyramid.heightSideB, heightSideB) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightSideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightSideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", height=").append(height);
        sb.append(", heightSideA=").append(heightSideA);
        sb.append(", heightSideB=").append(heightSideB);
        sb.append('}');
        return sb.toString();
    }

}
