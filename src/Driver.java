import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Driver {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Hegg"));
        catList.add(new Cat("Higg"));
        catList.add(new Cat("Higgs"));
        catList.add(new Cat("Kek"));


        Predicate<Cat> myPredicate = cat -> cat.name.equals("Higgs");
        if(myPredicate.test(catList.get(1)))
            System.out.println(true);
        else System.out.println(false);
//simple iteratiion
//        Iterator<Cat> myIterator = catList.iterator();
//        while (myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }





    }
}
class Cat{
    String name;
    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
