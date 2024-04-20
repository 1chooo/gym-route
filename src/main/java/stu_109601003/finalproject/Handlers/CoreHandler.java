package stu_109601003.finalproject.Handlers;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import stu_109601003.finalproject.Equipments.BodyPartEquipment;
import stu_109601003.finalproject.Parts.CORE;
import stu_109601003.finalproject.Equipments.CoreEquipments;

public class CoreHandler extends MusclePartHandler {
    private ChoiceBox<String> core;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/stu_109601003/finalproject/imgs/parts/core.jpg";

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