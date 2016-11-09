package fh.java.geometry.model.quadrilateral;

public class Parallelogramm extends Square {

    private double sideB;
    private double height;

    public Parallelogramm() {}

    public Parallelogramm(int x, int y, double sideA, double sideB, double height) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
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

    @Override
    public double calcArea() {
        return sideA * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parallelogramm rectangle = (Parallelogramm) o;

        return Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

}
