package stu_109601003.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.IOException;

public class LogInPageController {
  @FXML
  Pane pane;
  @FXML
  Button enter;
  @FXML
  ImageView imageView;
  @FXML
  Button exit;

  @FXML
  public void initialize() {
    File file = new File("./image/login.png");
    Image image = new Image(file.toURI().toString());
    imageView.setImage(image);
  }

  @FXML
  public void onThisPressed() throws IOException {
    Main.currentStage.setScene(Main.ruleScene);
  }

  @FXML
  public void onExitPressed() throws IOException {
    Main.currentStage.close();
  }
}
