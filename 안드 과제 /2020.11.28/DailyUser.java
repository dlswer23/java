public class DailyUser {
    public static void main(String[] args) {

        int[] counts = {518, 512, 527, 495, 423, 141, 236};

        double result = averge(counts);

        //결과 출력
        System.out.printf("하루 평균 사용자 : %.2f", args);
    }
        public static double averge(int[]arr){
        double sum =0;
        for(int i =0;i< arr.length;i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;


        //결과값 반환
       return avg;
    }
}
