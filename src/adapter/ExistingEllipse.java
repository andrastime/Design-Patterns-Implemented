package adapter;

public class ExistingEllipse {
    float a, b;

    public ExistingEllipse( float semiMajor, float semiMinor){
        a = semiMajor;
        b = semiMinor;
    }

    public double calculateFocus(){
        return Math.sqrt(Math.pow(a,2)-Math.pow(b,2));
    }

    public double calculateSemiLactusRectum(){
        return Math.pow(b,2)/a;
    }

    public double calculateEccentricity(){
        return 1 - Math.sqrt(1 - Math.pow((b/a),2));
    }

    public double calculateArea(){
        return Math.PI * a * b;
    }

    public double calculatePerimeter(){
        double h = Math.pow((a-b),2)/Math.pow((a+b),2);
        return Math.PI * (a + b) * (1 + (3*h/(10+Math.sqrt(4-3*h))));
    }
}
