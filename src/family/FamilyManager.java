package family;

public class FamilyManager {
    public static void main(String[] args) throws SingleParentException, OrphanException {
        Person tibee = new Person("Tibor",1935);
        Person margit = new Person("Gitta", 1936);
        Person jozsee = new Person("Jozsi", 1940);
        Person erzsee = new Person("Erzsi", 1941);
        Person judit = new Person("Judit", 1964, margit, tibee);
        Person mikee = new Person("Miklos", 1968, erzsee, jozsee);
        Person geree = new Person("Geri", 1994, judit, mikee);

        geree.getParents();
        mikee.getParents();
        judit.getParents();
    }
}
