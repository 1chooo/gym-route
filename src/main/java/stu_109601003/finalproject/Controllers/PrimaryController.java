package stu_109601003.finalproject.Controllers;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() {
        SceneController.switchScene(PageName.LOGIN);
    }
}
