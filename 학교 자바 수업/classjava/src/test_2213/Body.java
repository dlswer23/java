package test_2213;

import java.util.Scanner;

public class Body {

    int width;
    String color2;

    Body(int width, String color2){

        this.width = width;
        this.color2 = color2;

    }

    public void final1(){
        System.out.println("로봇의 몸통 넓이는 " + width+" cm 입니다");
        System.out.println("로봇의 몸통 색은  "+color2 + " 입니다");
    }
}
