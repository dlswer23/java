package test1;

import java.util.Scanner;

public class Rectangular {
	
	public static void main(String []args) {
	
	double w,h,area;
	Scanner in = new Scanner(System.in);
	
	System.out.print("직사각형의 가로 길이를 구하시오 : ");
	
	w = in.nextDouble();
	
	System.out.print("직사각형의 세로 길이를 구하시오 : ");
	
	h = in.nextDouble();
	
	area = w * h;
	
	System.out.print("직사각형의 넓이는 : " + area);

	
	}

}
