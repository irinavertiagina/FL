package comparatorIterable;



import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("catty");
        animals.add("bird");
        animals.add("dog");
        animals.add("rhinocdrator");
        animals.add("predator");
        animals.add("carnivore");

        System.out.println(animals);
        Collections.sort(animals);//sort by natural order
        System.out.println(animals);
        Collections.sort(animals, new StringLenghtComparator());
        System.out.println(animals);

        ///////////

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(44);
        numbers.add(66);
        numbers.add(83);
        numbers.add(0);
        numbers.add(999);

        System.out.println(numbers);//not sorted original
        Collections.sort(numbers);
        System.out.println(numbers);//natural order
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer < t1) {
                    return 1;
                } else if (integer > t1) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(numbers);

        ////////////comparator with non wrapper class///////////
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(2, "Higgs"));
        personList.add(new Person(4, "Irina"));
        personList.add(new Person(1, "John"));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                if(person.id > t1.id) return 1;
                else if (person.id < t1.id) return -1;
                else return 0;
            }
        });
        System.out.println(personList);
    }//main
}//class


//replaced with anonimous class
//class myIntegerComparator implements Comparator<Integer>{
//    //this is a @functionalInterface
//    //this is parametrized <T> interface
//    @Override
//    public int compare(Integer integer, Integer t1) {
//      if(integer < t1){return 1;}
//      else if(integer > t1 ){return -1;}
//      else return 0;
//    }
//}
class StringLenghtComparator implements Comparator<String>{
    //this is a @functionalInterface
    //this is parametrized <T> interface

    @Override
    public int compare(String o, String t1) {
       if(o.length() > t1.length()){return 1;}
       else if (o.length() < t1.length()){return -1;}
       else return 0;
    }
}
