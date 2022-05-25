package lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Driver3 {

    public static void main(String[] args) {


        List<Cat> catList = new ArrayList<>(){};
        catList.add(new Cat("Keks", 7));
        catList.add(new Cat("Iks", 5));
        catList.add(new Cat("Higgs", 17));
        catList.add(new Cat("Twin Peaks", 74));
        catList.add(new Cat("Fix", 67));

        Predicate<Cat>predicate = cat1 -> cat1.getAge()>=8;

        for(Cat c : catList){
            if (predicate.test(c))
                System.out.println(c+" \n");
        }

    }
}
