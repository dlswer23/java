package test_2213;
public class HumanRobot extends Robot {

    Robot robot = new Robot();

    int size;
    int cost;

    HumanRobot(int size,int cost) {

        this.size = size;
        this.cost = cost;

    }

    @Override
    public void about() {

        System.out.println("추천 HumanRobot의 사이즈는 "+ size +"입니다");

        System.out.println("추천 HumanRobot의 가격은 " + cost+ "입니다");

    }

    public void about(int size,int cost) {

        System.out.println("==============================");

        System.out.println("고객님이 구매하고 HumanRobot의 사이즈는 "+ size +" 입니다");

        System.out.println("고객님이 구매하신 HumanRobot의 가격은 " + cost+ "만원 입니다");

        System.out.println("고객님이 구매하신 HumanRobot의 완성률은 " + completely + " 입니다");

        System.out.println("주문이 완료되었습니다");
        System.out.println("=======================");

    }
}

