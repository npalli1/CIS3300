package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by nikhilpalli on 3/27/18.
 */
public class Home {

    public static void displayHome(){

        Stage s = new Stage ();

        Button addCust = new Button("Add Customer");
        Button findCust = new Button("Find Customer");
        Button addJob = new Button("Create Work Order");
        Button findJob = new Button("Find Work Order");

        GridPane gp = new GridPane ();
        gp.setPadding ( new Insets ( 30 ) );
        gp.setHgap ( 300);
        gp.setVgap ( 250 );

        GridPane.setConstraints ( addCust,0,0 );
        GridPane.setConstraints ( findCust,1,0 );
        GridPane.setConstraints ( addJob,0,1 );
        GridPane.setConstraints ( findJob,1,1 );

        gp.getChildren ().addAll(addCust,findCust,addJob,findJob);
        gp.setAlignment ( Pos.CENTER );

        HBox hb = GuiUtil.Hboxdefault ();

        VBox vb = new VBox (100);

        vb.getChildren ().addAll ( hb,gp );

        Scene home = new Scene(vb, 1600,1000);

        s.setScene ( home );

        s.showAndWait ();


    }
}
