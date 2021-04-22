package no1;

import java.util.Scanner;

public class no3 {



    static int factorial(int x){

        int result = 1; //팩토리얼 결과 값 저장

        for(int i=x;i>0;i--){
            result *= i;
        }
        return result;

    }


    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int n;
        int result;
        System.out.println("팩토리얼 값을 구할 정수 :" );
        n = in.nextInt();
        result = factorial(n);
        System.out.println(result);
//        System.out.println(factorial(factorial(1,5));
//        System.out.println(factorial(factorial(3,5));
//        System.out.println(factorial(factorial(10,5));

    }
}
