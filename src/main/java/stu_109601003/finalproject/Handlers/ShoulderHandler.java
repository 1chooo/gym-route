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

public class ShoulderHandler extends MuscleHandler {
    private ChoiceBox<String> shoulder;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public ShoulderHandler(
            ChoiceBox<String> shoulder, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.shoulder = shoulder;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void shoulderHandle() {
        try {
            Image image = new Image(
                    new FileInputStream(
                            "./src/main/resources/stu_109601003/finalproject/imgs/parts/shoulder.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(490);
            imageView.setY(0);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (shoulder.getValue().toString().equals("肩")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械肩推", "機械飛鳥",
                    "蝴蝶機反向飛鳥");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList(
                    "cable肩推", "cable側平舉",
                    "cable臉拉", "cable上拉",
                    "cable反向飛鳥", "cable聳肩");
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                    "槓鈴肩推", "啞鈴肩推",
                    "啞鈴前平舉", "啞鈴側平舉",
                    "啞鈴Y平舉", "槓鈴上拉",
                    "w槓上拉", "啞鈴反向飛鳥",
                    "槓鈴聳肩", "啞鈴聳肩",
                    "上斜槓鈴臥推");
            freeWeight.setItems(action_freeweight);
        } else {
        }

        String[] shoulder_list = { "肩", "前束", "中束", "後束", "斜方肌" };
        shoulder.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (shoulder_list[t1.intValue()] == "肩") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械肩推", "機械飛鳥",
                            "蝴蝶機反向飛鳥");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable肩推", "cable側平舉",
                            "cable臉拉", "cable上拉",
                            "cable反向飛鳥", "cable聳肩");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "槓鈴肩推", "啞鈴肩推",
                            "啞鈴前平舉", "啞鈴側平舉",
                            "啞鈴Y平舉", "槓鈴上拉",
                            "w槓上拉", "啞鈴反向飛鳥",
                            "槓鈴聳肩", "啞鈴聳肩",
                            "上斜槓鈴臥推");
                    freeWeight.setItems(action_freeweight);
                } else if (shoulder_list[t1.intValue()] == "前束") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械肩推", "機械飛鳥");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable肩推", "cable側平舉");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "槓鈴肩推", "啞鈴肩推",
                            "啞鈴前平舉", "啞鈴Y平舉",
                            "上斜槓鈴臥推");
                    freeWeight.setItems(action_freeweight);
                } else if (shoulder_list[t1.intValue()] == "中束") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械肩推", "機械飛鳥");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable肩推", "cable側平舉",
                            "cable上拉");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "槓鈴肩推", "啞鈴肩推",
                            "啞鈴側平舉", "啞鈴Y平舉",
                            "槓鈴上拉", "w槓上拉");
                    freeWeight.setItems(action_freeweight);
                } else if (shoulder_list[t1.intValue()] == "後束") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "蝴蝶機反向飛鳥");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable臉拉", "cable反向飛鳥");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "啞鈴反向飛鳥");
                    freeWeight.setItems(action_freeweight);
                } else {
                    ObservableList<String> action_machine = FXCollections.observableArrayList();
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable聳肩");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "槓鈴聳肩", "啞鈴聳肩");
                    freeWeight.setItems(action_freeweight);
                }
            }
        });
    }
}