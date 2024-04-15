package stu_109601003.finalproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.IOException;

public class HomeController implements EventHandler<MouseEvent>{
  @FXML
  VBox main_page;
  @FXML
  Button back_b;
  @FXML
  ChoiceBox chest;
  @FXML
  ChoiceBox leg;
  @FXML
  ChoiceBox back;
  @FXML
  ChoiceBox shoulder;
  @FXML
  ChoiceBox arm;
  @FXML
  ChoiceBox core;
  @FXML
  ChoiceBox aerobic;
  @FXML
  Pane display_muscle;
  @FXML
  ListView machine;
  @FXML
  ListView cable;
  @FXML
  ListView freeWeight;
  @FXML
  Label sets_times;
  @FXML
  Label contact_us;
  @FXML
  Button set_table;

  @Override
  public void handle(MouseEvent event) {}

  public void chestHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/chest.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(219);
      imageView.setY(50);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}

    if (chest.getValue().toString().equals("胸")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械胸推","機械上斜胸推",
                      "機械下斜胸推","蝴蝶機夾胸",
                      "史密斯胸推","史密斯上斜胸推",
                      "史密斯下斜胸推"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList(
                      "cable夾胸","cable高位夾胸",
                      "cable低位夾胸"
              );
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList(
                      "平板槓鈴臥推","上斜槓鈴臥推",
                      "下斜槓鈴臥推", "啞鈴飛鳥",
                      "啞鈴下壓飛鳥","啞鈴胸推",
                      "啞鈴上斜胸推","啞鈴下斜胸推",
                      "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
                      "啞鈴下斜胸推(窄握)","啞鈴前平舉"
              );
      freeWeight.setItems(action_freeweight);
    } else {}

    String[] chest_list = {"胸","上胸","下胸"};
    chest.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        if (chest_list[t1.intValue()] == "胸") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械胸推", "機械上斜胸推",
                          "機械下斜胸推","蝴蝶機夾胸",
                          "史密斯胸推", "史密斯上斜胸推",
                          "史密斯下斜胸推"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable夾胸","cable高位夾胸",
                          "cable低位夾胸"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "平板槓鈴臥推","上斜槓鈴臥推",
                          "下斜槓鈴臥推", "啞鈴飛鳥",
                          "啞鈴下壓飛鳥","啞鈴胸推",
                          "啞鈴上斜胸推","啞鈴下斜胸推",
                          "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
                          "啞鈴下斜胸推(窄握)","啞鈴前平舉"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (chest_list[t1.intValue()] == "上胸") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械胸推","機械上斜胸推",
                          "史密斯胸推","史密斯上斜胸推"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable高位夾胸","cable低位夾胸"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "平板槓鈴臥推","上斜槓鈴臥推",
                          "啞鈴下壓飛鳥", "啞鈴胸推",
                          "啞鈴上斜胸推","啞鈴胸推(窄握)",
                          "啞鈴上斜胸推(窄握)","啞鈴前平舉"
                  );
          freeWeight.setItems(action_freeweight);
        } else {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械胸推","機械下斜胸推",
                          "蝴蝶機夾胸", "史密斯胸推",
                          "史密斯下斜胸推"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable夾胸","cable高位夾胸",
                          "cable低位夾胸"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "平板槓鈴臥推","下斜槓鈴臥推",
                          "啞鈴飛鳥", "啞鈴下壓飛鳥",
                          "啞鈴胸推","啞鈴下斜胸推",
                          "啞鈴胸推(窄握)","啞鈴下斜胸推(窄握)",
                          "啞鈴前平舉"
                  );
          freeWeight.setItems(action_freeweight);
        }
      }
    });
  }


  public void legHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/leg.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(219);
      imageView.setY(50);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (leg.getValue().toString().equals("腳")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械腿推","機械腿伸展",
                      "機械坐式腿屈曲","機械臥式腿屈曲",
                      "機械腿外展","機械腿內收",
                      "機械小腿伸展","機械臀後踢",
                      "機械臀橋","史密斯早安式",
                      "史密斯深蹲", "史密斯屈膝禮弓步",
                      "史密斯保加利亞蹲","史密斯頸前蹲",
                      "史密斯哈克蹲","史密斯臀橋"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList(
                      "cable後踢","cable側踢",
                      "cable腿內收"
              );
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList(
                      "深蹲","啞鈴單腳蹲",
                      "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                      "硬舉","直膝硬舉",
                      "羅馬尼亞硬舉","啞鈴相撲蹲",
                      "相撲硬舉","槓鈴臀橋",
                      "啞鈴提腫"
              );
      freeWeight.setItems(action_freeweight);
    }
    else {}

    String[] leg_list = {"腳","臀","股四頭","股二頭","小腿"};
    leg.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        if (leg_list[t1.intValue()] == "腳") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械腿推","機械腿伸展",
                          "機械坐式腿屈曲", "機械臥式腿屈曲",
                          "機械腿外展","機械腿內收",
                          "機械小腿伸展","機械臀後踢",
                          "機械臀橋", "史密斯早安式",
                          "史密斯深蹲","史密斯屈膝禮弓步",
                          "史密斯保加利亞蹲","史密斯頸前蹲",
                          "史密斯哈克蹲","史密斯臀橋"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable後踢","cable側踢",
                          "cable腿內收"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "深蹲","啞鈴單腳蹲",
                          "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                          "硬舉","直膝硬舉",
                          "羅馬尼亞硬舉","啞鈴相撲蹲",
                          "相撲硬舉", "槓鈴臀橋",
                          "啞鈴提腫"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (leg_list[t1.intValue()] == "臀") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械腿推","機械腿外展",
                          "機械腿內收", "機械臀後踢",
                          "機械臀橋","史密斯早安式",
                          "史密斯深蹲","史密斯屈膝禮弓步",
                          "史密斯保加利亞蹲","史密斯頸前蹲",
                          "史密斯哈克蹲","史密斯臀橋"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable後踢","cable側踢",
                          "cable腿內收"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "深蹲","啞鈴單腳蹲",
                          "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                          "硬舉","直膝硬舉",
                          "羅馬尼亞硬舉","啞鈴相撲蹲",
                          "相撲硬舉","槓鈴臀橋"
                  );
          freeWeight.setItems(action_freeweight);
        }
        else if (leg_list[t1.intValue()] == "股四頭") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械腿推","啞鈴單腳蹲",
                          "機械腿伸展", "史密斯深蹲",
                          "史密斯屈膝禮弓步","史密斯保加利亞蹲",
                          "史密斯頸前蹲","史密斯哈克蹲"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList();
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "深蹲","啞鈴單腳蹲",
                          "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                          "硬舉","羅馬尼亞硬舉",
                          "啞鈴相撲蹲","相撲硬舉"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (leg_list[t1.intValue()] == "股二頭") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械腿推","機械坐式腿屈曲",
                          "機械臥式腿屈曲","機械腿外展",
                          "機械腿內收","機械臀後踢",
                          "機械臀橋", "史密斯早安式",
                          "史密斯深蹲","史密斯屈膝禮弓步",
                          "史密斯保加利亞蹲", "史密斯頸前蹲",
                          "史密斯哈克蹲","史密斯臀橋"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable後踢","cable側踢",
                          "cable腿內收"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "深蹲","啞鈴單腳蹲",
                          "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                          "硬舉","直膝硬舉",
                          "羅馬尼亞硬舉","啞鈴相撲蹲",
                          "相撲硬舉","槓鈴臀橋"
                  );
          freeWeight.setItems(action_freeweight);
        } else {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械小腿伸展"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList();
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "啞鈴提腫"
                  );
          freeWeight.setItems(action_freeweight);
        }
      }
    });
  }

  public void backHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/back.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(490);
      imageView.setY(0);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (back.getValue().toString().equals("背")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械水平划船", "機械反手高位下拉",
                      "機械高位下拉","機械引體向上",
                      "史密斯滑船"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList(
                      "cable水平划船", "cable反手高位下拉",
                      "cable高位下拉","cable直臂下壓"
              );
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList(
                      "單臂啞鈴划船", "槓鈴划船",
                      "w槓鈴划船","直膝硬舉",
                      "羅馬尼亞硬舉"
              );
      freeWeight.setItems(action_freeweight);
    } else {}

    String[] back_list = {"背","豎脊肌","圓肌"};
    back.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        if (back_list[t1.intValue()] == "背") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械水平划船", "機械反手高位下拉",
                          "機械高位下拉","機械引體向上",
                          "史密斯滑船"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable水平划船", "cable反手高位下拉",
                          "cable高位下拉","cable直臂下壓"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "單臂啞鈴划船", "槓鈴划船",
                          "w槓鈴划船","直膝硬舉",
                          "羅馬尼亞硬舉"
                  );
          freeWeight.setItems(action_freeweight);
        }
        if (back_list[t1.intValue()] == "豎脊肌") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList();
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList();
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "直膝硬舉","羅馬尼亞硬舉"
                  );
          freeWeight.setItems(action_freeweight);
        } else {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械反手高位下拉", "機械高位下拉",
                          "機械引體向上", "史密斯滑船"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable反手高位下拉", "cable高位下拉",
                          "cable直臂下壓"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "單臂啞鈴划船","槓鈴划船",
                          "w槓鈴划船"
                  );
          freeWeight.setItems(action_freeweight);
        }
      }
    });
  }

  public void shoulderHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/shoulder.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(490);
      imageView.setY(0);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (shoulder.getValue().toString().equals("肩")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械肩推","機械飛鳥",
                      "蝴蝶機反向飛鳥"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList(
                      "cable肩推","cable側平舉",
                      "cable臉拉", "cable上拉",
                      "cable反向飛鳥","cable聳肩"
              );
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList(
                      "槓鈴肩推","啞鈴肩推",
                      "啞鈴前平舉", "啞鈴側平舉",
                      "啞鈴Y平舉","槓鈴上拉",
                      "w槓上拉","啞鈴反向飛鳥",
                      "槓鈴聳肩","啞鈴聳肩",
                      "上斜槓鈴臥推"
              );
      freeWeight.setItems(action_freeweight);
    }
    else {}

    String[] shoulder_list = {"肩","前束","中束","後束","斜方肌"};
    shoulder.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        if (shoulder_list[t1.intValue()] == "肩") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械肩推","機械飛鳥",
                          "蝴蝶機反向飛鳥"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable肩推","cable側平舉",
                          "cable臉拉","cable上拉",
                          "cable反向飛鳥","cable聳肩"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "槓鈴肩推","啞鈴肩推",
                          "啞鈴前平舉","啞鈴側平舉",
                          "啞鈴Y平舉","槓鈴上拉",
                          "w槓上拉", "啞鈴反向飛鳥",
                          "槓鈴聳肩","啞鈴聳肩",
                          "上斜槓鈴臥推"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (shoulder_list[t1.intValue()] == "前束") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械肩推","機械飛鳥"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable肩推","cable側平舉"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "槓鈴肩推","啞鈴肩推",
                          "啞鈴前平舉","啞鈴Y平舉",
                          "上斜槓鈴臥推"
                  );
          freeWeight.setItems(action_freeweight);
        }
        else if (shoulder_list[t1.intValue()] == "中束") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械肩推","機械飛鳥"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable肩推","cable側平舉",
                          "cable上拉"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "槓鈴肩推","啞鈴肩推",
                          "啞鈴側平舉","啞鈴Y平舉",
                          "槓鈴上拉","w槓上拉"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (shoulder_list[t1.intValue()] == "後束") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "蝴蝶機反向飛鳥"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable臉拉","cable反向飛鳥"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "啞鈴反向飛鳥"
                  );
          freeWeight.setItems(action_freeweight);
        } else {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList();
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable聳肩"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "槓鈴聳肩","啞鈴聳肩"
                  );
          freeWeight.setItems(action_freeweight);
        }
      }
    });
  }

  public void armHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/arm.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(220);
      imageView.setY(50);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (arm.getValue().toString().equals("手臂")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械二頭彎曲","機械三頭伸展"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList(
                      "cable二頭彎曲","cable三頭伸展"
              );
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList(
                      "啞鈴二頭彎曲","啞鈴三頭伸展",
                      "W槓二頭彎曲","W槓三頭伸展",
                      "槓鈴二頭彎曲","槓鈴三頭伸展",
                      "槓鈴窄握臥推"
              );
      freeWeight.setItems(action_freeweight);
    }
    else {}

    String[] arm_list = {"手臂","肱二頭","肱三頭"};
    arm.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        if (arm_list[t1.intValue()] == "手臂") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械二頭彎曲","機械三頭伸展"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable二頭彎曲","cable三頭伸展"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "啞鈴二頭彎曲","啞鈴三頭伸展",
                          "W槓二頭彎曲","W槓三頭伸展",
                          "槓鈴二頭彎曲","槓鈴三頭伸展",
                          "槓鈴窄握臥推"
                  );
          freeWeight.setItems(action_freeweight);
        } else if (arm_list[t1.intValue()] == "肱二頭") {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械二頭彎曲"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable二頭彎曲"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "啞鈴二頭彎曲","W槓二頭彎曲",
                          "槓鈴二頭彎曲"
                  );
          freeWeight.setItems(action_freeweight);
        } else {
          ObservableList<String> action_machine =
                  FXCollections.observableArrayList(
                          "機械三頭伸展"
                  );
          machine.setItems(action_machine);
          ObservableList<String> action_cable =
                  FXCollections.observableArrayList(
                          "cable三頭伸展"
                  );
          cable.setItems(action_cable);
          ObservableList<String> action_freeweight =
                  FXCollections.observableArrayList(
                          "啞鈴三頭伸展","W槓三頭伸展",
                          "槓鈴三頭伸展","槓鈴窄握臥推"
                  );
          freeWeight.setItems(action_freeweight);
        }
      }
    });
  }

  public void coreHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/core.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(200);
      imageView.setY(50);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (core.getValue().toString().equals("核心")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList(
                      "機械腹部訓練","機械腹部旋轉"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList();
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList();
      freeWeight.setItems(action_freeweight);
    }
    else {}
  }

  public void aerobicHandle(MouseEvent event) {
    try {
      Image image = new Image(new FileInputStream("./image/photo/aero.jpg"));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(400);
      imageView.setFitHeight(300);
      imageView.setY(50);
      display_muscle.getChildren().clear();
      display_muscle.getChildren().addAll(imageView);
    }
    catch (Exception e) {}
    if (aerobic.getValue().toString().equals("有氧")) {
      ObservableList<String> action_machine =
              FXCollections.observableArrayList("跑步機","橢圓機",
                      "樓梯機","踏步車",
                      "臥式健身車","立式健身車",
                      "划船機"
              );
      machine.setItems(action_machine);
      ObservableList<String> action_cable =
              FXCollections.observableArrayList();
      cable.setItems(action_cable);
      ObservableList<String> action_freeweight =
              FXCollections.observableArrayList();
      freeWeight.setItems(action_freeweight);
    }
    else {}
  }

  public void clickMachineList(MouseEvent event) {
    String[] machineAction = {
            "機械胸推","機械上斜胸推",
            "機械下斜胸推","蝴蝶機夾胸",
            "史密斯胸推", "史密斯上斜胸推",
            "史密斯下斜胸推","機械腿推",
            "機械腿伸展","機械坐式腿屈曲",
            "機械臥式腿屈曲","機械腿外展",
            "機械腿內收","機械小腿伸展",
            "機械臀後踢", "機械臀橋",
            "史密斯早安式","史密斯深蹲",
            "史密斯屈膝禮弓步","史密斯保加利亞蹲",
            "史密斯頸前蹲","史密斯哈克蹲",
            "史密斯臀橋","機械水平划船",
            "機械反手高位下拉", "機械高位下拉",
            "機械引體向上","史密斯滑船",
            "機械二頭彎曲","機械三頭伸展",
            "機械肩推","機械飛鳥",
            "蝴蝶機反向飛鳥","機械腹部訓練",
            "機械腹部旋轉", "跑步機",
            "橢圓機","樓梯機",
            "踏步車","臥式健身車",
            "立式健身車","划船機"
    };
    String[] machineActionEnglish = {
            "Lying-Chest-Press-Machine","Incline-Chest-Press-Machine",
            "Decline-Chest-Press-Machine","Pec-Deck-Fly",
            "Smith-Machine-Bench-Press","Smith-Machine-Incline-Bench-Press",
            "Smith-Machine-Decline-Bench-Press","Leg-Press",
            "LEG-EXTENSION","Seated-Leg-Curl","Leg-Curl",
            "HiP-ABDUCTION-MACHINE","HIP-ADDUCTION-MACHINE",
            "Lever-Seated-Calf-Raise","Glute-Kickback-Machine",
            "Hip-Thrust-on-The-Leg-Extension-Machine","Smith-Machine-Good-Morning",
            "BARBELL-SQUAT","no-image-found",
            "Barbell-Bulgarian-Split-Squat","Barbell-Bench-Front-Squat",
            "Barbell-Hack-Squat","Barbell-Glute-Bridge",
            "Reverse-Grip-Machine-Row","Reverse-Lat-Pulldown",
            "Front-Pulldown","Assisted-Pull-up",
            "Smith-Machine-Bent-Over-Row","Lever-Preacher-Curl",
            "Lever-Tricep-Extension","Lever-Shoulder-Press",
            "Lateral-Raise-Machine","Rear-Delt-Machine-Flys",
            "Seated-Crunch-Machine","Lever-Seated-Twist",
            "Treadmill-","Elliptical-Machine",
            "Walking-on-Stepmill","Walk-Wave-Machine",
            "Recumbent-Exercise-Bike","Bike",
            "Rowing-Machine"
    };
    for (int i = 0; i < machineAction.length; i++) {
      if (machine.getSelectionModel().selectedItemProperty().getValue().equals(machineAction[i])) {
        try {
          Image image = new Image(new FileInputStream("./image/gif/" +machineActionEnglish[i]+".gif"));
          ImageView imageView = new ImageView(image);
          imageView.setFitWidth(400);
          imageView.setY(50);
          display_muscle.getChildren().remove(0,1);
          display_muscle.getChildren().addAll(imageView);
        }
        catch (Exception e) {}
      }
      else {}
    }
  }


  public void clickCableList(MouseEvent event) {
    String[] cableAction = {
            "cable夾胸","cable低位夾胸",
            "cable高位夾胸","cable後踢",
            "cable側踢", "cable腿內收",
            "cable水平划船","cable反手高位下拉",
            "cable高位下拉","cable直臂下壓",
            "cable二頭彎曲","cable三頭伸展",
            "cable肩推","cable側平舉",
            "cable臉拉", "cable反向飛鳥",
            "cable上拉","cable聳肩"
    };
    String[] cableActionEnglish = {
            "Cable-Crossover","Low-Cable-Crossover",
            "High-Cable-Crossover","Cable-Hip-Extension",
            "Cable-Hip-Abduction","Cable-Hips-Adduction",
            "close-grip-cable-row","Reverse-Lat-Pulldown",
            "Lat-Pulldown","Rope-Straight-Arm-Pulldown",
            "High-Cable-Single-Arm-Bicep-Curl","Pushdown",
            "Cable-Shoulder-Press","Cable-Lateral-Raise",
            "Face-Pull","cable-rear-delt-fly",
            "Cable-Upright-Row","Cable-Shrug"
    };
    for (int i = 0; i < cableAction.length; i++) {
      if (cable.getSelectionModel().selectedItemProperty().getValue().equals(cableAction[i])) {
        try {
          Image image = new Image(new FileInputStream("./image/gif/" +cableActionEnglish[i]+".gif"));
          ImageView imageView = new ImageView(image);
          imageView.setFitWidth(400);
          imageView.setY(50);
          display_muscle.getChildren().remove(0,1);
          display_muscle.getChildren().addAll(imageView);
        }
        catch (Exception e) {}
      }
      else {}
    }
  }

  public void clickFreeWeightList(MouseEvent event) {
    String[] freeWeightAction = {
            "平板槓鈴臥推","上斜槓鈴臥推",
            "下斜槓鈴臥推","啞鈴飛鳥",
            "啞鈴下壓飛鳥", "啞鈴胸推",
            "啞鈴上斜胸推","啞鈴下斜胸推",
            "啞鈴胸推(窄握)","啞鈴上斜胸推(窄握)",
            "啞鈴下斜胸推(窄握)","啞鈴前平舉",
            "深蹲","啞鈴單腳蹲",
            "啞鈴保加利亞蹲", "啞鈴跨步蹲",
            "直膝硬舉","羅馬尼亞硬舉",
            "啞鈴相撲蹲","相撲硬舉",
            "啞鈴提腫","槓鈴臀橋",
            "硬舉","單臂啞鈴划船",
            "槓鈴划船", "w槓鈴划船",
            "啞鈴二頭彎曲","啞鈴三頭伸展",
            "W槓二頭彎曲","W槓三頭伸展",
            "槓鈴二頭彎曲","槓鈴窄握臥推",
            "槓鈴三頭伸展","槓鈴肩推",
            "啞鈴肩推", "啞鈴側平舉",
            "啞鈴Y平舉","槓鈴上拉",
            "w槓上拉","啞鈴反向飛鳥",
            "槓鈴聳肩","啞鈴聳肩"
    };
    String[] freeWeightActionEnglish = {
            "Barbell-Bench-Press","Incline-Barbell-Bench-Press",
            "Decline-Barbell-Bench-Press","Dumbbell-Fly",
            "Dumbbell-Pullover","Dumbbell-Press",
            "Incline-Dumbbell-Press","Decline-Dumbbell-Press",
            "Close-Grip-Dumbbell-Press","Close-grip-Incline-Dumbbell-Press",
            "Decline-hammer-press","Two-Arm-Dumbbell-Front-Raise",
            "BARBELL-SQUAT","Kettlebell-Pistol-Squats",
            "Dumbbell-Bulgarian-Split-Squat","Dumbbell-Lunge",
            "Stiff-Leg-Deadlift","Barbell-Romanian-Deadlift",
            "Barbell-sumo-squat","Barbell-Sumo-Deadlift",
            "Dumbbell-Calf-Raise","Barbell-Glute-Bridge",
            "Barbell-Deadlift","Dumbbell-Row",
            "Reverse-Grip-Barbell-Row","Reverse-Grip-Barbell-Row",
            "Double-Arm-Dumbbell-Curl","Seated-Dumbbell-Triceps-Extension",
            "Z-Bar-Preacher-Curl","Seated-EZ-Bar-Overhead-Triceps-Extension",
            "Barbell-Curl","Close-Grip-Bench-Press",
            "Barbell-Triceps-Extension","Barbell-Shoulder-Press",
            "Dumbbell-Shoulder-Press","Dumbbell-Lateral-Raise",
            "Incline-Dumbbell-Y-Raise","barbell-uprightrow",
            "Barbell-Upright-Row","Bent-Over-Lateral-Raise",
            "Barbell-Shrug","Dumbbell-Shrug"
    };
    for (int i = 0; i < freeWeightAction.length; i++) {
      if (freeWeight.getSelectionModel().selectedItemProperty().getValue().equals(freeWeightAction[i])) {
        try {
          Image image = new Image(new FileInputStream("./image/gif/" +freeWeightActionEnglish[i]+".gif"));
          ImageView imageView = new ImageView(image);
          imageView.setFitWidth(400);
          imageView.setY(50);
          display_muscle.getChildren().remove(0,1);
          display_muscle.getChildren().addAll(imageView);
        }
        catch (Exception e) {}
      }
      else {}
    }
  }

  public void onPreviousPageClicked() throws IOException {
    Main.currentStage.setScene(Main.loginScene);
  }

  public void onNextPageClicked() throws IOException {
    Main.currentStage.setScene(Main.curriculumScene);
  }
}