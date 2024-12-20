package gym_route.controllers;

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

    @FXML
    public void initialize() {
        title.setText("請閱讀並同意以下規範");
        checkBox.setSelected(false);
    }

    public void clickedEnter() throws IOException {
        if (!checkBox.isSelected())
            status.setText("記得勾選同意上述規範哦");
        else
            SceneController.switchScene(PAGE.HOME);
    }
}