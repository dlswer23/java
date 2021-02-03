package week15;

import java.util.Random;
import java.util.Scanner;

public class PowEx {
        public static void main(String []args){
            int n;
            Random rd = new Random();

            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();

            //int b = (int)Math.pow(n,3);

            System.out.println((int)Math.pow(n,3));
            //System.out.println("자릿수: "  +(b-1));

        }
}
