package gym_route.handlers.Parts;

import gym_route.equipments.ArmEquipments;
import gym_route.equipments.BodyPartEquipment;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.ARM;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ArmHandler extends MusclePartHandler {
    private final ChoiceBox<String> arm;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/arm.jpg";

    private final ArmEquipments armEquipments = new ArmEquipments();
    private final BodyPartEquipment armEquipment = armEquipments.getArmEquipment();
    private final BodyPartEquipment bicepsEquipment = armEquipments.getBicepsEquipment();
    private final BodyPartEquipment tricepsEquipment = armEquipments.getTricepsEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();
    private final BodyPartEquipment[] equipmentBySubPartOrder = {
            armEquipment, bicepsEquipment, tricepsEquipment
    };

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
        binder.bindMultiSubPart(
                arm, ARM.ARM, armEquipment, equipmentBySubPartOrder,
                machine, cable, freeWeight);
    }
}
