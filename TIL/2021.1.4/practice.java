import java.util.Scanner;

public class practice {

    public static void main(String []args){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("당신의 이름은"+ name +"입니다");

        String city = scanner.next();
        System.out.println("도시의 이름은"+ city +"입니다");

        int age = scanner.nextInt();
        System.out.println("당신의 나이는"+ age +"입니다");

        double wei = scanner.nextDouble();
        System.out.println("몸무게는 "+ wei +"입니다");

        Boolean sin = scanner.nextBoolean();
        System.out.println("당신의 독신여부는 "+ sin +"입니다");

        scanner.close();

    }
}


