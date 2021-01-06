import java.util.Scanner;

public class switch문사용 {

    public static void main(String args[]){

        int a;
        System.out.println("월(1~12)을 입력하세요");
        Scanner scan = new Scanner(System.in);
        int season = scan.nextInt();

        switch(season){

        //콜론을 이용하여 구분이 가능하다.
            case 12: case 1: case 2:
                System.out.println("겨울 입니다");
                break;

            case(3):
                System.out.println("봄 입니다");
                break;

            case(4):
                System.out.println("봄 입니다");
            break;

            case(5):
                System.out.println("봄 입니다");
                break;

            case(6):
                System.out.println("여름 입니다");
                break;

            case(7):
                System.out.println("여름 입니다");
                break;

            case(8):
                System.out.println("여름 입니다");
                break;

            case(9):
                System.out.println("가을 입니다");
                break;

            case(10):
                System.out.println("가을 입니다");
                break;

            case(11):
                System.out.println("가을 입니다");
                break;


            default:
                System.out.println("없는 계절 입니다");
                break;

        }

    }
}

