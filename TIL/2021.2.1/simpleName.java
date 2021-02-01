import java.util.Scanner;

public class simpleName {

    public static void main(String[]args){

        String site;
        String name;

        Scanner scanner = new Scanner(System.in);

        site = scanner.next();

        String a[] = site.split("");

        if(a[4].equals("s")){
            name = site.substring(12);
            name = name.replace(".com","");
            System.out.println(name);
        }

        if(a[4].equals(":")){
            name = site.substring(11);
            name = name.replace(".com","");
            System.out.println(name);
        }

        scanner.close();

        /*String x = site.substring(12);

        x =  x.replace(".com","");

        System.out.println("output : " + x );*/



    }
}
