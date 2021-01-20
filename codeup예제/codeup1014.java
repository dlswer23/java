import java.util.Scanner;

public class codeup1014 {
    //문자를 2개 입력받아서 순서를 바꾸어 출력하기

    public static void main(String[] args) {

        String a;
        String b;

        Scanner sc = new Scanner(System.in);

        a = sc.next();
        b = sc.next();

        System.out.printf("%s %s",b,a);

        sc.close();



    }
}
