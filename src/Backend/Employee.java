package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nikhilpalli on 3/19/18.
 */
public class Employee {

    int empId;
    int pin;
    public static String firstName;
    String lastName;
    String title;
    boolean isAdmin;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public static boolean isEmployee(int empId, int pin ) throws SQLException {

        boolean isEmployee = false;

        try {
            Connection con = Utilities.getConnection ();

        PreparedStatement stmt = con.prepareStatement
                ( "SELECT empId FROM EMPLOYEE WHERE pin = ?" );
        stmt.setInt(1, pin) ;

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                if(rs.getInt (1) == empId)
                isEmployee = true;
            }

        }catch(Exception e){

            System.out.println (e);

        }

        finally {

            Utilities.connection.close ();
        }

        return isEmployee;
    }

    public static void getUserName(int empId) throws SQLException {

        try {
            Connection con = Utilities.getConnection ();

            PreparedStatement stmt = con.prepareStatement
                    ( "SELECT firstName FROM EMPLOYEE WHERE empId = ?" );
            stmt.setInt(1, empId) ;

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                    firstName = rs.getString ( 1 );
            }

        }catch(Exception e){

            System.out.println (e);

        }

        finally {

            Utilities.connection.close ();
        }

    }
}
