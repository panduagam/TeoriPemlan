package sic.geometry.generalshapes;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getKeliling() {
        return 2 * Math.PI * radius;
    }
}
