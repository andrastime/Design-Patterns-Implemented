package adapter;

import java.awt.geom.Point2D;

public class Ellipse extends Elliptical{
    float semiMinorAxis;
    ExistingEllipse ee;

    public Ellipse(Point2D centre, float semiMajorAxis,  float semiMinorAxis) {
        super(centre, semiMajorAxis);
        this.semiMinorAxis = semiMinorAxis;
        ee = new ExistingEllipse(semiMajorAxis, semiMinorAxis);
    }

    @Override
    public double getArea() {
        return ee.calculateArea();
    }

    @Override
    public double getPerimeterLength() {
        return ee.calculatePerimeter();
    }

    public double getSemiLactusRectum(){
        return ee.calculateSemiLactusRectum();
    }

    public double getEccentricity(){
        return ee.calculateEccentricity();
    }

    public double getFociDistance(){
        return ee.calculateFocus(); //same as calculateFocus in existing ellipse
    }

    public Point2D getFocus1(){
        return new Point2D.Double(centre.getX()+getFociDistance(), centre.getX());
    }

    public Point2D getFocus2(){
        return new Point2D.Double(centre.getX()-getFociDistance(), centre.getX());
    }

}
