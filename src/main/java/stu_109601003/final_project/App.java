package stu_109601003.final_project;

import javafx.application.Application;
import javafx.stage.Stage;
import stu_109601003.final_project.controllers.PAGE;
import stu_109601003.final_project.controllers.SceneController;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        SceneController.setStage(primaryStage);
        SceneController.switchScene(PAGE.LOGIN);
    }

    public static void main(String[] args) {
        launch();
    }
}
