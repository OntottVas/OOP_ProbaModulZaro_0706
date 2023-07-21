package animal;

public class NickNameAlreadyExistsException extends Exception{
    public NickNameAlreadyExistsException() {
        super("Nickname already exists.");
    }
}
