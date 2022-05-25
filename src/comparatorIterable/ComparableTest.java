package comparatorIterable;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List <Animal> animalList = new ArrayList<>();
        Set<Animal> animalSet = new TreeSet<>();
        populateArray(animalList);
        populateArray(animalSet);
        Collections.sort(animalList);

        System.out.println(animalList);
        System.out.println(animalSet);
    }
    public static void populateArray(Collection collection){
        collection.add(new Animal(1, "Higgs"));
        collection.add(new Animal(73, "Michael"));
        collection.add(new Animal(7, "Alena"));
        collection.add(new Animal(12, "Irina"));

    }
}

class Animal implements Comparable<Animal>{
    int id;
    String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (id != animal.id) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(@NotNull Animal animal) {
        if (this.id > animal.id) return 1;
        else if (this.id < animal.id) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}