public class changetemp {
    public static void main(String []args){

        //문자열을 정수로 반환 "123" =>  123
        //int a = Integar.parseInt (args[0]);
        //문자열을 실수로 반환 "3.14" =>  3.14
        //double b=DoubleparseDouble(args[1]);
        int a= Integer.parseInt(args[0]);

        double b =Double.parseDouble(args[1]);

        System.out.println(a+b);

    }
}
