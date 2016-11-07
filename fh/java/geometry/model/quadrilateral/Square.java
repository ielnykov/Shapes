package fh.java.geometry.model.quadrilateral;

/**
 * Created by johann on 11/1/16.
 */
public class Square extends QuadrangularShape {

    protected double sideA;

    public Square() {
    }

    public Square(int x, int y,double sideA) {

        this.x=x;
        this.y=y;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    // TODO: Implement equals() and hashCode()

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("sideA=").append(sideA);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

}
