package java8;


interface BeforeJava8 {
    void methodA();
    void methodB();
}

interface FromJava8 {
    static void callStatic() {
        System.out.println("Called static method");
    }

    default void callByDefault() {
        System.out.println("Called default method");
    }
}

class Child implements FromJava8 {
    @Override
    public void callByDefault() {
        System.out.println("Called default method of Child");
    }
}

public class DemoInterface {

    public static void main(String[] args) {
        FromJava8.callStatic();

        FromJava8 p = new Child();
        p.callByDefault();
    }

}
