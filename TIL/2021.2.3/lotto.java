package week15;

import java.util.Random;

public class lotto {

    public static void main(String []args){
        int []num = new int[6];
        Random rd = new Random();


        for(int i=0;i<num.length;i++){
            num[i] = rd.nextInt(45)+1;
            for(int j=0;j<i;j++){
                if(num[i] == num[j])
                    i--;
            }


        }
        for(int k : num)
            System.out.print("["+k+"]");
    }
}
