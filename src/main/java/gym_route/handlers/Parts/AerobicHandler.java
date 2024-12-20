package gym_route.handlers.Parts;

import gym_route.equipments.AerobicEquipments;
import gym_route.equipments.BodyPartEquipment;
import gym_route.handlers.EquipmentHandler;
import gym_route.handlers.MusclePartHandler;
import gym_route.parts.AEROBIC;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AerobicHandler extends MusclePartHandler {
    private ChoiceBox<String> aerobic;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/gym_route/imgs/parts/aero.jfif";
    
    private AerobicEquipments aerobicEquipments = new AerobicEquipments();
    private BodyPartEquipment aerobicEquipment = aerobicEquipments.getAerobicEquipment();

    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    public AerobicHandler(
            ChoiceBox<String> aerobic, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
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

        equipmentHandler.updateEquipment(
                aerobic, AEROBIC.AEROBIC,
                aerobicEquipment, machine, cable, freeWeight);

        if (aerobic.getValue().toString().equals(AEROBIC.AEROBIC.getName())) {
            equipmentHandler.setEquipment(
                    aerobicEquipment, machine, cable, freeWeight);
        } else {
        }
    }
}
