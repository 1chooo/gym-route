package stu_109601003.finalproject.Handlers;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import stu_109601003.finalproject.Equipments.BodyPartEquipment;
import stu_109601003.finalproject.Parts.ARM;

public class ArmHandler extends MusclePartHandler {
    private ChoiceBox<String> arm;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String[] armMechanical = { "機械二頭彎曲", "機械三頭伸展" };
    private String[] armCable = { "cable二頭彎曲", "cable三頭伸展" };
    private String[] armFreeWeight = {
            "啞鈴二頭彎曲", "啞鈴三頭伸展", "W槓二頭彎曲",
            "W槓三頭伸展", "槓鈴二頭彎曲", "槓鈴三頭伸展",
            "槓鈴窄握臥推" };
    private BodyPartEquipment armEquipment = new BodyPartEquipment(
            "手臂", armMechanical, armCable, armFreeWeight);

    private String[] bicepsMechanical = { "機械二頭彎曲" };
    private String[] bicepsCable = { "cable二頭彎曲" };
    private String[] bicepsFreeWeight = {
            "啞鈴二頭彎曲", "W槓二頭彎曲", "槓鈴二頭彎曲" };
    private BodyPartEquipment bicepsEquipment = new BodyPartEquipment(
            "肱二頭", bicepsMechanical, bicepsCable,
            bicepsFreeWeight);

    private String[] tricepsMechanical = { "機械三頭伸展" };
    private String[] tricepsCable = { "cable三頭伸展" };
    private String[] tricepsFreeWeight = {
            "啞鈴三頭伸展", "W槓三頭伸展", "槓鈴三頭伸展", "槓鈴窄握臥推" };
    private BodyPartEquipment tricepsEquipment = new BodyPartEquipment(
            "肱三頭", tricepsMechanical, tricepsCable,
            tricepsFreeWeight);
    
    private EquipmentHandler equipmentHandler = new EquipmentHandler();

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
        displayArmImage(
                "./src/main/resources/stu_109601003/finalproject/imgs/parts/arm.jpg",
                display_muscle);

        // updateEquipment(ARMPART.ARM, armEquipment, machine, cable, freeWeight);
        equipmentHandler.updateEquipment(arm, ARM.ARM, armEquipment, machine, cable, freeWeight);

        ARM[] arm_list = { ARM.ARM, ARM.BICEPS, ARM.TRICEPS };
        arm.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number,
                    Number t1) {
                if (arm_list[t1.intValue()] == ARM.ARM) {
                    equipmentHandler.setEquipment(armEquipment, machine, cable, freeWeight);
                } else if (arm_list[t1.intValue()] == ARM.BICEPS) {
                    equipmentHandler.setEquipment(bicepsEquipment, machine, cable, freeWeight);
                } else if (arm_list[t1.intValue()] == ARM.TRICEPS) {
                    equipmentHandler.setEquipment(tricepsEquipment, machine, cable, freeWeight);
                }
            }
        });
    }
}
