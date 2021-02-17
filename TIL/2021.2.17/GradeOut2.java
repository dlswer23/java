package week19;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class GradeOut2 {

    Scanner scan = new Scanner(System.in);
    ArrayList<Student> manage = new ArrayList<Student>();


    public static void main(String[] args) {
        new GradeOut2();
    }

    GradeOut2() {
        run();

    }


    void input() {


        System.out.println("학생수 입력" + "\n" + ">>");

        int num = scan.nextInt();

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요" + "\n" + ">>");

        String name, department, number, Average;


        for (int b = 0; b < num; b++) {

            String str = scan.next();

            if (str.equals("그만")) {
                return;

            } else {

                StringTokenizer st = new StringTokenizer(str, ",");
                name = st.nextToken();
                department = st.nextToken();
                number = st.nextToken();
                double Avg = Double.parseDouble(st.nextToken());

                Student s = new Student(name, department, number, Avg);

                manage.add(s);

                //System.out.println("이름: " + name + "\n" + "학과: " + department + "\n"+ "학번: "+ number + "\n"+ "학점 평균: " + Avg);


            }

        }
    }

    void run() {


        System.out.println("1. 회원등록 2. 회원목록  3. 종료");

        int a = scan.nextInt();
        switch (a) {
            case 1:
                input();
                break;
            case 2:
                Search();
                break;
            case 3:
                return;
            default:
                System.out.println("error");


        }
    }



    void Search() {



       if(){
            System.out.println("존재하지 않는 회원입니다. ");

        } else {
            System.out.println("-------------------------------");
            System.out.println("이름: " + name + "\n" + "학과: " + department + "\n" + "학번: " + number + "\n" + "학점 평균: " + Average);


        }
    }
}





class Student {


    //이름
    String name;
    //학번
    String number;
    //학과
    String department;
    //평균
    Double Avg;

    public Student(String name,String number,String department,Double Avg) {
        this.name = name;
        this.number = number;
        this.department = department;
        this.Avg = Avg;
    }
    String getName() {
        return name;
    }

}
