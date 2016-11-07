package fh.java.geometry.model;

public abstract class GeometricShape {
    

    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

	public abstract double calcArea();

    public abstract double calcPerimeter();

   // TODO: Implement equals() and hashCode()
}
