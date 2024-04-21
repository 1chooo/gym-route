package stu_109601003.finalproject.Handlers;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

import stu_109601003.finalproject.Parts.CHEST;
import stu_109601003.finalproject.Equipments.ChestEquipments;
import stu_109601003.finalproject.Equipments.BodyPartEquipment;

public class ChestHandler extends MusclePartHandler {
    private ChoiceBox<String> chest;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/stu_109601003/finalproject/imgs/parts/chest.jpg";

    private ChestEquipments chestEquipments = new ChestEquipments();
    private BodyPartEquipment chestEquipment = chestEquipments.getChestEquipment();
    private BodyPartEquipment upperChestEquipment = chestEquipments.getUpperChestEquipment();
    private BodyPartEquipment lowerChestEquipment = chestEquipments.getLowerChestEquipment();

    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    private CHEST[] chests = { CHEST.CHEST, CHEST.UPPER_CHEST, CHEST.LOWER_CHEST };

    public ChestHandler(
            ChoiceBox<String> chest, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.chest = chest;
        this.display_muscle = display_muscle;
        this.cable = cable;
        this.freeWeight = freeWeight;
        this.machine = machine;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void chestHandle() {
        displayArmImage(imagePath, display_muscle);

        equipmentHandler.updateEquipment(
                chest, CHEST.CHEST, chestEquipment,
                machine, cable, freeWeight);

        chest.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number number, Number t1) {
                if (chests[t1.intValue()] == CHEST.CHEST) {
                    equipmentHandler.setEquipment(
                            chestEquipment, machine, cable, freeWeight);
                } else if (chests[t1.intValue()] == CHEST.UPPER_CHEST) {
                    equipmentHandler.setEquipment(
                            upperChestEquipment, machine, cable, freeWeight);
                } else if (chests[t1.intValue()] == CHEST.LOWER_CHEST) {
                    equipmentHandler.setEquipment(
                            lowerChestEquipment, machine, cable, freeWeight);
                } else {
                }
            }
        });
    }
}
