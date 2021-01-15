public class GuGuDan {
    public static void main(String[] args) {
        printGuGuDan();
    }
        public static void printGuGuDan(){
            for (int i = 2; i <= 9; i++) {
                printDan(i);
            }
        }
        public static void printDan(int Dan){
            System.out.printf("%d단 \n", Dan);
            for (int i = 1; i < 10; i++) {

                System.out.printf("\t");
                System.out.printf("%d * %d = %d", Dan, i, Dan);

            }
        }
    }

