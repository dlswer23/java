import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        run();
    }


    public static void run() {


        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer("이은별",1234);
        Robot robot = new Robot(new Head("재료","pink"),new Body(33,"black"),new Leg(32,5));
        PetRobot petRobot = new PetRobot("Baby Doll",34000);
        HumanRobot humanRobot = new HumanRobot();
        Result result = new Result("canada",1);
        Head head = new Head("pink", "red");
        Body body = new Body(22, "black");
        Leg leg = new Leg(2, 45);



        while (true) {

            System.out.println("----원하는 것을 선택하세요----");
            System.out.println("1 : 커스텀 로봇 주문하기");
            System.out.println("2 : 사람 로봇 주문하기");
            System.out.println("3 : 애완동물 로봇 주문하기");
            System.out.println("4 : 영수증 발행하기");
            System.out.println("5 : 종료하기");
            System.out.println("------------------------");

            int choice_num = sc.nextInt();

            switch (choice_num) {
                case 1:
                    customer.order();
                    robot.final1(head, body, leg);

                    break;

                case 2:
                    customer.order();
                    humanRobot.about();
                    humanRobot.about(2,30000);
                    break;

                case 3:
                    customer.order();
                    petRobot.about();
                    petRobot.about("Halloween Doll", 220000);
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
