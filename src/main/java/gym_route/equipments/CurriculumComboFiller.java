package gym_route.equipments;

import javafx.collections.ObservableList;

/**
 * Fills curriculum {@link javafx.scene.control.ComboBox} items with the same section headers and ordering
 * as the legacy {@code CurriculumController} implementation.
 */
public final class CurriculumComboFiller {

    private CurriculumComboFiller() {
    }

    public static void fillMechanicalCableFreeWeight(
            ObservableList<String> items, BodyPartEquipment equipment) {
        fillThreeSections(
                items,
                equipment.getMechanicalEquipment(),
                equipment.getCableEquipment(),
                equipment.getFreeWeightEquipment());
    }

    public static void fillThreeSections(
            ObservableList<String> items,
            Iterable<String> mechanical,
            Iterable<String> cable,
            Iterable<String> freeWeight) {
        items.clear();
        items.add("-----機械-----");
        addEach(items, mechanical);
        items.addAll("", "-----纜繩-----");
        addEach(items, cable);
        items.addAll("", "-----自由重量-----");
        addEach(items, freeWeight);
    }

    /**
     * Legacy shoulder “斜方肌” branch used the cable list again under the free-weight header.
     */
    public static void fillMechanicalCableAndCableAsFree(
            ObservableList<String> items,
            Iterable<String> mechanical,
            Iterable<String> cable) {
        items.clear();
        items.add("-----機械-----");
        addEach(items, mechanical);
        items.addAll("", "-----纜繩-----");
        addEach(items, cable);
        items.addAll("", "-----自由重量-----");
        addEach(items, cable);
    }

    public static void fillCoreSection(ObservableList<String> items, BodyPartEquipment coreEquipment) {
        items.clear();
        items.add("-----核心-----");
        addEach(items, coreEquipment.getMechanicalEquipment());
    }

    public static void fillAerobicSection(ObservableList<String> items, BodyPartEquipment aerobicEquipment) {
        items.clear();
        items.add("-----有氧-----");
        addEach(items, aerobicEquipment.getMechanicalEquipment());
    }

    private static void addEach(ObservableList<String> items, Iterable<String> strings) {
        for (String s : strings) {
            items.add(s);
        }
    }
}
