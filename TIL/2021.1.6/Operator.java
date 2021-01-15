public class Operator {

    public static void main(String args[]){

        //대입 연산
        int a=0;
        a+=3;
        a-=3; // a=a-3;
        a*=3;
        int b=a+3;

        //증감연산자

        int app,apw=4;
        app = apw++;
        //apw가 app에 대입된 후 apw가 증가 된다. 그러면 app는 4,apw는 5가 된다.
        app = ++apw;
        //apw가 먼저 증가한 후에 apw에 대입이 된다. 그러면 app는 5,apw 5가 된다.도


        System.out.println(a);
        System.out.println(b);
    }
}
