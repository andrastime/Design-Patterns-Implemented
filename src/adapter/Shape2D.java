package adapter;

import java.awt.geom.Point2D;

public abstract class Shape2D {
    Point2D centre;

    public Shape2D(Point2D centre){
        this.centre = centre;
    }

    Point2D getCentre(){
        return centre;
    }

    public abstract double getArea();
    public abstract double getPerimeterLength();
}
