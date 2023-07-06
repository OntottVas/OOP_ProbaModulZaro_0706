package address;

import java.util.List;

public class Employees extends Address{
    private String name;
    private final String idNumber;

    private List<Address> addressList;

    public Employees(String name, String idNumber, String country, int zipCode, String street, int number) {
        super(country, zipCode, street, number);
        this.name = name;
        this.idNumber = idNumber;
        this.addressList.add(new Address(country, zipCode, street, number));
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

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
