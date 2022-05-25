public class driver {
    public static void main(String[] args) {
C c = new C();
int a = c.id;
        System.out.println(a);
        c.m();

    }
}
class F{
    int id=0;
    public void m(){
        System.out.println("par");
    }
}
class C extends F{
    int id=1;
    @Override
    public void m(){
        System.out.println(id+"child");
    }

}