package address;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private String name;
    private final String idNumber;
    private final List<Address> addressList;

    public Employees(String name, String idNumber, List<Address> addressList) {
        this.name = name;
        this.idNumber = idNumber;
        this.addressList = addressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void addAddress(Address address) throws AddressAlreadyExistsException{
        if (!addressList.contains(address)) {
            this.addressList.add(address);
        } else {
            throw new AddressAlreadyExistsException();
        }
    }

    public void removeAddress(Address address) throws AddressNotFoundException {
        if (addressList.contains(address)) {
            this.addressList.remove(address);
        } else {
            throw new AddressNotFoundException();
        }
    }
}
