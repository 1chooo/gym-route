package gym_route.handlers;

import gym_route.equipments.BodyPartEquipment;
import gym_route.parts.MusclePart;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

/**
 * Binds a body-part {@link ChoiceBox} to machine/cable/free-weight lists via {@link EquipmentHandler},
 * including sub-part index changes. Replaces any previously registered index listener for this binder
 * instance so repeated clicks do not stack listeners.
 */
public final class PartEquipmentBinder {

    private final EquipmentHandler equipmentHandler = new EquipmentHandler();
    private ChangeListener<Number> subPartIndexListener;

    /**
     * {@code equipmentBySubPartOrder} must match the declaring order of the part enum's {@code values()}.
     */
    public void bindMultiSubPart(
            ChoiceBox<String> choiceBox,
            MusclePart defaultSubPart,
            BodyPartEquipment defaultEquipment,
            BodyPartEquipment[] equipmentBySubPartOrder,
            ListView<String> machine,
            ListView<String> cable,
            ListView<String> freeWeight) {
        equipmentHandler.updateEquipment(
                choiceBox, defaultSubPart, defaultEquipment, machine, cable, freeWeight);
        if (subPartIndexListener != null) {
            choiceBox.getSelectionModel().selectedIndexProperty().removeListener(subPartIndexListener);
        }
        subPartIndexListener = (observable, oldIndex, newIndex) -> {
            if (newIndex == null) {
                return;
            }
            int i = newIndex.intValue();
            if (i >= 0 && i < equipmentBySubPartOrder.length) {
                equipmentHandler.setEquipment(
                        equipmentBySubPartOrder[i], machine, cable, freeWeight);
            }
        };
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(subPartIndexListener);
    }

    public void bindSingleSubPart(
            ChoiceBox<String> choiceBox,
            MusclePart part,
            BodyPartEquipment equipment,
            ListView<String> machine,
            ListView<String> cable,
            ListView<String> freeWeight) {
        equipmentHandler.updateEquipment(choiceBox, part, equipment, machine, cable, freeWeight);
        if (choiceBox.getValue() != null && choiceBox.getValue().equals(part.getName())) {
            equipmentHandler.setEquipment(equipment, machine, cable, freeWeight);
        }
    }
}
