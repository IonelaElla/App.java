package ro.siit.gad.session3.otherPackage;

import ro.siit.gad.session3.accesscontrol.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.publicProp = "val";
        // myClass.protectedProp = "val";
        // myClass.packageProp = "val";
    }
}
