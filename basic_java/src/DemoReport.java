
interface Report {
	void generateHeader();
	void generateBody();
	void generateFooter();
	void execute();
}

abstract class MyReportType1 {
	abstract void generateHeader();
	abstract void generateBody();
	abstract void generateFooter();
	
	void execute() {
		generateHeader();
		generateBody();
		generateFooter();
	}
}

class Report1 extends MyReportType1 {

	@Override
	void generateHeader() {
	}

	@Override
	void generateBody() {
	}

	@Override
	void generateFooter() {
	}
	
}


public class DemoReport {

	public static void main(String[] args) {
		Report1 report1 = new Report1();
		report1.execute();

	}

}
