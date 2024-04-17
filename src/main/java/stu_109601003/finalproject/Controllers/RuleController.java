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

  // 新增的 initialize 方法
  @FXML
  public void initialize() {
    // 在這裡可以初始化控件的狀態或者設置它們的屬性
    // 例如，你可以設置標題的文本，或者初始化 checkbox 的狀態
    title.setText("請閱讀並同意以下規範");
    checkBox.setSelected(false); // 初始化 checkbox 的狀態為未選中
  }

  public void clickedEnter() throws IOException {
    if (!checkBox.isSelected()) {
      status.setText("記得勾選同意上述規範哦");
    } else {
      SceneController.switchScene(PAGE.HOME);
    }
  }
}