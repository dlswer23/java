package no1;

import java.util.Scanner;

public class no4 {

    static int factorial(int x){

        int result =1;
        for(int i=x;i>0;i--){
            result *= i;
        }
        return result;

    }


    static int factorial(int x,int y){

        int result = 1; //팩토리얼 결과 값 저장


        for(int i=x;i<=y;i++){
            result *= i;
        }

        return result;

    }


    public static void main(String []args){

        System.out.println(factorial(5));
        System.out.println(factorial(1,5));
        System.out.println(factorial(3,5));
        System.out.println(factorial(10,5));

    }
}
