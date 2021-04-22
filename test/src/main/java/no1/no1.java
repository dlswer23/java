package no1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class no1 {


//    static int factorial(int x){
//
//        int result =1;
//        for(int i=x;i>0;i--){
//            result *= i;
//        }
//        return result;
//
//    }


    public static void main(String []args){

        System.out.println("팩토리얼 값을 구할 정수 : ");
        int result; //팩토리얼 결과 값 저장
        int n;      //키보드에서 입력받을 정수 저장
        Scanner in = new Scanner(System.in);
        n= in.nextInt();


        result = 1;
        for(int i=n;i>0;i--){
            result = result * i;

        }
        System.out.println(result);


        while (n > 0){

            result = result * n--;


        }
        System.out.println(result);

    }
}
