package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by nikhilpalli on 3/27/18.
 */
public class Home {

    public static void displayHome(){

        Stage s = new Stage ();

        HBox hb = GuiUtil.Hboxdefault ();


        Scene home = new Scene(hb, 1600,1000);

        s.setScene ( home );

        s.showAndWait ();


    }
}
