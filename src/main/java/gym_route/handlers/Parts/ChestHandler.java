package gym_route.handlers.Parts;

import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.ChestEquipments;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.CHEST;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ChestHandler extends MusclePartHandler {
    private final ChoiceBox<String> chest;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/chest.jpg";

    private final ChestEquipments chestEquipments = new ChestEquipments();
    private final BodyPartEquipment chestEquipment = chestEquipments.getChestEquipment();
    private final BodyPartEquipment upperChestEquipment = chestEquipments.getUpperChestEquipment();
    private final BodyPartEquipment lowerChestEquipment = chestEquipments.getLowerChestEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();
    private final BodyPartEquipment[] equipmentBySubPartOrder = {
            chestEquipment, upperChestEquipment, lowerChestEquipment
    };

    public ChestHandler(
            ChoiceBox<String> chest, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.chest = chest;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void chestHandle() {
        displayArmImage(imagePath, display_muscle);
        binder.bindMultiSubPart(
                chest, CHEST.CHEST, chestEquipment, equipmentBySubPartOrder,
                machine, cable, freeWeight);
    }
}
