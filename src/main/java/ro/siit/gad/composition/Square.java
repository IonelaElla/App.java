package ro.siit.gad.composition;

public class Square {
    private Rectangle innerRectangle;

    Square (int edge){
        this.innerRectangle = new Rectangle(edge, edge);
    }

    int getArea(){
        return this.innerRectangle.getArea();
    }
}
