public class Result {

    Customer customer;
    Robot robot;
    String country;
    int gradeNumber;

    Result(String country,int gradeNumber){

        this.country = country;
        this.gradeNumber = gradeNumber;
    }

    public void bill(String country, int gradeNumber, Customer customer,Robot robot) {


       System.out.println("========= 영수증 =========");
        System.out.println("");
       System.out.println("주문자의 이름은 : " + customer.name);
       System.out.println("주문자의 전화번호 : " +customer.phoneNumber);
       System.out.println("물건의 원산지는 " +country);
       System.out.println("물건의 품질은 "  + gradeNumber + "등급 입니다");
        System.out.println("로봇의 완성도는 " + robot.completely + "입니다");
        System.out.println("");
        System.out.println("===========================");
        

    }

}
