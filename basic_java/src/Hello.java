public class Hello {

	public String sayHi() {
		return "Hello World"; 
	}

	public String sayHi(String name) {
		//return "Hello " + name;
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("Hello ");
//		sb.append(name);
//		
//		return sb.toString();
		
		return String.format("Hello %s", name);
		
		
		
	}
	
}
