package stu_109601003.finalproject.Controllers;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() {
        SceneController.switchScene("primary");
    }
}
