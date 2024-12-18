package stu_109601003.final_project.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import stu_109601003.final_project.equipments.ArmEquipments;
import stu_109601003.final_project.equipments.BodyPartEquipment;
import stu_109601003.final_project.handlers.EquipmentHandler;
import stu_109601003.final_project.handlers.MusclePartHandler;
import stu_109601003.final_project.parts.ARM;

public class ArmHandler extends MusclePartHandler {
    private ChoiceBox<String> arm;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/stu_109601003/final_project/imgs/parts/arm.jpg";

    private ArmEquipments armEquipments = new ArmEquipments();
    private BodyPartEquipment armEquipment = armEquipments.getArmEquipment();
    private BodyPartEquipment bicepsEquipment = armEquipments.getBicepsEquipment();
    private BodyPartEquipment tricepsEquipment = armEquipments.getTricepsEquipment();
    
    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    private ARM[] arms = { ARM.ARM, ARM.BICEPS, ARM.TRICEPS };

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
        displayArmImage(imagePath, display_muscle);

        equipmentHandler.updateEquipment(
                arm, ARM.ARM, armEquipment,
                machine, cable, freeWeight);

        arm.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number number, Number t1) {
                if (arms[t1.intValue()] == ARM.ARM) {
                    equipmentHandler.setEquipment(
                            armEquipment, machine, cable, freeWeight);
                } else if (arms[t1.intValue()] == ARM.BICEPS) {
                    equipmentHandler.setEquipment(
                            bicepsEquipment, machine, cable, freeWeight);
                } else if (arms[t1.intValue()] == ARM.TRICEPS) {
                    equipmentHandler.setEquipment(
                            tricepsEquipment, machine, cable, freeWeight);
                } else {
                }
            }
        });
    }
}
