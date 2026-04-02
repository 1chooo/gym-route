package gym_route.handlers.Parts;

import gym_route.equipments.BackEquipments;
import gym_route.equipments.BodyPartEquipment;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.BACK;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class BackHandler extends MusclePartHandler {
    private final ChoiceBox<String> back;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/back.jpg";

    private final BackEquipments backEquipments = new BackEquipments();
    private final BodyPartEquipment backEquipment = backEquipments.getBackEquipment();
    private final BodyPartEquipment erectorSpinaeEquipment = backEquipments.getErectorSpinaeEquipment();
    private final BodyPartEquipment trapeziusEquipment = backEquipments.getTrapeziusEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();
    private final BodyPartEquipment[] equipmentBySubPartOrder = {
            backEquipment, erectorSpinaeEquipment, trapeziusEquipment
    };

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
        displayArmImage(imagePath, display_muscle);
        binder.bindMultiSubPart(
                back, BACK.BACK, backEquipment, equipmentBySubPartOrder,
                machine, cable, freeWeight);
    }
}
