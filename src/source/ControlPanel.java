package source;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPanel {
    @FXML
    Button button;
    @FXML
    PasswordField passField;
    @FXML
    TextField loginPanel;
    @FXML
    Button btnOpenNewWindow;

    public void show() {
        System.out.println("Work");
    }

    @FXML
    public void log() {
        Scanner scanner = new Scanner(System.in);
        String login = loginPanel.getText();
        String login1 = "ala";
        String pass = passField.getText();
//        String pass1 = "1234";
        if (login.equals(login1) && pass.equals("123")) {
            System.out.println("zalogowales sie");
        } else {
            System.out.println("Nie zalogowales sie ");
            System.out.println(getClass().getResource("/source/menuPane.fxml"));

        }
    }

    @FXML
    private void open1(ActionEvent event) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/source/menuPane.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            LoginControler loginScreenController = fxmlLoader.<LoginControler>getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Login Screen");
            stage.setScene(scene);
            stage.show();

            ((Node)(event.getSource())).getScene().getWindow().hide(); //close current window after opening new Scene
        }
        catch (IOException ex)
        {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

