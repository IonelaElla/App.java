package ro.siit.gad.composition;

public class Rectangle {
    int length, width;

    Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    int getArea(){
        return length * width;
    }

    public void methodSpecificONLYForRectangle(){
        System.out.println("methodSpecificONLYForRectangle");
    }
}
