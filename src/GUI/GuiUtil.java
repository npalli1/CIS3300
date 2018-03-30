package GUI;

import Backend.Employee;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by nikhilpalli on 3/27/18.
 */
public class GuiUtil {

    public static Stage primStage;

    public static HBox Hboxdefault(){

        HBox hb = new HBox ( 500 );

        HBox vbright= new HBox ( 20 );

        Label logo = new Label ( "P&N Enterprise" );
        logo.setStyle ( "-fx-font-size: 48pt" );
        Label user = new Label("Hello, " + Employee.firstName);
        Button main = new Button("Main Menu");
        Button logout = new Button("Logout");

        vbright.getChildren ().addAll ( user, main, logout );
        vbright.setAlignment ( Pos.TOP_RIGHT );

        hb.getChildren ().addAll(logo, vbright);
        hb.setPadding ( new Insets ( 20 ) );
        hb.setAlignment ( Pos.TOP_CENTER);

        return hb;
    }
}
