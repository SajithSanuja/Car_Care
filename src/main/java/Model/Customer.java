package Model;

public class Customer {
    public String cid;
    public String name;
    public int phone;
    public String email;
    public String address;

    public Customer(String cid, String name, int phone, String email, String address) {
        this.cid = cid;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
