package ro.siit.gad.session4;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(100);
        v1.printState();

        Vehicle v2 = new Car(200, "B123QWE");
        v2.printState();

        Car v3 = new Car(130, "MS01ASD");
        System.out.println(v3.tostring());

        Vehicle v = new Vehicle(100);
        Vehicle z = new Car(100, "eee");
        Car possible = (Car)z;
        // Car i = new Vehicle(120);
        Car c = new Car(1000, "ddd");
    }
}
