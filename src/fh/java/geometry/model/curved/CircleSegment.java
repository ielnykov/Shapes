package fh.java.geometry.model.curved;

public class CircleSegment extends Circle {

    private double radius;
    private double alpha;

    public CircleSegment() {}

    public CircleSegment(int x, int y, double radius, double alpha) {
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
        return radius * radius / 2 * (angle - Math.sin(angle));
    }

    @Override
    public double calcPerimeter() {
        double angle = Math.toRadians(this.alpha);
        return Math.sqrt(2 * (radius * radius) - 2 * (radius * radius) * Math.cos(angle)) + radius * angle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CircleSegment that = (CircleSegment) o;

        if (Double.compare(that.radius, radius) != 0) return false;
        return Double.compare(that.alpha, alpha) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(alpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CircleSegment{");
        sb.append("radius=").append(radius);
        sb.append(", alpha=").append(alpha);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
