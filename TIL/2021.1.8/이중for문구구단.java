public class 이중for문구구단 {
    public static void main(String args[]){

        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){

                System.out.println(i+"*"+j+"=" +i*j);
                System.out.println("\t");
            }

            System.out.println();
            //한 단이 끝나면 다음 줄로 커서 이동
        }
    }
}
