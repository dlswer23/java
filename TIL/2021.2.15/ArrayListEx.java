package week19;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx{
    public static void main(String args[]){
        //문자열 삽입가능한 ArrayList  컬렉션 생성
        ArrayList<String> a = new ArrayList<String>();

        //키보드로부터 4개의 이름을 입력받아 arrayList 생성
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("이름을 입력하세요 >> ");
            String s = scanner.next();
            a.add(s);
        }

        //ArrayList에 들어있는 모든 이름 출력
            for(int i=0;i<a.size();i++){
                String name = a.get(i);
                System.out.println(name + " ");
            }

            //가장 긴 이름 출력
            int longindex = 0;
            for(int i=1;i<a.size();i++){
                if(a.get(longindex).length() < a.get(i).length())
                longindex = i;
            }
             System.out.println("\n가장 긴 이름은 : "+ a.get(longindex));


    }

}
