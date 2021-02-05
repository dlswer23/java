package week16;

import java.util.Random;

public class CNND {
    private int NumberLen = 4;
    int excute() {
        Random rd = new Random();

        int range = (int) Math.pow(10, NumberLen);
        int start = (int) Math.pow(10, NumberLen - 1);
        int CertNumber = rd.nextInt(range) + start;

        if (CertNumber > range) CertNumber -= start;
        return CertNumber;
    }

    void excute_void() {
        Random rd = new Random();

        int range = (int) Math.pow(10, NumberLen);
        int start = (int) Math.pow(10, NumberLen - 1);
        int CertNumber = rd.nextInt(range) + start;

        if (CertNumber > range) CertNumber -= start;
        System.out.println(CertNumber);
    }

    String excute_str() {
        Random rd = new Random();

        int range = (int) Math.pow(10, NumberLen);
        int start = (int) Math.pow(10, NumberLen - 1);
        int CertNumber = rd.nextInt(range) + start;

        if (CertNumber > range) CertNumber -= start;
        return String.valueOf(CertNumber);
    }

    public int getNumLen(){ return NumberLen; }
    public void setNumberLen(int NumLen) {this.NumberLen = NumLen;}

    public static void main(String []ar){
        CNND cn = new CNND();
        cn.setNumberLen(6);
        System.out.println(cn.getNumLen()+"개: "+cn.excute());

    }
}
