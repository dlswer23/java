package test2;
import java.util.Scanner;

public class check {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int ab;
		
		ab = sc.nextInt();
		
		if(ab != 0) {
			
			System.out.println("짝수");
			
		}
		
		else if(ab == 0) {
			System.out.println("홀수");
		}
		
		
	}

}
