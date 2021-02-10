package week18;

import javax.swing.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class practice {
    Scanner scan = new Scanner(System.in);
    Vector<Member> v = new Vector<Member>();

    public static void main(String[] args) {

        new practice();

    }

    practice() {
        Start();
    }

    void Start() {
        while (true) {
            System.out.println("1:추가 2:삭제 3:검색 4:목록 5:종료");
            System.out.print("input >> ");


            int a = scan.nextInt();
            switch (a) {
                case 1:
                    AddMember();
                    break;
                case 2:
                    RemoveMember();
                    break;
                case 3:
                    SearchMember();
                    break;
                case 4:
                    ListMember();
                    break;
                case 5:
                    return;
            }

        }
    }


    void AddMember() {

        int num = 0;
        String name = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("번호 :");
        num = scan.nextInt();

        scan.nextLine();

        System.out.print("이름 :");
        name = scan.nextLine();


        Member member = new Member(num, name);
        v.add(member);
        System.out.println(name + "님 회원가입이 완료되었습니다");


    }

    void RemoveMember() {

        System.out.print("삭제하고 싶은 회원 번호:");
        int move  = scan.nextInt();

        for (int i = 0; i < v.size(); i++) {
            Member member = v.get(i);
            if (move == member.getNum())  {
               v.remove(member);
            } else {
                System.out.println("삭제 할 회원이 없습니다. ");
            }
        }



    }


    void SearchMember() {
        //원하는 멤버 찾기
        System.out.print("찾고 싶은 회원 번호:");
        int sel = scan.nextInt();

        for (int i = 0; i < v.size(); i++) {
            Member member = v.get(i);
            if (member.getNum() == sel) {
                System.out.println("회원번호: " + member.getNum() + "\n회원이름: " + member.getName());
            } else {
                System.out.println("존재하지 않는 회원입니다. ");
            }
        }


    }

    void ListMember() {

        //다 출력하기
        System.out.println("회원목록");
        for (int i = 0; i < v.size(); i++) {
            Member all = v.get(i);
            System.out.println("회원번호: " + all.getNum() + ", 회원이름: " + all.getName());
        }

    }


}

class Member {
    private int num;
    private String name;

    public Member(int num, String name) {
        this.num = num;
        this.name = name;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

}