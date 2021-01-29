import java.util.Scanner;

class name2site{

    int reMB;

    name2site(int num2) {
        reMB = num2 * 1024;
    }

    int a(){
        return reMB;

    }
}



public class siteStr {
    Scanner scan = new Scanner(System.in);
    int num1;
    int MB=0;
    siteStr()  { init();}
    void init(){
        System.out.println("GB <-> MB Program");
        num1 = scan.nextInt();

        name2site csStr = new name2site(num1);

        //System.out.println("Convert >> " + csStr.a());

        MB = csStr.a();

       System.out.println( num1 +"기가는"+ MB+ "메가 입니다");
        scan.close();


    }
    public static void main(String[] args) {
        new siteStr();
    }



}

