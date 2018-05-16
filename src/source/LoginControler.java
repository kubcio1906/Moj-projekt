package source;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginControler {
    @FXML
    Button button1;
    @FXML
    Label label;
    @FXML
    private ChoiceBox<String> choiceBox;

@FXML
    public void show(){
        System.out.println("jest");
    }
    public void inicjacja(URL lok, ResourceBundle res){
    choiceBox.getItems().addAll("de","asd");
    }

}
