package FinalTest;



class Printer {

    int numOfPapers = 0;

    void print(int amount) {
        numOfPapers = numOfPapers- amount;
    }
}

public class PrinterTest {
    public static void main(String[] args) {

        Printer p = new Printer();
        p.numOfPapers += 100;
        p.print(70);

        System.out.println(p.numOfPapers);


    }
}
