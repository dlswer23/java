import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.InputMismatchException;
import java.util.Scanner;

interface RemoteInterface{
    int MAX_VOL=100;
    int MIN_VOL=0;
    String View = "ON: turn On Tv\n"+"OFF: turn OFF Tv\n"+"(1~100): Set Volum\n";
    void turnOn();
    void turnOff();
    void setVol(int vol);

}

class reControl implements RemoteInterface{
    Scanner scan = new Scanner(System.in);

    public void turnOn() {System.out.println("turn On TV");}
    public void turnOff() {System.out.println("turn Off TV");}
    public void setVol(int vol){
        if(vol>MAX_VOL){
            vol = MAX_VOL;
    }
        else if(vol<MAX_VOL){
            vol=MIN_VOL;
        }

    System.out.println("TV Volume: "+vol);
}

void run() {
    System.out.println(View);
    int remote = 0;
    String remotes;
    while (true) {
        System.out.print("Control Your TV >> ");
        try{
            remote = scan.nextInt();
        }
        catch (InputMismatchException e){
            remotes = scan.next();
            if(remotes.equals("ON")) turnOn();
            else if(remotes.equals("OFF"));
            }
        }
    }
    reControl(){run();}
}

public class Remote_no_try {
    public static void main(String []args){ new reControl();

    }
}

