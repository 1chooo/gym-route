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

public class AerobicHandler extends MuscleHandler {
    private ChoiceBox<String> aerobic;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public AerobicHandler(
            ChoiceBox<String> aerobic, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.aerobic = aerobic;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void aerobicHandle() {
        try {
            Image image = new Image(
                    new FileInputStream("./src/main/resources/stu_109601003/finalproject/imgs/parts/aero.jfif"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(300);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (aerobic.getValue().toString().equals("有氧")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList("跑步機", "橢圓機",
                    "樓梯機", "踏步車",
                    "臥式健身車", "立式健身車",
                    "划船機");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList();
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList();
            freeWeight.setItems(action_freeweight);
        } else {
        }
    }
}