package gym_route.handlers.Parts;

import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.ShoulderEquipments;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.SHOULDER;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ShoulderHandler extends MusclePartHandler {
    private final ChoiceBox<String> shoulder;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/shoulder.jpg";

    private final ShoulderEquipments shoulderEquipments = new ShoulderEquipments();
    private final BodyPartEquipment shoulderEquipment = shoulderEquipments.getShoulderEquipment();
    private final BodyPartEquipment frontDeltoidEquipment = shoulderEquipments.getFrontDeltoidEquipment();
    private final BodyPartEquipment middleDeltoidEquipment = shoulderEquipments.getMiddleDeltoidEquipment();
    private final BodyPartEquipment rearDeltoidEquipment = shoulderEquipments.getRearDeltoidEquipment();
    private final BodyPartEquipment trapeziusEquipment = shoulderEquipments.getTrapeziusEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();
    private final BodyPartEquipment[] equipmentBySubPartOrder = {
            shoulderEquipment,
            frontDeltoidEquipment,
            middleDeltoidEquipment,
            rearDeltoidEquipment,
            trapeziusEquipment
    };

    public ShoulderHandler(
            ChoiceBox<String> shoulder, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.shoulder = shoulder;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void shoulderHandle() {
        displayArmImage(imagePath, display_muscle);
        binder.bindMultiSubPart(
                shoulder, SHOULDER.SHOULDER, shoulderEquipment, equipmentBySubPartOrder,
                machine, cable, freeWeight);
    }
}
