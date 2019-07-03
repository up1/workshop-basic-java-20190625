interface A {
	void methodA();
}

class A2 implements A {

	@Override
	public void methodA() {
		System.out.println("A2");
	}
	
}

abstract class B {
	abstract void methodB();
	void callB() {
		System.out.println("callB");
	}
}

class B2 extends B {

	@Override
	void methodB() {
		System.out.println("B2");
	}
	
}

class C {
	void callC() {
		System.out.println("callC");
	}
}


public class DemoClassAbstractClassAndInterface {

	public static void main(String[] args) {
		A a = new A2();
		a.methodA();
		
		B b = new B2();
		b.methodB();

	}

}
