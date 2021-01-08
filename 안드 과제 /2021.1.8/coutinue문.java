import java.util.Scanner;

public class coutinue문 {
    public static void main(String args[]) {

        //coutinue문을 사용합니다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요");
        int sum = 0;



        for (int i = 0; i <5; i++) {
            System.out.println((i+1)+". Number: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                i--;
                continue;
            }
            else sum += n;
        }

            System.out.println("양수의 합은" + sum);

            scanner.close();

    }
}
