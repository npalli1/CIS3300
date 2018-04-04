package GUI;

import Backend.Customer;
import Backend.Employee;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.sql.SQLException;

/**
 * Created by nikhilpalli on 3/27/18.
 */
public class Login {

    public static Scene displayLogin(){

        Label welcomeLabel = new Label ( "Welcome" );
        welcomeLabel.setStyle ( "-fx-font-size: 24pt" );
        Label userIdLabel = new Label ( "User Id: " );
        TextField userIdTextField = new TextField ();
        Label pinLabel = new Label ( "Pin: " );
        TextField pinTextField = new TextField ();
        Button login = new Button ( "Login" );
        Button forgotPin = new Button ( "Forgot Password" );

        GridPane welcomeGrid = new GridPane ();

        GridPane.setConstraints ( welcomeLabel, 0, 0 );
        GridPane.setConstraints ( userIdLabel, 0, 1 );
        GridPane.setConstraints ( userIdTextField, 1, 1 );
        GridPane.setConstraints ( pinLabel, 0, 2 );
        GridPane.setConstraints ( pinTextField, 1, 2 );
        GridPane.setConstraints ( login, 0, 3 );
        GridPane.setConstraints ( forgotPin, 1, 3 );

        welcomeGrid.getChildren ().addAll ( welcomeLabel, userIdLabel, userIdTextField, pinLabel, pinTextField, login, forgotPin );
        welcomeGrid.setVgap ( 25 );
        welcomeGrid.setHgap ( 25 );
        welcomeGrid.setPadding ( new Insets ( 50 ) );
        welcomeGrid.setAlignment ( Pos.CENTER );

        Scene start = new Scene ( welcomeGrid, 1600, 1000 );

        login.setOnAction ( e -> {
            try {
                boolean isEmp = Employee.isEmployee
                        (Integer.parseInt (userIdTextField.getText ()),Integer.parseInt (  pinTextField.getText ()) );
                if(isEmp == true) {
                    System.out.println ( "You are logged in!!!" );
                    Employee.getUserName ( Integer.parseInt ( userIdTextField.getText () ));
                    Home.displayHome ();


                }
                else{
                    Alert alert = new Alert( Alert.AlertType.ERROR);
                    alert.setTitle ( "Warning" );
                    alert.setHeaderText ( "Invalid Input!" );
                    alert.setContentText ( "Please Enter Correct Username and Password" );
                    alert.showAndWait ();
                    System.out.println ("You are not logged in :(");
                }
            } catch (SQLException e1) {
                e1.printStackTrace ();
            }
        } );

        return start;

    }
}
