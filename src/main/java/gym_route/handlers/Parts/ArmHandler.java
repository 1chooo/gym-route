package gym_route.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import gym_route.equipments.ArmEquipments;
import gym_route.equipments.BodyPartEquipment;
import gym_route.handlers.EquipmentHandler;
import gym_route.handlers.MusclePartHandler;
import gym_route.parts.ARM;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

public class ArmHandler extends MusclePartHandler {
    private ChoiceBox<String> arm;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/gym_route/imgs/parts/arm.jpg";

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
