package week15;

import java.util.Random;

class CertNumber {
    int a;
    int b;

    void setNumLen(int a) {
        this.a = a;
    }

    int getNumLen() {
        return a;
    }

    int excute() {
        
        int NumLen = 5;

        Random rd= new Random();


        b = (int) Math.pow(a,NumLen);
        return b;
    }

}

public class Powlotto {


    public static void main(String []args){
        CertNumber cn = new CertNumber();
        cn.setNumLen(4);
        System.out.println(cn.getNumLen()+"개: "+ cn.excute());
    }
}
