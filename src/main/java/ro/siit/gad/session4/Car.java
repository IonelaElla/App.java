package ro.siit.gad.session4;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Car extends Vehicle{
    private String licencePlate;

    public Car(Integer topSpeed, String licencePlate) {
        super(topSpeed);
        this.licencePlate = licencePlate;
    }

    // @Override
    public String tostring() {
        return new ToStringBuilder(this)
                .append("licencePlate", licencePlate)
                .append("topSpeed", this.getTopSpeed())
                .toString();
    }

//    public void printState(){
//        System.out.println(this.getClass().getCanonicalName());
//        System.out.println(this);
//    }
}
