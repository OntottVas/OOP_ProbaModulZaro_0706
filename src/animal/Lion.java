package animal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    public Lion(String name, String nickname){
        super(name, new HashSet<>(List.of(nickname)));
    }

    public void noise(){
        System.out.println("Here kitty kitty");
    }
}
