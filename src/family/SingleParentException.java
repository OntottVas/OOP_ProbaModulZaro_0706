package family;

public class SingleParentException extends Exception{
    public SingleParentException() {
        super("Only one parent is known.");
    }
}
