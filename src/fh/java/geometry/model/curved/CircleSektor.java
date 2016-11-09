package fh.java.geometry.model.curved;

public class CircleSektor extends Circle {

    private double radius;
    private double alpha;

    public CircleSektor() {}

    public CircleSektor(int x, int y, double radius, double alpha) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.alpha = alpha;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @Override
    public double calcArea() {
        double angle = Math.toRadians(this.alpha);
        return radius * radius * angle / 2;
    }

    @Override
    public double calcPerimeter() {
        double angle = Math.toRadians(this.alpha);
        return 2 * radius + radius * angle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CircleSegment{");
        sb.append("radius=").append(radius);
        sb.append(", alpha=").append(alpha);
        sb.append('}');
        return sb.toString();
    }
}
