package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String []args){
        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("Java",2);
        map.put("Spring",1);

        map.remove("Spring",1);

        System.out.println(map);
    }
}
