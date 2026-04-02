package gym_route.handlers.Parts;

import gym_route.equipments.AerobicEquipments;
import gym_route.equipments.BodyPartEquipment;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.AEROBIC;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AerobicHandler extends MusclePartHandler {
    private final ChoiceBox<String> aerobic;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/aero.jfif";

    private final AerobicEquipments aerobicEquipments = new AerobicEquipments();
    private final BodyPartEquipment aerobicEquipment = aerobicEquipments.getAerobicEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();

    public AerobicHandler(
            ChoiceBox<String> aerobic, Pane display_muscle,
            ListView<String> machine, ListView<String> cable, ListView<String> freeWeight) {
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
        displayArmImage(imagePath, display_muscle);
        binder.bindSingleSubPart(
                aerobic, AEROBIC.AEROBIC, aerobicEquipment, machine, cable, freeWeight);
    }
}
