package stu_109601003.finalproject.Handlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;

public class CoreHandler extends BaseHandler {
    private ChoiceBox core;
    private ListView machine;
    private ListView cable;
    private ListView freeWeight;
    private Pane display_muscle;

    public CoreHandler(
            ChoiceBox core, Pane display_muscle,
            ListView machine, ListView cable, ListView freeWeight) {
        this.core = core;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void coreHandle() {
        try {
            Image image = new Image(new FileInputStream(
                    "./src/main/resources/stu_109601003/finalproject/imgs/parts/core.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(200);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (core.getValue().toString().equals("核心")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械腹部訓練", "機械腹部旋轉");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList();
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList();
            freeWeight.setItems(action_freeweight);
        } else {
        }
    }
}