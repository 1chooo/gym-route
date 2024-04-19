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

public class ArmHandler extends MuscleHandler {
    private ChoiceBox<String> arm;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    public ArmHandler(
            ChoiceBox<String> arm, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.arm = arm;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void armHandle() {
        try {
            Image image = new Image(
                    new FileInputStream(
                            "./src/main/resources/stu_109601003/finalproject/imgs/parts/arm.jpg"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(220);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
        }
        if (arm.getValue().toString().equals("手臂")) {
            ObservableList<String> action_machine = FXCollections.observableArrayList(
                    "機械二頭彎曲", "機械三頭伸展");
            machine.setItems(action_machine);
            ObservableList<String> action_cable = FXCollections.observableArrayList(
                    "cable二頭彎曲", "cable三頭伸展");
            cable.setItems(action_cable);
            ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                    "啞鈴二頭彎曲", "啞鈴三頭伸展",
                    "W槓二頭彎曲", "W槓三頭伸展",
                    "槓鈴二頭彎曲", "槓鈴三頭伸展",
                    "槓鈴窄握臥推");
            freeWeight.setItems(action_freeweight);
        } else {
        }

        String[] arm_list = { "手臂", "肱二頭", "肱三頭" };
        arm.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (arm_list[t1.intValue()] == "手臂") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械二頭彎曲", "機械三頭伸展");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable二頭彎曲", "cable三頭伸展");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "啞鈴二頭彎曲", "啞鈴三頭伸展",
                            "W槓二頭彎曲", "W槓三頭伸展",
                            "槓鈴二頭彎曲", "槓鈴三頭伸展",
                            "槓鈴窄握臥推");
                    freeWeight.setItems(action_freeweight);
                } else if (arm_list[t1.intValue()] == "肱二頭") {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械二頭彎曲");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable二頭彎曲");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "啞鈴二頭彎曲", "W槓二頭彎曲",
                            "槓鈴二頭彎曲");
                    freeWeight.setItems(action_freeweight);
                } else {
                    ObservableList<String> action_machine = FXCollections.observableArrayList(
                            "機械三頭伸展");
                    machine.setItems(action_machine);
                    ObservableList<String> action_cable = FXCollections.observableArrayList(
                            "cable三頭伸展");
                    cable.setItems(action_cable);
                    ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                            "啞鈴三頭伸展", "W槓三頭伸展",
                            "槓鈴三頭伸展", "槓鈴窄握臥推");
                    freeWeight.setItems(action_freeweight);
                }
            }
        });
    }
}