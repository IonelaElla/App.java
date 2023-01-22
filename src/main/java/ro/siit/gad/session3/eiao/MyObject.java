package ro.siit.gad.session3.eiao;

public class MyObject extends Object{
    String prop1;
    int prop2 = 3;

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        System.out.println(myObject);
        myObject.prop1 = "Primul obiect";
        myObject.prop2 = 1;
        System.out.println(myObject);
        MyObject myObject2 = new MyObject();
        myObject2.prop1 = "Al doilea obiect";
        Integer val = Integer.valueOf(2);
        myObject2.prop2 = val.intValue();
        System.out.println(myObject.equals(myObject2));
        System.out.println(myObject2.toString());

        System.out.println(2 * myObject2.getProp2());
        System.out.println(myObject.hashCode());

        MyObject myObject3 = new MyObject("Al treilea obiect", 3);
        System.out.println(myObject3);
    }

    public MyObject(String prop1, int prop2){
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public MyObject(){
        // this("No value", 0);
        this.prop1 = "No value";
        // this.prop2 = 0;
    }

    public int getProp2() {
        // int prop2 =6;
        return prop2;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("prop1", prop1)
                .append("prop2", prop2)
                .toString();
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("MyObject{");
//        sb.append("prop1='").append(prop1).append('\'');
//        sb.append(", prop2=").append(prop2);
//        sb.append('}');
//        return sb.toString();
//    }
}
