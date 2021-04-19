package Day2;

public class InstanceofOperator {
	
	public static void main(String []args) {
		
		A a = new A();
		
		if ( a instanceof A) {
			System.out.println("true");
			
		}
		
		else {
			
			System.out.println("false");
			
			
		}
	}

	
}

class A{
	
}
