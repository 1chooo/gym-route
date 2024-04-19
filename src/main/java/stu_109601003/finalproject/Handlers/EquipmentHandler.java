package stu_109601003.finalproject.Handlers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

public class EquipmentHandler {

    public EquipmentHandler() {
    }

    // [TODOs]:
    // - ARMPART 要重新命名，因為目前可以支援各個部位了！
    public void updateEquipment(
            ChoiceBox<String> part, ARMPART armPart,
            BodyPartEquipment armEquipment, ListView<String> machine,
            ListView<String> cable, ListView<String> freeWeight) {
        if (part.getValue().toString().equals(armPart.getName())) {
            setEquipment(armEquipment, machine, cable, freeWeight);
        } else {
            // Handle other cases if necessary
        }
    }

    public void setEquipment(
            BodyPartEquipment armEquipment, ListView<String> machine,
            ListView<String> cable, ListView<String> freeWeight) {
        ObservableList<String> action_machine = FXCollections.observableArrayList(
                armEquipment.getMechanicalEquipment());
        machine.setItems(action_machine);
        ObservableList<String> action_cable = FXCollections.observableArrayList(
                armEquipment.getCableEquipment());
        cable.setItems(action_cable);
        ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                armEquipment.getFreeWeightEquipment());
        freeWeight.setItems(action_freeweight);
    }

}
