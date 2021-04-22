package no1;

import java.util.Scanner;

public class no2 {
    public static void main(String []args){

        int result; //팩토리얼 결과 값 저장
        int n;      //키보드에서 입력받을 정수 저장
        Scanner in = new Scanner(System.in);
        n= in.nextInt();

        result = 1;

        while (true){
            //조건문을 사용하여 팩토리얼 값을 계산
            result *= n--;
            if(n==0) {
                break;
            }
        }
        System.out.println(result);
    }

}
