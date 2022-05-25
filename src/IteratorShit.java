import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorShit {

    public static void  main(String [] args) {

        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> fc = dryFruits.iterator();
        while(fc.hasNext()) {
            String dryFruit = fc.next();
            if(dryFruit.startsWith("A")) {
                fc.remove();
            }
        }

        System.out.println(dryFruits);




        List<Cal> dryCals = new ArrayList<>();
        dryCals.add(new Cal(1));
        dryCals.add(new Cal(1));
        dryCals.add(new Cal(3));

       Iterator<Cal> caliterator = dryCals.iterator();

        while(caliterator.hasNext())
            System.out.println(caliterator.next());



    }}

class Cal{
    int number;
    Cal(int num){
        number = num;
    }

}
