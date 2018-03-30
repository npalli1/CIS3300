package Backend;

import GUI.Login;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene start = Login.displayLogin ();
        primaryStage.setTitle ( "P&N Enterprise" );
        primaryStage.setScene ( start );
        primaryStage.show ();
    }

    public static void main(String[] args) throws Exception {

        launch(args);

    }
}
