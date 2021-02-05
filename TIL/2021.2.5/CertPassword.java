package week16;

import java.util.Random;


public class CertPassword {

    private int pwdLen = 12;
    char[] ex = new char[] { '0', '1', '2', '3', '4', '5', '6', '7',
                                    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                                    'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                                    'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                                    'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
                                    'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                    'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                                    'u', 'v', 'w', 'x', 'y', 'z','!','@','#','$','%','^','&','*','(',')' };




    void excute(){
       Random rd = new Random();

       int num = ex.length;

       for(int i=0;i<pwdLen;i++){
           System.out.print(ex[rd.nextInt(num)]);
       }

    }

    CertPassword(){
        excute();
    }


    public static void main(String []args){
        new CertPassword();
    }
}
