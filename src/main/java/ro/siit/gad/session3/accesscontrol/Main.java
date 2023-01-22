package ro.siit.gad.session3.accesscontrol;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.publicProp = "val";
        myClass.protectedProp = "val";
        myClass.packageProp = "val";
    }
}
