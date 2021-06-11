package Generic;

public class GenericClassDemo {
    public static void main(String []args){
        Cup cup = new Cup();

        cup.setBeverage(new Boricha());

        cup.setBeverage(new Beer());

        Beer b1 = (Beer) cup.getBeverage();

        Boricha b2 = (Boricha) cup.getBeverage();
    }
}
