package stu_109601003.finalproject.Handlers;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import stu_109601003.finalproject.Equipments.BodyPartEquipment;
import stu_109601003.finalproject.Parts.ARM;
import stu_109601003.finalproject.Equipments.ArmEquipments;

public class ArmHandler extends MusclePartHandler {
    private ChoiceBox<String> arm;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private ArmEquipments armEquipments = new ArmEquipments();

    private BodyPartEquipment armEquipment = armEquipments.getArmEquipment();
    private BodyPartEquipment bicepsEquipment = armEquipments.getBicepsEquipment();
    private BodyPartEquipment tricepsEquipment = armEquipments.getTricepsEquipment();

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
