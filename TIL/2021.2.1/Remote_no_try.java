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
    void setVol(String vol);

}

class reControl implements RemoteInterface{
    Scanner scan = new Scanner(System.in);

    public void turnOn() {System.out.println("turn On TV");}
    public void turnOff() {System.out.println("turn Off TV");}
    public void setVol(String volume)
    {

        int vol = Integer.parseInt(volume);

        if( vol > MAX_VOL){
            vol = MAX_VOL;
        }
        else if(vol < MAX_VOL){
            vol=MIN_VOL;
        }

        System.out.println("TV Volume: "+ vol);
    }

    void run() {
        System.out.println(View);
        String remote;
        while (true){
            System.out.println("Control Your TV >> ");
            remote = scan.next();

            if(remote.equals("OFF"))
            {
                turnOff();
                break;
            }
            else if(remote.equals("ON")) turnOn();
            else setVol(remote);
        }
    }
    reControl(){run();}
}

public class Remote_no_try {
    public static void main(String []args){
        new reControl();
        String volume = "123";
        int vol = Integer.parseInt(volume); //123

    }
}

