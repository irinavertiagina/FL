package sets;

import java.util.HashSet;
import java.util.Set;

public class setUnion {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i <10; i++){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 5; i <17; i++){
            set2.add(i);
        }
        // set1.addAll(set2); // union
        // set1.retainAll(set2); //intersection
        set1.removeAll(set2); //difference
        System.out.println(set1);
    }
}
