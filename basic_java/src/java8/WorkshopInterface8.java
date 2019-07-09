package java8;

interface A {
    void step1();
    void step2();
    void step3();

    static void methodB() {
        System.out.println("Called methodB");
    }

    default void methodC() {
        System.out.println("Called methodC from A");
        step1();
        step2();
        step3();
    }
}

class A1 implements  A {

    @Override
    public void step1() {

    }

    @Override
    public void step2() {

    }

    @Override
    public void step3() {

    }
}

public class WorkshopInterface8 {

    public static void main(String[] args) {
        A.methodB();

        A1 a1 = new A1();
        a1.methodC();
//        A.methodB();
//        A1.methodB();
    }

    static void X() {
        System.out.println("Called X");
    }
}
