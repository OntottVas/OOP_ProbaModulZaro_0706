package animal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Animal {
    private final String name;
    private final Set<String> nicknames;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        this.nicknames = new HashSet<>();
        counter++;
    }

    public Animal(String name, Set<String> nicknames){
        this.name = name;
        this.nicknames = nicknames;
        counter++;
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getNicknames() {
        return this.nicknames;
    }

    public int getCounter() {
        return counter;
    }

    public void addNickname(String nickname) throws NickNameAlreadyExistsException {
        if (this.nicknames.contains(nickname)) {
            throw new NickNameAlreadyExistsException();
        } else {
            this.nicknames.add(nickname);
        }
    }

    public abstract void noise();
}
