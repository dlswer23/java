package week17;

import java.util.Random;


public class NewCertPassword {
    private int pwdLen = 12;
    Random rd = new Random();
    char[] pwdsc = new char[]{'@', '#', '$', '&', '*'};

    char[] num = {'0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9'};

    char[] pwdUpper = {'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z'};

    char[] pwdLower ={'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};

    NewCertPassword(){
        System.out.println("password : " + execute());
    }

    public static void main(String []args){
        new week17.NewCertPassword();
    }




    String execute() {
        StringBuilder sb = new StringBuilder();
        int i;

        for (i = 0; i < pwdLen/12; i++) {
            sb.append(pwdUpper[rd.nextInt(pwdUpper.length)]);

        }
        for(i=0;i<2;i++){
            sb.append(pwdLower[rd.nextInt(pwdLower.length)]);
        }

        for(i=0;i<6;i++){
            sb.append(num[rd.nextInt(num.length)]);
        }

        for(i=0;i<1;i++){
            sb.append(pwdsc[rd.nextInt(pwdsc.length)]);
        }
        return sb.toString();
    }


}
