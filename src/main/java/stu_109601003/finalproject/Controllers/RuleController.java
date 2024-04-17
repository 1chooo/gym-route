package stu_109601003.finalproject.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RuleController {
  @FXML
  Label title;
  @FXML
  AnchorPane rule;
  @FXML
  CheckBox checkBox;
  @FXML
  Button enter;
  @FXML
  Label status;

  public void clickedEnter() throws IOException {
    if (!checkBox.isSelected()) {
      status.setText("記得勾選同意上述規範哦");
    } else {
      SceneController.switchScene(PageName.SECONDARY);
    }
  }
}