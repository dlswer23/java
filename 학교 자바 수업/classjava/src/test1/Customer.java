package test1;

public class Customer {

    String name;
    int phoneNumber;


    Customer(){

        this.name = "이은별";
        this.phoneNumber = 1234;

    }

    public void order(){


        System.out.println("==========주문서==========");
        System.out.println("주문자 이름 : " + name);
        System.out.println("주문자 전화번호 : " + phoneNumber);


    }

}
