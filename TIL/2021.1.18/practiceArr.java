public class practiceArr {

    static void printCharArray(char c[]) {


        for (int i = 0; i < c.length; i++) {

            System.out.print(c[i]);
        }
        System.out.print('\n');

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i] = ',';
                System.out.print(c[i]);
            } else {
                System.out.print(c[i]);
            }
        }

    }

    public static void main(String[]args){
        char c[] =  {'A',' ','p','p','l','e'};
        printCharArray(c); //문자 배열을 출력시켜주는 메소드

        System.out.println();

    }


}
