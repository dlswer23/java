import java.util.Scanner;

public class OurBank {

        static Scanner scan = new Scanner(System.in);

        String name;
        int money =0;
        //금액이 오가는 것
         int pm=0;

        //출금할 금액
         int min=0;


        OurBank(String name,int money){

            this.name = name;
            this.money = money;
            run();

        }


        //예금조회
        void inquiry(){

            System.out.println(name+"님의 현재 잔액은"+money+"입니다\n");


        }


        //입금
        void input(){


            System.out.println("입력하실 금액을 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            pm = sc.nextInt();
            money += pm;
            System.out.println(name+"님의 현재 잔액은"+money+"입니다\n");



        }


        //출금
        void output(){


            System.out.println("출금하실 금액을 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            min = sc.nextInt();
            //pm에서 min만큼을 빼야한다.
            money -= min;
            System.out.println(name+"님의 현재 잔액은"+money+"입니다\n");





        }

        //종료
        void end(){

            System.out.println("종료되었습니다, 사용해주셔서 감사합니다\n");

        }

        void run() {


                while(true) {
                    System.out.println("1.예금조회 2.계좌입금 3.계좌출금 4.종료");

                    System.out.println("번호를 누르십시오");

                    int num = scan.nextInt();

                    switch (num) {
                        case 1:
                            inquiry();
                            break;

                        case 2:
                            input();
                            break;

                        case 3:
                            output();
                            break;


                        case 4:
                            end();
                            break;
                    }
                if(num == 4){
                    break;
                    }
                }
            }



        public static void main(String []args){

            System.out.println("안녕하세요, OurBank 입니다");
            System.out.print("고객명 입력: ");
            String name = scan.next();

            //이름과 금액을 받아온다.
            OurBank ob = new OurBank(name,0);


        }
}
