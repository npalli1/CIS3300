package GUI;

import Backend.Employee;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * Created by nikhilpalli on 3/27/18.
 */
public class GuiUtil {

    public static Stage primStage;

    public static HBox Hboxdefault(){

        HBox hb = new HBox ( 500 );

        HBox hbright= new HBox ( 20 );

        Label logo = new Label ( "P&N Enterprise" );
        logo.setStyle ( "-fx-font-size: 48pt" );
        Label user = new Label("Hello, " + Employee.firstName);
        Button main = new Button("Main Menu");
        Button logout = new Button("Logout");

        //main.setOnAction ( event -> {Home.displayHome ();});


        hbright.getChildren ().addAll ( user, main, logout );
        hbright.setAlignment ( Pos.CENTER );

        hb.getChildren ().addAll(logo, hbright);
        hb.setPadding ( new Insets ( 20 ) );
        hb.setAlignment ( Pos.TOP_CENTER);

        return hb;
    }
}
