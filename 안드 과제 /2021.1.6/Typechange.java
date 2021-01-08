import java.util.Scanner;

public class Typechange {

    public static void main(String[]args){
        //String str = "JDK";
        char a ='A';

        Scanner scan = new Scanner(System.in);


        System.out.println("input : ");
        String str1= scan.nextLine();
        //nextLine은 엔터를 기반으로 줄띄움을 도와준다.

        /*System.out.println("input : ");
        String str2= scan.nextLine();*/

        System.out.println("input : ");
        int str2= scan.nextInt();



        System.out.println(str1 + "\n" + str2);

        scan.close();


        /*이걸 리터럴이라고 한다.
        System.out.println(a+2);

        //a는 일반적이게 출력이 된다.
        System.out.println(a);*/
    }
}
