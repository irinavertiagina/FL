package lambda;

public class Cat{
    String name;
    int age;
    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}

