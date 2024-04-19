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

public class ChestHandler extends MusclePartHandler {

    private ChoiceBox<String> chest;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public ChestHandler(
            ChoiceBox<String> chest, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.chest = chest;
        this.display_muscle = display_muscle;
        this.cable = cable;
        this.freeWeight = freeWeight;
        this.machine = machine;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void chestHandle() {
        try {
            Image image = new Image(
                    new FileInputStream(
                            "./src/main/resources/stu_109601003/finalproject/imgs/parts/chest.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(219);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }

        if (chest.getValue().toString().equals("胸")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械胸推", "機械上斜胸推",
                    "機械下斜胸推", "蝴蝶機夾胸",
                    "史密斯胸推", "史密斯上斜胸推",
                    "史密斯下斜胸推");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList(
                    "cable夾胸", "cable高位夾胸",
                    "cable低位夾胸");
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                    "平板槓鈴臥推", "上斜槓鈴臥推",
                    "下斜槓鈴臥推", "啞鈴飛鳥",
                    "啞鈴下壓飛鳥", "啞鈴胸推",
                    "啞鈴上斜胸推", "啞鈴下斜胸推",
                    "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
                    "啞鈴下斜胸推(窄握)", "啞鈴前平舉");
            freeWeight.setItems(action_freeweight);
        } else {
        }

        String[] chest_list = { "胸", "上胸", "下胸" };
        chest.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (chest_list[t1.intValue()] == "胸") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械胸推", "機械上斜胸推",
                            "機械下斜胸推", "蝴蝶機夾胸",
                            "史密斯胸推", "史密斯上斜胸推",
                            "史密斯下斜胸推");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable夾胸", "cable高位夾胸",
                            "cable低位夾胸");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "平板槓鈴臥推", "上斜槓鈴臥推",
                            "下斜槓鈴臥推", "啞鈴飛鳥",
                            "啞鈴下壓飛鳥", "啞鈴胸推",
                            "啞鈴上斜胸推", "啞鈴下斜胸推",
                            "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
                            "啞鈴下斜胸推(窄握)", "啞鈴前平舉");
                    freeWeight.setItems(action_freeweight);
                } else if (chest_list[t1.intValue()] == "上胸") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械胸推", "機械上斜胸推",
                            "史密斯胸推", "史密斯上斜胸推");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable高位夾胸", "cable低位夾胸");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "平板槓鈴臥推", "上斜槓鈴臥推",
                            "啞鈴下壓飛鳥", "啞鈴胸推",
                            "啞鈴上斜胸推", "啞鈴胸推(窄握)",
                            "啞鈴上斜胸推(窄握)", "啞鈴前平舉");
                    freeWeight.setItems(action_freeweight);
                } else {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械胸推", "機械下斜胸推",
                            "蝴蝶機夾胸", "史密斯胸推",
                            "史密斯下斜胸推");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable夾胸", "cable高位夾胸",
                            "cable低位夾胸");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "平板槓鈴臥推", "下斜槓鈴臥推",
                            "啞鈴飛鳥", "啞鈴下壓飛鳥",
                            "啞鈴胸推", "啞鈴下斜胸推",
                            "啞鈴胸推(窄握)", "啞鈴下斜胸推(窄握)",
                            "啞鈴前平舉");
                    freeWeight.setItems(action_freeweight);
                }
            }
        });
    }
}