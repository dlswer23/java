package week20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class countryQuiz extends store {

    Scanner scan = new Scanner(System.in);

    countryQuiz()
    {
        store.put("멕시코","멕시코시티");
        store.put("스페인","마드리드");
        store.put("프랑스","파리");
        store.put("영국","런던");
    }



    public static void main(String []args){
        countryQuiz cq = new countryQuiz();

        System.out.println("**** 수도 퀴즈 게임을 시작합니다 . ****");
        System.out.println("1:입력 2:게임시작 3:종료");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num){

            case 1 : cq.input();
            break;
            case 2 : cq.start();
            break;
            case 3:
                System.out.println("게임을 종료하셨습니다");
                return;


        }


    }

    private void input(){
        int n = store.size();
        System.out.println("현재"+n+"개 나라와 수도가 입력되어 있습니다");
        n++;

        while(true){
            System.out.println("나라와 수도 입력:" + n + "\n>>");
            String country = scan.next();

            if(country.equals("그만"))
            {
                break;
            }
            String capital = scan.next();

            if(store.containsKey(country)){
                System.out.println(country+ "는 이미 있습니다");
                continue;
            }
            store.put(country, capital);
            n++;
        }
    }

    private void start(){

        Iterator<String> it = keys.iterator();
        for(int i=0;i<store.size();i++){
            String key1 = it.next();
            System.out.println(key1+"의 수도는?");
            System.out.print(">>");


            String b = scan.next();


            String value = store.get(key1);


            if(b.equals(value))
                System.out.println("정답입니당!");

            else
                System.out.println("아닙니당!");
        }





    }
}

class store{

    HashMap<String, String>store = new HashMap<String,String>();
    Set<String> keys = store.keySet();


}