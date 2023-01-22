package ro.siit.gad.session7;

public class Employed extends Person {
    public Employed(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employed: " + super.toString();
    }
}
