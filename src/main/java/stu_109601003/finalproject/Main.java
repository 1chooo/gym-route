package stu_109601003.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
  public static Stage currentStage;
  public static Scene loginScene;
  public static Scene ruleScene;
  public static Scene homeScene;
  public static Scene curriculumScene;
  public static Scene previewScene;
  public static Scene calendarScene;

  @Override
  public void start(Stage primaryStage) throws IOException {
    FXMLLoader loginLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
    FXMLLoader homeLoader = new FXMLLoader(Main.class.getResource("home.fxml"));
    FXMLLoader curriculumLoader = new FXMLLoader(Main.class.getResource("curriculum.fxml"));
    FXMLLoader calendarLoader = new FXMLLoader(Main.class.getResource("calendar.fxml"));
    FXMLLoader ruleLoader = new FXMLLoader(Main.class.getResource("rule.fxml"));
    FXMLLoader previewLoader = new FXMLLoader(Main.class.getResource("preview.fxml"));

    currentStage = primaryStage;
    loginScene = new Scene(loginLoader.load());
    homeScene = new Scene(homeLoader.load());
    curriculumScene = new Scene(curriculumLoader.load());
    calendarScene = new Scene(calendarLoader.load());
    ruleScene = new Scene(ruleLoader.load());
    previewScene = new Scene(previewLoader.load());
    currentStage.setTitle("施伯伯動起來！！！");
    currentStage.setScene(loginScene);

    currentStage.show();
  }

  public static void main(String[] Args) {
    launch();
  }
}
