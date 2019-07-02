public class DemoOOP {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);
		// Employee@33909752
		
		AList aList = new NewArrayList();
		BList bList = new NewArrayList();
	}

}

interface AList {
	void methodA1();
	void methodA2();
}

interface BList {
	void methodB1();
	void methodB2();
}

class NewArrayList implements AList, BList {

	@Override
	public void methodA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB2() {
		// TODO Auto-generated method stub
		
	}
	
}

class CArrayList implements AList {

	@Override
	public void methodA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA2() {
		// TODO Auto-generated method stub
		
	}
	
}

class EmployeeOutsourcing extends Employee {
	
}


class EmployeePermanant extends Employee {
	
}

class Employee {
	private int id;
	private String name;
	
	Employee() {
		this(0);
	}

	Employee(int id) {	
		this(id, "");
	}
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
