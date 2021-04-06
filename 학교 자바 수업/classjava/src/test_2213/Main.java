package test_2213;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        run();
    }


    public static void run() {


        Scanner sc = new Scanner(System.in);

        Head head = new Head("pink", "red");
        Body body = new Body(22, "black");
        Leg leg = new Leg(2, 45);
        Customer customer = new Customer("dldjf",1234);
        Robot robot = new Robot();
        PetRobot petRobot = new PetRobot("호러",1);
        HumanRobot humanRobot = new HumanRobot(1, 3);
        Result result = new Result("canada",23);
        



        while (true) {

            System.out.println();
            System.out.println("----원하는 것을 선택하세요----\n");
            System.out.println("1 : 커스텀 로봇 주문하기");
            System.out.println("2 : 사람 로봇 주문하기");
            System.out.println("3 : 애완동물 로봇 주문하기");
            System.out.println("4 : 영수증 발행하기");
            System.out.println("5 : 종료하기\n");
            System.out.println("------------------------");
            System.out.println();
            System.out.println();
            
            
           

            int choice_num = sc.nextInt();

            switch (choice_num) {
                case 1:
                    customer.order();
                    robot.final1(head, body, leg);

                    break;

                case 2:
                    customer.order();
                    humanRobot.about();
                    humanRobot.about(33, 123);
                    break;

                case 3:
                    customer.order();
                    petRobot.about();
                    petRobot.about("호러 ", 200);
                    break;

                case 4:
                    result.bill("Canada", 1, customer, robot);
                    break;

                case 5:
                    System.out.println("프로그램이 종료됩니다.");
                    return;

            }
        }
    }
}
