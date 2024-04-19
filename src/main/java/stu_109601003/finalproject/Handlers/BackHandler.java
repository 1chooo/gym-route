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

public class BackHandler extends MusclePartHandler {
    private ChoiceBox<String> back;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public BackHandler(
            ChoiceBox<String> back, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.back = back;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void backHandle() {
        try {
            Image image = new Image(new FileInputStream(
                    "./src/main/resources/stu_109601003/finalproject/imgs/parts/back.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(490);
            imageView.setY(0);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (back.getValue().toString().equals("背")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械水平划船", "機械反手高位下拉",
                    "機械高位下拉", "機械引體向上",
                    "史密斯滑船");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList(
                    "cable水平划船", "cable反手高位下拉",
                    "cable高位下拉", "cable直臂下壓");
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                    "單臂啞鈴划船", "槓鈴划船",
                    "w槓鈴划船", "直膝硬舉",
                    "羅馬尼亞硬舉");
            freeWeight.setItems(action_freeweight);
        } else {
        }

        String[] back_list = { "背", "豎脊肌", "圓肌" };
        back.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (back_list[t1.intValue()] == "背") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械水平划船", "機械反手高位下拉",
                            "機械高位下拉", "機械引體向上",
                            "史密斯滑船");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable水平划船", "cable反手高位下拉",
                            "cable高位下拉", "cable直臂下壓");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "單臂啞鈴划船", "槓鈴划船",
                            "w槓鈴划船", "直膝硬舉",
                            "羅馬尼亞硬舉");
                    freeWeight.setItems(action_freeweight);
                }
                if (back_list[t1.intValue()] == "豎脊肌") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList();
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList();
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "直膝硬舉", "羅馬尼亞硬舉");
                    freeWeight.setItems(action_freeweight);
                } else {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械反手高位下拉", "機械高位下拉",
                            "機械引體向上", "史密斯滑船");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable反手高位下拉", "cable高位下拉",
                            "cable直臂下壓");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "單臂啞鈴划船", "槓鈴划船",
                            "w槓鈴划船");
                    freeWeight.setItems(action_freeweight);
                }
            }
        });
    }
}