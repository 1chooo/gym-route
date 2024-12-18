package stu_109601003.finalproject.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import stu_109601003.finalproject.equipments.AerobicEquipments;
import stu_109601003.finalproject.equipments.BodyPartEquipment;
import stu_109601003.finalproject.handlers.EquipmentHandler;
import stu_109601003.finalproject.handlers.MusclePartHandler;
import stu_109601003.finalproject.parts.AEROBIC;

public class AerobicHandler extends MusclePartHandler {
    private ChoiceBox<String> aerobic;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/stu_109601003/finalproject/imgs/parts/aero.jfif";
    
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
