import java.util.Scanner;

public class codeup1078 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //입력 받기

        System.out.print("input: ");
        //입력 받은 값을 대입하기
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if(i%2 == 0){
                sum = sum + i;
            }


        }
        System.out.println("sum: "+sum);

    }
}
