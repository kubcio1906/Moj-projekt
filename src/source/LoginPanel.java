package source;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author blj0011
 */
public class LoginPanel extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/source/stackPanel.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }



}