package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsCompare {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeset = new TreeSet<>();

        m(hashset);//unordered
        m(linkedSet);//adding order
        m(treeset);//natural order (a->z; 1->99...)

        System.out.println(hashset.contains("Higgs"));//uses heshirovanie HASH
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.hashCode());
    }
    public static void m(Set<String> set){
        set.add("Kek");
        set.add("Keks");
        set.add("Hek");
        set.add("Higgs");
        set.add("Iggs");
        set.add("Irina");

        for(String s : set){
        //    System.out.println(s);
        }
        //System.out.println();
    }


}
