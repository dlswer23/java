 package week19;


import javax.swing.*;
import java.util.*;


 public class GradeOut2 extends store {

     GradeOut2() {
         run();

     }

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        new GradeOut2();
    }




    void input() {


        System.out.println("학생수 입력" + "\n" + ">>");

        int num = scan.nextInt();

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요" + "\n" + ">>");

        String name, department, number;


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

                store.put(name,s);

                //System.out.println("이름: " + name + "\n" + "학과: " + department + "\n"+ "학번: "+ number + "\n"+ "학점 평균: " + Avg);


            }

        }
    }

    void run() {


        while(true) {

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
    }



    void Search() {

        System.out.println("찾고싶은 회원 : ");

        String Searchname = scan.next();

        Student s = store.get(Searchname);

       if(s==null){
            System.out.println("존재하지 않는 회원입니다. ");

        } else {
            System.out.println("-------------------------------");
            System.out.println(s);


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

    public String toString() {
        return "이름: " + name + "\n" + "학과: " + department + "\n" + "학번: " + number + "\n" + "학점 평균: " + Avg;
    }

}

 class store{

     HashMap<String, Student> store = new HashMap<String,Student>();
     Set<String> keys = store.keySet();


 }
