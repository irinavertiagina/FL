package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {


    Cat cat = new Cat(1);
    Cat cat1 = new Cat(2);
    Cat cat2 = new Cat(3);
    Cat cat3 = new Cat(4);

    Queue<Cat> cats = new ArrayBlockingQueue<>(10);
    cats.add(cat3);
        cats.add(cat1);
        cats.add(cat);
        cats.add(cat2);
        System.out.println(cats.remove());//remove
        System.out.println(cats.peek());//do not remove
        System.out.println(cats);
}}
class Cat{
    int id;

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }
}
