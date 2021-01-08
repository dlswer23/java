import java.util.Scanner;

public class while예제 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("end를 작성하면 종료합니다");

        while (true) {
            System.out.print("입력하세요");
            String text = scanner.nextLine();

            if (text.equals("end"))
                break;
        }

        System.out.println("끝났습니다");
        scanner.close();
        }
    }


