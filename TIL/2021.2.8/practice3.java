package week17;

import java.util.Scanner;

public class practice3 {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("주민등록번호 7자리를 입력해주세요 : ");
        String num = scan.nextLine();
        char mw = num.charAt(7);

        if(mw == 1 || mw ==3){
            System.out.println("남자 입니다");
        }

        else if (mw ==2 || mw ==4){
            System.out.println("여자 입니다");
        }

        scan.close();
    }
}
