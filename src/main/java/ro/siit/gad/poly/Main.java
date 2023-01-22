package ro.siit.gad.poly;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5);
        // shapes[0].getDiameter();
        Circle shapeAsCircle = (Circle)shapes[0];
        shapeAsCircle.getDiameter();
        shapes[1] = new Square(4);

        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
        }

    }
}
