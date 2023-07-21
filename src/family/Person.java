package family;

public class Person {
    private String name;
    private final int yearOfBirth;
    private final Person mother;
    private final Person father;

    public Person(String name, int yearOfBirth, Person mother, Person father) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.mother = null;
        this.father = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Person getMother() throws OrphanException {
        if(this.mother == null) {
            throw new OrphanException();
        } else {
            return mother;
        }
    }

    public Person getFather() throws OrphanException{
        if(this.father == null) {
            throw new OrphanException();
        } else {
            return father;
        }
    }

    public void getParents() throws OrphanException, SingleParentException{
        if (this.mother == null || this.father == null) {
            throw new SingleParentException();
        } else if (this.mother == null && this.father == null) {
            throw new OrphanException();
        } else {
            System.out.println(this.father.name + " - " + this.mother.name);
        }
    }
}
