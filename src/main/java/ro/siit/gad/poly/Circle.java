package ro.siit.gad.poly;

public class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
        // return 3.14 * radius * radius
    }

    double getDiameter(){
        return 2 * radius;
    }
}
