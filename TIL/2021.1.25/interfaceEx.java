interface PhoneInterface{
    int BUTTONS =20;
    void sendCall();
    void receiveCall();
}

interface MobilePhoneinterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}

interface MP3interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x,int y){
        return x+y;
    }
}


class SmartPhone extends PDA implements MobilePhoneinterface, MP3interface{

    public void sendCall() {System.out.println("전화걸기"); }
    public void receiveCall() {System.out.println("전화받기");}
    public void sendSMS() {System.out.println("SMS보내기");}
    public void receiveSMS() {System.out.println("SMS받기");}

    public void play() {System.out.println("음악 재생");}
    public void stop() {System.out.println("재생중지");}

    public void schedule() {System.out.println("일정관리");}

}
public class interfaceEx{
    public static void main(String []args){
        SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3,5));
        p.schedule();
    }
}
