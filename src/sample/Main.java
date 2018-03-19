package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

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
        primaryStage.setTitle ( "P&N Enterprise" );
        primaryStage.setScene ( start );
        primaryStage.show ();


    }



    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
