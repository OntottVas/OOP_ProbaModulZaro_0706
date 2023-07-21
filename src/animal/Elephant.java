package animal;

import java.util.HashSet;
import java.util.List;

public class Elephant extends Animal{

    public Elephant(String name) {
        super(name);
    }

    public Elephant(String name, String nickname) {
        super(name, new HashSet<>(List.of(nickname)));
    }

    public void noise(){
        System.out.println("Louder than a trumpet");
    }
}
