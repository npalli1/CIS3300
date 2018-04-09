package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        Button manageCust = new Button("Manage Customers");
        Button manageCar = new Button("Manage Cars");
        Button manageWorkOrder = new Button("Manage Work Orders");
        Button generateReports = new Button("Generate Reports");

        GridPane gp = new GridPane ();
        gp.setPadding ( new Insets ( 30 ) );
        gp.setHgap ( 300);
        gp.setVgap ( 250 );

        GridPane.setConstraints ( manageCust,0,0 );
        GridPane.setConstraints ( manageCar,1,0 );
        GridPane.setConstraints ( manageWorkOrder,0,1 );
        GridPane.setConstraints ( generateReports,1,1 );

        gp.getChildren ().addAll(manageCust,manageCar,manageWorkOrder,generateReports);
        gp.setAlignment ( Pos.CENTER );

        HBox hb = GuiUtil.Hboxdefault ();

        VBox vb = new VBox (100);

        vb.getChildren ().addAll ( hb,gp );

        Scene home = new Scene(vb, 1600,1000);

        s.setScene ( home );

        manageCust.setOnAction ( event -> {
            s.close ();
            AddCustomer.displayManageCustomers ();
        } );

        s.show ();
    }
}
