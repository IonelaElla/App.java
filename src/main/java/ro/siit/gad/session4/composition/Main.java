package ro.siit.gad.session4.composition;

public class Main {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine("Steel", 12);
        Car car = new Car(engine);

        Building building = new Building("Downing Street");
        Building.Apartment apartment = building.new Apartment("10");
        System.out.println(apartment.getAddress());
    }
}
