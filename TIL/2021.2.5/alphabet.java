package week16;

public class alphabet {
    public static void main(String[]args){
        for(int i=1;i<=97;i++){
            char ch = (char)((Math.random() * 26)+97);
            System.out.print(ch);
        }
    }
}
