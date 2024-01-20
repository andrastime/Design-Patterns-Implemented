package adapter;

import java.awt.geom.Point2D;

public abstract class Elliptical extends Shape2D{
    float semiMajorAxis;
    public Elliptical(Point2D centre, float semiMajorAxis) {
        super(centre);
        this.semiMajorAxis = semiMajorAxis;
    }
}
