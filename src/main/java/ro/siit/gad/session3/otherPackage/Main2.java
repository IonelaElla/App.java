package ro.siit.gad.session3.otherPackage;

import ro.siit.gad.session3.accesscontrol.MyClass;

public class Main2 extends MyClass{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.publicProp = "val";
        // myClass.protectedProp = "val";
        // myClass.packageProp = "val";

        (new Main2()).method(myClass);
    }

    public void method(MyClass myClass){
        // myClass.protectedProp = "val";
    }
}
