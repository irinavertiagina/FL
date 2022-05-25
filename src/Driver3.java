import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {}




interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}

//class Word implements WordDocument {}



interface Perishable1 {
    default int maxDays() {
        return 1;
    }
}

interface Perishable2  {
    default int maxDays() {
        return 2;
    }
}
class Milk implements Perishable2, Perishable1 {
    @Override
    public int maxDays() {
        return Perishable2.super.maxDays();
    }
}

interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}
class Super {
    public String num = "10"; //Line n1
}

class Sub extends Super {
      public String num = "20"; //Line n2
}

public class Driver3   {

     public static void main(String[] args) {
         //M obj1 = new MyClass();
        // obj1.log(); //Line n1

//         A obj2 = new MyClass();
//         obj2.log(); //Line n2
//
//         MyClass obj3 = new MyClass();
//         obj3.log(); //Line n3
//
//         Perishable1 obj = new Milk();
//         System.out.println(obj.maxDays());

         Super obj = new Sub();
         System.out.println(obj.num += 2); //Line n3



     }
}





