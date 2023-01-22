package ro.siit.gad.session4.composition;

import java.awt.*;

public class Car {

    Engine engine;
    Color color;

    public Car(Engine engine) {
        this.engine = engine;
    }

    static class Engine{
        private String alloy;
        private Integer noOfCylinders;
        public Engine(String alloy, Integer noOfCylinders) {
            this.alloy = alloy;
            this.noOfCylinders = noOfCylinders;
            // color = Color.RED;
        }
    }
}

// ([{<>}])
