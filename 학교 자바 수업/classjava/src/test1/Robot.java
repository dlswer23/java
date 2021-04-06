package test1;

public class Robot {

    String completely = "88%";

    Robot(){
        Head head;
        Body body;
        Leg leg;
    }

    public void final1(Head head,Body body,Leg leg) {

        head.final1();
        body.final1();
        leg.final1();

    }
    
    void about() {
    	
    	System.out.println("완성도는 " + completely + "입니다");
        System.out.println("주문이 완료되었습니다");
        System.out.println("=======================");
    	
    }
}

