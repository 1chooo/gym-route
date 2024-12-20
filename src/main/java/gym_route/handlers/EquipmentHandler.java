package gym_route.handlers;

import gym_route.equipments.BodyPartEquipment;
import gym_route.parts.MusclePart;
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
            ChoiceBox<String> part, MusclePart musclePart,
            BodyPartEquipment armEquipment, ListView<String> machine,
            ListView<String> cable, ListView<String> freeWeight) {
        if (part.getValue().toString().equals(musclePart.getName())) {
            setEquipment(armEquipment, machine, cable, freeWeight);
        } else {
            // Handle other cases if necessary
        }
    }

    public void setEquipment(
            BodyPartEquipment bodyPartEquipment, ListView<String> machine,
            ListView<String> cable, ListView<String> freeWeight) {
        ObservableList<String> action_machine = FXCollections.observableArrayList(
                bodyPartEquipment.getMechanicalEquipment());
        machine.setItems(action_machine);
        ObservableList<String> action_cable = FXCollections.observableArrayList(
                bodyPartEquipment.getCableEquipment());
        cable.setItems(action_cable);
        ObservableList<String> action_freeweight = FXCollections.observableArrayList(
                bodyPartEquipment.getFreeWeightEquipment());
        freeWeight.setItems(action_freeweight);
    }

}
