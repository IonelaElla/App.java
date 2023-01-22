package ro.siit.gad.session4.anonimus;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterfaceImplementation = new MyInterfaceImplementation();
        myInterfaceImplementation.myMethod();

        MyInterface myCustomImplementation = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("From customized method");
            }
        };
        myCustomImplementation.myMethod();

        MyInterface myJ8CustomImplementation = () -> System.out.println("J8 custom");
        myJ8CustomImplementation.myMethod();




    }
}
