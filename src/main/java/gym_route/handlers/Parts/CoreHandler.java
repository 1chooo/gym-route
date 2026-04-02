package gym_route.handlers.Parts;

import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.CoreEquipments;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.CORE;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class CoreHandler extends MusclePartHandler {
    private final ChoiceBox<String> core;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/core.jpg";

    private final CoreEquipments coreEquipments = new CoreEquipments();
    private final BodyPartEquipment coreEquipment = coreEquipments.getCoreEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();

    public CoreHandler(
            ChoiceBox<String> core, Pane display_muscle,
            ListView<String> machine, ListView<String> cable, ListView<String> freeWeight) {
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
        displayArmImage(imagePath, display_muscle);
        binder.bindSingleSubPart(core, CORE.CORE, coreEquipment, machine, cable, freeWeight);
    }
}
