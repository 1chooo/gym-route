package gym_route.controllers;

import java.io.IOException;

import gym_route.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchScene(PAGE fxml) {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource(fxml.getFileName() + ".fxml"));
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
