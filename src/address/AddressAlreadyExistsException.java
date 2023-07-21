package address;

public class AddressAlreadyExistsException extends Exception{
    public AddressAlreadyExistsException(String message) {
        super(message);
    }

    public AddressAlreadyExistsException() {
        super("Address already exists");
    }
}
