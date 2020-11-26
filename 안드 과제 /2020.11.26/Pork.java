public class Pork {
   public static void main(String []args) {
      int num = 3; //3인분
      double result = calculate(num); //메소드로 칼로리 계

      System.out.printf("삼겹살 %d인분 : %2.f kcal", num, result);
   }
      public static double calculate(int n) {
         int gram = n * 180;
         double kcal = gram * 5.179;
         return kcal;
      }
}

