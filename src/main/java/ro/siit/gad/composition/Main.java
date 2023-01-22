package ro.siit.gad.composition;

public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(2, 3);
        System.out.println(myRectangle.getArea());

        WrongSquare wrongSquare = new WrongSquare(2);
        System.out.println(wrongSquare.getArea());
        wrongSquare.methodSpecificONLYForRectangle(); //?????

        Square square = new Square(2);
        System.out.println(square.getArea());
        // square.methodSpecificONLYForRectangle();
    }
}
