package stu_109601003.finalproject.equipments;

import stu_109601003.finalproject.parts.CORE;

public class CoreEquipments {
    private String[] coreMechanical = {
            "機械腹部訓練", "機械腹部旋轉" };
    private String[] coreCable = {};
    private String[] coreFreeWeight = {};
    private BodyPartEquipment CoreEquipment = new BodyPartEquipment(
            CORE.CORE, coreMechanical,
            coreCable, coreFreeWeight);

    public CoreEquipments() {
    }

    public BodyPartEquipment getCoreEquipment() {
        return CoreEquipment;
    }
}
