public class Calculation {

    public static void main(String[] args) {
        // 각 과목 점수
        int KoreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;
        double average;

        average = (double)(KoreanScore + mathScore + scienceScore +computerScore)/4;
        System.out.println(average);
    }
}
