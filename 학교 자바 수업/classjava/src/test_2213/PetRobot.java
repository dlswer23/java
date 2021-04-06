package test_2213;

public class PetRobot extends Robot {

    String kind;
    int cost;

    PetRobot(String kind,int cost){
        this.kind = kind;
        this.cost = cost;

    }

    @Override
    public void about(){

        System.out.println("추천 PetRobot의 종류는 " + kind + "입니다");
        System.out.println("추천 PetRobot의 가격은 " + cost + "입니다");

    }

    public void about(String kind,int cost) {

        System.out.println("고객님이 구매하신 PetRobot의 종류는 " + kind + "입니다" );

        System.out.println("고객님이 구매하신 PerRobot의 가격은 "+ cost+ "원 입니다");

        System.out.println("고객님이 구매하신 PetRobot의 완성률은 " + completely + " 입니다");

        System.out.println("주문이 완료되었습니다");
        System.out.println("=======================");

    }
}
