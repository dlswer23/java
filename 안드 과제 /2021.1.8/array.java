public class array {

        public static void main(String args[]){

            int intArr[] = new int[5]; // 새로운 배열 선언

            //int intArray[] = {4,3,2,1}; //배열 생성과 값 초기화를 동시에

            intArr[0] = 10;

            int copyArr[] = intArr;

            copyArr[0] = 20;

            System.out.println(intArr[0]);

            //이러면 출력 값은 20이 나온다. 왜냐하면 copy arr가 가장 최근의 배열이기 때문이다.

    }
}
