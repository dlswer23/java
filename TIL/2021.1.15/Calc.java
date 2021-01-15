public class Calc {


    int num1;
    int num2;

    public int add(){
        return num1+ num2;
    }

    public int minus(){
        return num1 - num2;
    }

    public int mul(){
        return num1 * num2;
    }


    public int divid(){
        return num1 /num2;
    }


    public Calc(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }



}
