package ro.siit.gad.session4;

public class Vehicle {
    private Integer topSpeed;
    public Vehicle(Integer topSpeed){
        this.topSpeed = topSpeed;
    }

    public Integer getTopSpeed(){
        return this.topSpeed;
    }

    public void printState(){
        // System.out.println(this.getClass().getCanonicalName());
        System.out.println(this);
    }
}
