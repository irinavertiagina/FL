package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Map<Person, Integer> map = new HashMap();
        Person p = new Person(1, "Higgs");
        Person p1 = new Person(1, "Higgs");

        set.add(p);
        set.add(p1);
        map.put(p, 123);
        map.put(p1, 123);
        System.out.println(set);
        System.out.println(map);

    }
}
