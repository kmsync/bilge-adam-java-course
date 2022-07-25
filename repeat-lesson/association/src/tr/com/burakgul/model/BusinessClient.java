package tr.com.burakgul.model;

import java.util.List;

public class BusinessClient extends Client{
    private String companyName;

    private List<Address> addresses;

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
