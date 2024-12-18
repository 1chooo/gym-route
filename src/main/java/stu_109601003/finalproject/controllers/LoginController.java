package stu_109601003.finalproject.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.IOException;

public class LoginController {
  @FXML
  private Pane pane;
  @FXML
  private Button enter;
  @FXML
  private ImageView imageView;
  @FXML
  private Button exit;
  private String imagePath = "./src/main/resources/stu_109601003/finalproject/imgs/login.png";

  @FXML
  private void initialize() {
    File file = new File(imagePath);
    Image image = new Image(file.toURI().toString());
    imageView.setImage(image);
  }

  @FXML
  public void onStartPressed() throws IOException {
    SceneController.switchScene(PAGE.RULE);
  }

  @FXML
  public void onExitPressed() throws IOException {
    SceneController.exitApplication();
  }
}