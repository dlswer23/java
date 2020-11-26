public class LeapYear {
    public static void main(String[] args) {

        //입력값 받기
        int input = Integer.parseInt(args[0]);

        //윤년 여부 계산
        boolean output = isLeapYear(input);

        //출력하기
        System.out.printf("%d는 윤년입니까? %s", input, output);
    }

    public static boolean isLeapYear(int year) {

        //변수 생성
        boolean result = false;

        //조건문 처리
        if ((year % 4) == 0) {
            result = true;

            if ((year % 100) == 0) {
                result = false;

                if ((year % 1000) == 0) {
                    result = true;

                }
            }
        }

        //결괏값 반환
        return result;

    }
}