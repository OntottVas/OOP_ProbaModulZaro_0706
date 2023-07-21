package animal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Seal extends Animal{
    public Seal(String name) {
        super(name);
    }

    public Seal(String name, String nickname) {
        super(name, new HashSet<>(List.of(nickname)));
    }

    public void noise(){
        System.out.println("Barking of the sea");
    }
}
