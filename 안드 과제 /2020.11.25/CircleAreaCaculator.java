public class CircleAreaCaculator {
    public static void main(String[] args){
        //입력값 받기
        int r = Integer.parseInt(args[0]);

        //원의 넓이
        double s =Math.PI*r*r;

        //결과 출력
       System.out.printf("반지름이 %d인 원의 넚이 => %.3f",r, s);

    }
}
