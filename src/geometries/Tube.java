package geometries;

import primitives.*;

public class Tube implements Geometry{
    protected Ray axisRay;
    protected double radius;

    public Tube(Ray axisRay, double radius) {
        this.axisRay = axisRay;
        this.radius = radius;
    }

    public Ray getAxisRay() {
        return axisRay;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "axisRay=" + axisRay.toString() +
                ", radius=" + radius;
    }

    @Override
    public Vector getNormal(Point p) {
        return null;
    }
}