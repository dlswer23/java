public class for문 {

    public static void main(String args[]){
        int i,sum =0;

        for(i=1;i<=10;i++){
            sum += i;
            System.out.println(i);

            if(i<=9)
            System.out.println("+");
            else{
                System.out.println("=");
                System.out.println(sum);
            }
        }
    }
}
