package week17;

public class practice2 {
    public static void main(String []args){
        String os = System.getProperty("os.name");
        String name = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String dir = System.getProperty("user.dir");
        String jv = System.getProperty("java.version");

        System.out.println("O/S : "+ os);
        System.out.println("USER : "+ name);
        System.out.println("VERSION : "+ jv);
        System.out.println("HOME : "+ home);
        System.out.println("LOCATION : "+ dir);

    }
}
