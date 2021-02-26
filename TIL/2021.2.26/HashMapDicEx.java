package week20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
    public static void main(String []args){
        HashMap<String, String>dic = new HashMap<String,String>();

        dic.put("아기","baby");
        dic.put("사랑","love");
        dic.put("사과","apple");

        Set<String> keys = dic.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = dic.get(key);
            System.out.println("("+key+","+ value+")");
        }
        System.out.println();

        //영어 단어를 입력받고 한글 단어 검색
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("찾고 싶은 단어는?");
            String kor = scanner.next();

            String eng = dic.get(kor);
            if(eng == null)
                System.out.println(kor + "는 없는 단어 입니다");

            else
                System.out.println(eng);
            }

        }
    }

