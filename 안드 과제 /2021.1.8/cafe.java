import java.util.Scanner;

public class cafe {


        public static void main(String args[]) {

            String menu = "메뉴 \n"+
                          "1. 아메리카노 : 2500원 \n"+
                          "2. 카페라떼 : 3000원 \n"+
                          "3. 화이트 모카라떼 : 4000원 \n"+
                          "4. 허니브레드 : 6000원 \n"+
                          "5. 음식주문  \n";

            System.out.println(menu);

            Scanner scanner = new Scanner(System.in);

            int sum=0; //다 더해지는 값이다.

            while (true){
                System.out.println("원하시는 메뉴번호를 입력하세요");
                int num = scanner.nextInt();

                if (num == 1){
                    System.out.println("아메리카노를 주문하셨습니다");
                    sum+=2500;
                }
                else if(num ==2){
                    System.out.println("카페라떼를 주문하셨습니다");
                    sum = sum+3000;
                }
                else if(num ==3){
                    System.out.println("화이트모카라떼를 주문하셨습니다");
                    sum = sum+4000;
                }
                else if(num ==4){
                    System.out.println("허니브레드를 주문하셨습니다");
                    sum = sum+6000;
                }


            if(num==5){
                System.out.println("주문하신 금액은"+sum+"입니다");
               System.out.println("감사합니다.기다리시면 곧 나옵니다");
                break;
                }
            }


        }
    }


