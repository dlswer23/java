import java.sql.SQLOutput;

abstract class Calc {
    public abstract int add(int a, int b);

    public abstract int substract(int a, int b);

    public abstract double average(int[] a);
}
class GoodCalc extends Calc{

      public int add(int a,int b) {
           return a+b;
          //void show(); {System.out.println(add);}
      }

      public int substract(int a,int b) {
          return a-b;
          //void show(); {System.out.println(substract);}
      }

      public double average(int[] a) {
          double ave = 0;
          for(int k : a) ave+=k;
          return ave/a.length;
         // void show(); {System.out.println(average);}
      }

  }
public class Calculator {
    public static void main(String[] args) {

        GoodCalc ab = new GoodCalc();
        int n[] = {1,2,3,4};

        System.out.println(ab.add(2, 3));
        System.out.println(ab.substract(4,2));
        System.out.println(ab.average(new int[]{1,2,3,4}));

    }

}