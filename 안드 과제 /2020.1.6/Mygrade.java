import java.util.Scanner;

public class Mygrade {

    public static void main(String args[]){

        System.out.println("점수를 입력하시오");

        Scanner scan  = new Scanner(System.in);

        int score = scan.nextInt();
        char grade = 'a';

        /*if(score>=90){

            System.out.println("A");
        }
        else if(score >= 80 && score < 90){
            System.out.println("B");
        }
        else if(score >= 70 && score < 80){
            System.out.println("C");
        }
        else if(score >= 60 && score < 70){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }*/

        if(score >= 90){
            grade ='A';
        }
        else if(score >= 80){
            grade = 'B';
        }
        else if(score >= 70){
            grade ='C';
        }

        System.out.println("점수는 " + score + "입니다");
        System.out.println("등급은 "+grade+"입니다");


        scan.close();

    }
}
