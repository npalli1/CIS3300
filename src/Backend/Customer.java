package Backend;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by nikhilpalli on 3/19/18.
 */
public class Customer {

    private int custId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private int zip;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public static void createCustomer(String firstName, String lastName, String phone, String email, String address, String city, String state, String zip) throws SQLException {

        String query = "INSERT INTO users " + "(firstName, ,lastName, phone, email, address, city, state, zip) VALUES " +
                "(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = Utilities.connection.prepareStatement(query);

        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setString(3, phone);
        ps.setString(4, email);
        ps.setString(5, address);
        ps.setString(6, city);
        ps.setString(7, state);
        ps.setString(8, zip );

        ps.execute ();

    }
}
