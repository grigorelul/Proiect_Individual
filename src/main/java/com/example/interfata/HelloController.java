package com.example.interfata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
  /*  @FXML
    private Label welcomeText;
    @FXML
    private ImageView myImageView;
    Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("nel.jpg")));
    Image myImage1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("manevra.jpg")));

    @FXML
    public void displayImgage()
    {
        if(myImageView.getImage() == myImage) {
            myImageView.setImage(myImage1);
        } else {
            myImageView.setImage(myImage);
        }
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX 18 Application!");
    }*/
  @FXML
  private Button butonAutenntificare;

  @FXML
  private Hyperlink creeazaCont;

  @FXML
  private Button iesireProgram;

  @FXML
  private Button minimizareProgram;

  @FXML
  private TextField numeUtilizator;

  @FXML
  private PasswordField parola;
  /**
   * Cand apelam aceasta metoda pentru un buton o sa schimbe scena intr-un
   * tableView printr-un buton
   */
  /*@FXML
  public void login() throws IOException {
    autentificare.getScene().getWindow().hide();
    AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PaginaDupaAutentificare.fxml")));

    Stage stage = new Stage();
    Scene scene = new Scene(root, 1400, 700);
    stage.setScene(scene);
    stage.show();*/
  @FXML
  public void butonulApasatSchimbaEcranul (ActionEvent event) throws IOException {
    Parent tableViewParent = FXMLLoader.load(getClass().getResource("PaginaDupaAutentificare.fxml"));
    Scene tableViewScene = new Scene(tableViewParent);
    //Aici luam informatia din scena (SCENE)
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

    window.setScene(tableViewScene);
    window.show();
  }



  }