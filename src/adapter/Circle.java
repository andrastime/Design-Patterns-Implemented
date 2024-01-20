package adapter;

import java.awt.geom.Point2D;

public class Circle extends Elliptical{
    public Circle(Point2D centre, float semiMajorAxis) {
        super(centre, semiMajorAxis);
    }

    double getRadius(){
        return semiMajorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(semiMajorAxis,2);
    }

    @Override
    public double getPerimeterLength() {
        return 2 * Math.PI * semiMajorAxis;
    }
}
