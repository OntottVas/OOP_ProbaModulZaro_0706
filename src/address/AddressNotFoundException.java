package address;

public class AddressNotFoundException extends Exception{
    public AddressNotFoundException(String message) {
        super(message);
    }

    public AddressNotFoundException() {
        super("Address cannot be found in the list");
    }
}
