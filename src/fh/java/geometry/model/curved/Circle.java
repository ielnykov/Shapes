package fh.java.geometry.model.curved;

public class Circle extends CurvedShape {

    private double radius;

    public Circle(int x, int y,double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    

    // TODO: Implement equals() and hashCode()
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
}
