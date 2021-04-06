public class Customer {

    String name;
    int phoneNumber;


    Customer(String name, int phoneNumber){

        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public void order(){


        System.out.println("==== 주문서 ====");
        System.out.println("주문자 이름 : " + name);
        System.out.println("주문자 전화번호 : " + phoneNumber);


    }

}