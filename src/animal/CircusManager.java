package animal;

public class CircusManager {
    public static void main(String[] args) throws NickNameAlreadyExistsException {
        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa", "King");
        Lion scar = new Lion("Scar", "Usurper");

        Seal gerald = new Seal("Gerald", "Easy");
        Seal fluke = new Seal("Fluke");

        Elephant dumbo = new Elephant("Dumbo", "FlyMachine");
        Elephant babar = new Elephant("Babar");

        System.out.println(Animal.getCounter());

        mufasa.noise();
        gerald.noise();
        dumbo.noise();

        mufasa.addNickname("Prince");
        System.out.println(mufasa.getNicknames());

    }
}
