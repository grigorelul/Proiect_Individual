package com.example.interfata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class PaginaDupaAutentificareController implements Initializable {


    /**
     *  Cand apelam aceasta metoda pentru un buton o sa schimbe scena intr-un
     *  tableView printr-un buton
     */
    @FXML
    private Button buton;
    @FXML
    public void butonulApasatSchimbaEcranul (ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("PaginaPrincipala.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //Aici luam informatia din scena (SCENE)
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


