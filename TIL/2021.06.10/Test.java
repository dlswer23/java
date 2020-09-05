package BasicArray;

import java.util.ArrayList;

public class Test {
    public static void main(String []args){
        ArrayList<Character> d = new ArrayList<>();

        d.add('a');
        d.add('b');
        d.add('c');
        d.remove(1);

        System.out.println(d);
    }
}
