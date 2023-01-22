package ro.siit.gad.session3.inheritance;

public class Child extends Parent{
    private String childProp;
    private final Integer CONSTANT_PROP = 30;
    public Child(){
        super();
        // CONSTANT_PROP = 3000;
        System.out.println("Child()");
    }

    @Override
    public void parentMethod() {
        // super.parentMethod();
        System.out.println("CM");
        System.out.println(CONSTANT_PROP);
    }
}
