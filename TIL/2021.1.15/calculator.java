import java.util.Scanner;

public class calculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("first num: ");
        int num1 = scan.nextInt();

        System.out.println("secomd num: ");
        int num2 = scan.nextInt();

        Calc cal = new Calc(num1,num2); //객체생성

        System.out.println(num1+" + "+num2+" = "+cal.add());
        System.out.println(num1+" - "+num2+" = "+cal.minus());
        System.out.println(num1+" * "+num2+" = "+cal.mul());
        System.out.println(num1+" / "+num2+" = "+cal.divid());


    }
}
