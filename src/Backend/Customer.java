package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nikhilpalli on 3/19/18.
 */
public class Customer {

    public static int custId;
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

    public static void createCustomer(String firstName, String lastName, String phone, String email, String address, String city, String state, String zip) throws Exception {

        String query = "INSERT INTO CUSTOMER " + "( firstName, lastName, phone, email, address, city, state, zip) VALUES " +
                "(?,?,?,?,?,?,?,?)";

        Connection con = Utilities.getConnection ();
        PreparedStatement ps = con.prepareStatement(query);

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

    public static void findCustomerLastName(String name) throws Exception {

        String query = "SELECT custId FROM CUSTOMER WHERE lastName = ?";

        Connection con = Utilities.getConnection ();

        PreparedStatement ps = con.prepareStatement ( query );

        ps.setString ( 1,name);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            System.out.println ( rs.getString ( 1 ));
        }

    }

    public static void findCustomerPhone(String phone) throws Exception {

        Connection con = Utilities.getConnection ();

        String query = "SELECT custId FROM CUSTOMER WHERE phone = ?";

        PreparedStatement ps = con.prepareStatement ( query );

        ps.setString ( 1,phone );

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            custId = rs.getInt(1);
            System.out.println (custId);
        }

    }
}
