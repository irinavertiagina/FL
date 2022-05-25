package maps;

import java.util.HashMap;
import java.util.Map;

public class DriverMap {
    public static void main(String[] args) {
        Map<Integer, String> dictionary = new HashMap<>();//unordered
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        System.out.println(dictionary);
        System.out.println(dictionary.get(2));

        for(Map.Entry<Integer, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
