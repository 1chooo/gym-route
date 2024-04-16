package stu_109601003.finalproject.Controllers;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import stu_109601003.finalproject.App;

public class SceneController {

    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchScene(String fxml) {
        try {
            // System.out.println("Current Path: " + SceneController.class.getResource(""));
            Parent root = FXMLLoader.load(App.class.getResource(fxml + ".fxml"));
            stage.setScene(new Scene(root, 640, 480));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
