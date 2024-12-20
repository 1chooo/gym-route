package final_project;

import final_project.controllers.PAGE;
import final_project.controllers.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

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
