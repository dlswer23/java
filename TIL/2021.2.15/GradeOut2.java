package week19;

import java.util.ArrayList;
import java.util.Scanner;

import static jdk.internal.vm.PostVMInitHook.run;

public class GradeOut2 {

    Scanner scan = new Scanner(System.in);
    ArrayList<Student> manage = new ArrayList<Student>();

    public static void main(String[] args) {
        new GradeOut2();
    }

    GradeOut2() {
        run();

    }
}

//1. 회원등록 2. 회원목록  3. 종료

run(){

    int a;
    System.out.println("1. 회원등록 2. 회원목록  3. 종료");

    switch(a){
        case 1 :
    }

    String name = scan.next();




}

