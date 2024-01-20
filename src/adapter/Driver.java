package adapter;

import java.awt.geom.Point2D;

public class Driver {
    public static void main(String[] args){
        Ellipse e = new Ellipse(new Point2D.Double(0,0),15, 11);
        System.out.println("Area: "+e.getArea());
        System.out.println("Perimeter: "+e.getPerimeterLength());
        System.out.println("Eccentricity: "+e.getEccentricity());
        System.out.println("Semi-Lactus Rectum : "+e.getSemiLactusRectum());
        System.out.println("Focus 1: "+e.getFocus1());
        System.out.println("Focus 2: "+e.getFocus2());
    }
}
