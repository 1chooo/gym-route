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

    public static void switchScene(PAGE fxml) {
        try {
            Parent root = FXMLLoader.load(App.class.getResource(fxml.getFileName() + ".fxml"));
            stage.setScene(new Scene(root, 1200, 675.0));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exitApplication() {
        stage.close();
    }
}
