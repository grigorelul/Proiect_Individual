package com.example.interfata;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PaginaPrincipala.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Titlul Primei Ferestre!");
//        stage.setScene(scene);
//        stage.show();



        Parent root = FXMLLoader.load(getClass().getResource("PaginaPrincipala.fxml"));

        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.setTitle("Blue Clouds");
        //stage.setScene(new Scene(root, 614, 423));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}