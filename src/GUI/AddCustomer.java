package GUI;

import Backend.Customer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by nikhilpalli on 4/4/18.
 */
public class AddCustomer {

    public static void displayManageCustomers() {

        Stage stage = new Stage ();

        Label title = new Label("Add Customer");
        title.setFont ( new Font ( "Helvetica", 36 ) );
        Label fNameLabel = new Label ( "First Name" );
        Label lNameLabel = new Label ( "Last Name" );
        Label phoneLabel = new Label ( "Phone Number" );
        Label emailLabel = new Label ( "Email" );
        Label addressLabel = new Label ( "Address" );
        Label cityLabel = new Label ( "City" );
        Label stateLabel = new Label ( "State" );
        Label zipLabel = new Label("Zipcode");
        TextField fNameTextField = new TextField ();
        TextField lNamTextField = new TextField ();
        TextField phoneTextField = new TextField ();
        TextField emailTextField = new TextField ();
        TextField addressTextField = new TextField ();
        TextField cityTextField = new TextField ();
        TextField stateTextField = new TextField ();
        TextField zipTextfield = new TextField ();

        Button back = new Button ( "Back" );
        Button add = new Button ( "Add Customer" );

        GridPane gp = new GridPane ();

        GridPane.setConstraints ( title,0,0 );
        GridPane.setConstraints ( fNameLabel,0,1 );
        GridPane.setConstraints ( fNameTextField,1,1 );
        GridPane.setConstraints ( lNameLabel,0,2 );
        GridPane.setConstraints ( lNamTextField,1,2 );
        GridPane.setConstraints ( phoneLabel,0,3 );
        GridPane.setConstraints ( phoneTextField,1,3 );
        GridPane.setConstraints ( emailLabel,0,4 );
        GridPane.setConstraints ( emailTextField,1,4 );
        GridPane.setConstraints ( addressLabel,0,5 );
        GridPane.setConstraints ( addressTextField,1,5 );
        GridPane.setConstraints ( cityLabel,0,6 );
        GridPane.setConstraints ( cityTextField,1,6 );
        GridPane.setConstraints ( stateLabel,0,7 );
        GridPane.setConstraints ( stateTextField,1,7 );
        GridPane.setConstraints ( zipLabel,0,8 );
        GridPane.setConstraints ( zipTextfield,1,8 );
        GridPane.setConstraints ( back,0,9 );
        GridPane.setConstraints ( add,1,9 );

        add.setOnAction ( e -> {

            try{

                if(fNameTextField.getText ().length () == 0 || lNamTextField.getText ().length ()==  0|| phoneTextField.getText ().length () == 0){

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Information");
                    alert.setHeaderText("Empty Fields");
                    alert.setContentText("Please make sure to enter First Name, Last Name, and Phone Number");
                    alert.showAndWait();

                } else {
                    Customer.createCustomer ( fNameTextField.getText (), lNamTextField.getText (), phoneTextField.getText (),
                            emailTextField.getText (), addressTextField.getText (), cityTextField.getText (), stateTextField.getText (),
                            zipTextfield.getText () );
                }

            }catch (Exception ex){
               ex.printStackTrace ();

            }
        });

        gp.getChildren ().addAll ( title,fNameLabel,fNameTextField,lNameLabel,lNamTextField,phoneLabel,phoneTextField,
                emailLabel,emailTextField,addressLabel,addressTextField,cityLabel,cityTextField,stateLabel,stateTextField, zipLabel,zipTextfield, back,add );

        gp.setVgap ( 15 );
        gp.setHgap ( 20 );
        gp.setAlignment ( Pos.CENTER );

        HBox hb = GuiUtil.Hboxdefault ();

        VBox vb = new VBox ( 25 );

        vb.getChildren ().addAll ( hb,gp );

        Scene scene = new Scene ( vb,1600,1000 );

        stage.setScene ( scene );

        stage.showAndWait ();



    }


}
