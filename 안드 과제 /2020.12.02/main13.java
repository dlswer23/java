 import java.util.Scanner;

    public class main13{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String num = sc.nextLine();
            //입력받은 두 숫자를 " "으로 구분해서 배열에 넣는다
            String [] str = num.split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a+" "+b);
        }
    }




