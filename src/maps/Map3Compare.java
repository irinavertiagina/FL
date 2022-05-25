package maps;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map3Compare {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        m(hashmap);//unordered
        m(linkedHashMap);//order by adding
        m(treeMap);//natural order(ordering by key)

    }

    public static void m(Map<Integer, String> map){
        map.put(22, "Irina");
        map.put(6, "Higgs");
        map.put(50, "Oleg");
        map.put(55, "Sasha");
        map.put(60, "Mike");
        map.put(0, "Oystein");

        for(Map.Entry<Integer, String> var : map.entrySet()){
            System.out.println(var.getKey() +" "+var.getValue());
        }

    }
}
