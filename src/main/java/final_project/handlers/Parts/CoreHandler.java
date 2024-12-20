package final_project.handlers.Parts;

import final_project.equipments.BodyPartEquipment;
import final_project.equipments.CoreEquipments;
import final_project.handlers.EquipmentHandler;
import final_project.handlers.MusclePartHandler;
import final_project.parts.CORE;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class CoreHandler extends MusclePartHandler {
    private ChoiceBox<String> core;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/final_project/imgs/parts/core.jpg";

    private CoreEquipments coreEquipments = new CoreEquipments();
    private BodyPartEquipment coreEquipment = coreEquipments.getCoreEquipment();
    
    private EquipmentHandler equipmentHandler = new EquipmentHandler();

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

        equipmentHandler.updateEquipment(
                core, CORE.CORE,
                coreEquipment, machine, cable, freeWeight);

        if (core.getValue().toString().equals(CORE.CORE.getName())) {
            equipmentHandler.setEquipment(
                    coreEquipment, machine, cable, freeWeight);
        } else {
        }
    }
}