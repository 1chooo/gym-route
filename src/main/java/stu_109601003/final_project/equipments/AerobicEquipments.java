package stu_109601003.final_project.equipments;

import stu_109601003.final_project.parts.AEROBIC;

public class AerobicEquipments {
    private String[] aerobicMechanical = {
            "樓梯機" , "踏步車", "臥式健身車", "立式健身車",
            "划船機" };
    private String[] aerobicCable = {};
    private String[] aerobicFreeWeight = {};
    private BodyPartEquipment aerobicEquipment = new BodyPartEquipment(
            AEROBIC.AEROBIC, aerobicMechanical,
            aerobicCable, aerobicFreeWeight);

    public AerobicEquipments() {
    }

    public BodyPartEquipment getAerobicEquipment() {
        return aerobicEquipment;
    }
}
