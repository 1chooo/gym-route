/**
 *  This project is CE1002 Final Project
 *  and the name of this project is
 *
 */

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
    FXMLLoader fxmlLoader1 = new FXMLLoader(Main.class.getResource("login.fxml"));
    FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("home.fxml"));
    FXMLLoader fxmlLoader3 = new FXMLLoader(Main.class.getResource("curriculum.fxml"));
    FXMLLoader fxmlLoader4 = new FXMLLoader(Main.class.getResource("calendar.fxml"));
    FXMLLoader fxmlLoader5 = new FXMLLoader(Main.class.getResource("rule.fxml"));
    FXMLLoader fxmlLoader6 = new FXMLLoader(Main.class.getResource("preview.fxml"));

    currentStage = primaryStage;
    loginScene = new Scene(fxmlLoader1.load());
    homeScene = new Scene(fxmlLoader2.load());
    curriculumScene = new Scene(fxmlLoader3.load());
    calendarScene = new Scene(fxmlLoader4.load());
    ruleScene = new Scene(fxmlLoader5.load());
    previewScene = new Scene(fxmlLoader6.load());
    currentStage.setTitle("施伯伯動起來！！！");
    currentStage.setScene(loginScene);

    currentStage.show();
  }

  public static void main(String[] Args) { launch(); }
}
