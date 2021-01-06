import java.util.Scanner;

public class Calculation {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하시오");//정수입력 멘트
        int time = scanner.nextInt(); //정수 입력
        int second= time % 60; //60으로 나눈 나머지는 초
        int min = (time%60)%60; //60으로 나눈 몫을 다시 60으로 나눈 나머지는
        int hour = (time/60)/60;// 60으로 나눈 몫을 다시 60으로 나눈 몫을 또 60으로 나눈 값은 시간
        System.out.println(time +"초는 ");
        System.out.println(hour +"시간 ");
        System.out.println(min +"분 ");
        System.out.println(second +"초입니다");

        scanner.close();


    }
}
