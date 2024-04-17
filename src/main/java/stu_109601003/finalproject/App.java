package stu_109601003.finalproject;

import javafx.application.Application;
import javafx.stage.Stage;
import stu_109601003.finalproject.Controllers.PAGE;
import stu_109601003.finalproject.Controllers.SceneController;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        SceneController.setStage(primaryStage);
        SceneController.switchScene(PAGE.PRIMARY);
    }

    public static void main(String[] args) {
        launch();
    }
}
