package week4;

public class Car {
	
	
	public static void main(String []args) {
		
		int num = sum(2,3,5,4,5);
		
		System.out.println(num);
		
		int re = plus(2,3);
		
		System.out.println(re);
		
		
		
}
	

	static int sum(int ...x) {
		
		int s =0;
		for(int i=0;i<x.length;i++) {
			s += x[i];
		}
		return s;
		
	}
	
	static int plus(int x,int y) {
		byte result = (byte)(x+y);
		return result;
	}
		
}

