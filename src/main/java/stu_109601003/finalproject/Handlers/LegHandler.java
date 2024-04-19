// ChestHandler.java
package stu_109601003.finalproject.Handlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;

public class LegHandler extends MuscleHandler {
    private ChoiceBox<String> leg;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public LegHandler(
            ChoiceBox<String> leg, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.leg = leg;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void legHandle() {
        try {
            Image image = new Image(
                    new FileInputStream(
                            "./src/main/resources/stu_109601003/finalproject/imgs/parts/leg.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(219);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (leg.getValue().toString().equals("腳")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械腿推", "機械腿伸展",
                    "機械坐式腿屈曲", "機械臥式腿屈曲",
                    "機械腿外展", "機械腿內收",
                    "機械小腿伸展", "機械臀後踢",
                    "機械臀橋", "史密斯早安式",
                    "史密斯深蹲", "史密斯屈膝禮弓步",
                    "史密斯保加利亞蹲", "史密斯頸前蹲",
                    "史密斯哈克蹲", "史密斯臀橋");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList(
                    "cable後踢", "cable側踢",
                    "cable腿內收");
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                    "深蹲", "啞鈴單腳蹲",
                    "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                    "硬舉", "直膝硬舉",
                    "羅馬尼亞硬舉", "啞鈴相撲蹲",
                    "相撲硬舉", "槓鈴臀橋",
                    "啞鈴提腫");
            freeWeight.setItems(action_freeweight);
        } else {
        }

        String[] leg_list = { "腳", "臀", "股四頭", "股二頭", "小腿" };
        leg.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (leg_list[t1.intValue()] == "腳") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械腿推", "機械腿伸展",
                            "機械坐式腿屈曲", "機械臥式腿屈曲",
                            "機械腿外展", "機械腿內收",
                            "機械小腿伸展", "機械臀後踢",
                            "機械臀橋", "史密斯早安式",
                            "史密斯深蹲", "史密斯屈膝禮弓步",
                            "史密斯保加利亞蹲", "史密斯頸前蹲",
                            "史密斯哈克蹲", "史密斯臀橋");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable後踢", "cable側踢",
                            "cable腿內收");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "深蹲", "啞鈴單腳蹲",
                            "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                            "硬舉", "直膝硬舉",
                            "羅馬尼亞硬舉", "啞鈴相撲蹲",
                            "相撲硬舉", "槓鈴臀橋",
                            "啞鈴提腫");
                    freeWeight.setItems(action_freeweight);
                } else if (leg_list[t1.intValue()] == "臀") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械腿推", "機械腿外展",
                            "機械腿內收", "機械臀後踢",
                            "機械臀橋", "史密斯早安式",
                            "史密斯深蹲", "史密斯屈膝禮弓步",
                            "史密斯保加利亞蹲", "史密斯頸前蹲",
                            "史密斯哈克蹲", "史密斯臀橋");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable後踢", "cable側踢",
                            "cable腿內收");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "深蹲", "啞鈴單腳蹲",
                            "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                            "硬舉", "直膝硬舉",
                            "羅馬尼亞硬舉", "啞鈴相撲蹲",
                            "相撲硬舉", "槓鈴臀橋");
                    freeWeight.setItems(action_freeweight);
                } else if (leg_list[t1.intValue()] == "股四頭") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械腿推", "啞鈴單腳蹲",
                            "機械腿伸展", "史密斯深蹲",
                            "史密斯屈膝禮弓步", "史密斯保加利亞蹲",
                            "史密斯頸前蹲", "史密斯哈克蹲");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList();
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "深蹲", "啞鈴單腳蹲",
                            "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                            "硬舉", "羅馬尼亞硬舉",
                            "啞鈴相撲蹲", "相撲硬舉");
                    freeWeight.setItems(action_freeweight);
                } else if (leg_list[t1.intValue()] == "股二頭") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械腿推", "機械坐式腿屈曲",
                            "機械臥式腿屈曲", "機械腿外展",
                            "機械腿內收", "機械臀後踢",
                            "機械臀橋", "史密斯早安式",
                            "史密斯深蹲", "史密斯屈膝禮弓步",
                            "史密斯保加利亞蹲", "史密斯頸前蹲",
                            "史密斯哈克蹲", "史密斯臀橋");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable後踢", "cable側踢",
                            "cable腿內收");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "深蹲", "啞鈴單腳蹲",
                            "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                            "硬舉", "直膝硬舉",
                            "羅馬尼亞硬舉", "啞鈴相撲蹲",
                            "相撲硬舉", "槓鈴臀橋");
                    freeWeight.setItems(action_freeweight);
                } else {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械小腿伸展");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList();
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "啞鈴提腫");
                    freeWeight.setItems(action_freeweight);
                }
            }
        });
    }
}