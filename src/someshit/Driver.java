package someshit;

import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
        Kiska kiska = new Kiska("Kiska", 8);
        Kiska higgs = new Kiska("Kiska", 8);
        System.out.println(kiska == higgs);
        System.out.println(kiska.equals(higgs));
    }
}

class Kiska{
    String name;
    int id;

    public Kiska(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kiska)) return false;
        Kiska kiska = (Kiska) o;
        return id == kiska.id && Objects.equals(name, kiska.name);
    }

}