package sample;

import java.sql.*;

/**
 * Created by nikhilpalli on 2/19/18.
 */
public class Utilities {

    public static final String user = "nikhil";
    public static final String passwd = "1234";
    public static Connection connection;


    public static Connection getConnection() throws Exception{

        try{

            connection = DriverManager.getConnection ( "jdbc:mysql://35.231.10.84/CIS3300", user, passwd );


            System.out.println("connection successful");
            return connection;

        }
        catch (Exception e){
            System.out.println (e);
        }

        return null;
    }

    public static void createTable(String createQuery) throws Exception{

        try {
            Connection conn = getConnection ();
            PreparedStatement create = conn.prepareStatement (createQuery);
            create.executeUpdate ();


        }
        catch (Exception e){
            System.out.println (e);
        }
        finally {
            connection.close ();
        }
    }

    public static ResultSet createStatement(String query) throws Exception{

        Connection conn = Utilities.getConnection ();
        PreparedStatement stmt = conn.prepareStatement ( query );

        try {
        stmt.execute ();

            ResultSet rs = stmt.executeQuery ( query );

            if (rs.next()) {
             return rs;
            }

        }catch(Exception e){

            System.out.println (e);

        }

        finally {
            conn.close ();
        }

        return null;
    }
}
