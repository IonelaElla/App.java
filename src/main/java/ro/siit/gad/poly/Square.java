package ro.siit.gad.poly;


public class Square implements Shape{
    private double edge;

    Square(double edge){
        this.edge = edge;
    }

    public double getArea(){
        return Math.pow(edge, 2);
    }
}
