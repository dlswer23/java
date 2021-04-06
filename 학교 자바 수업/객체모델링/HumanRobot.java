public class HumanRobot extends Robot {

    int size;
    int cost;

    HumanRobot(){



    }


    @Override
    public void about() {


        System.out.println("");

        System.out.println("추천하는 HumanRobot의 사이즈는 "+ size +"입니다");

        System.out.println("추천 HumanRobot의 가격은 " + cost+ "입니다");

        System.out.println("");

    }

    public void about(int size,int cost) {

        System.out.println("==============================");

        System.out.println("");

        System.out.println("고객님이 구매하신 HumanRobot의 사이즈는 "+ size +"입니다");

        System.out.println("고객님이 구매하신 HumanRobot의 가격은 " + cost+ "입니다");

        System.out.println("");

        System.out.println("주문이 완료되었습니다");

        System.out.println("");
        System.out.println("===========");

    }
}
