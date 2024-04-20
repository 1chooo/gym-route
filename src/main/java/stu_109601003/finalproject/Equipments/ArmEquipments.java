package stu_109601003.finalproject.Equipments;

public class ArmEquipments {
    private String[] armMechanical = { "機械二頭彎曲", "機械三頭伸展" };
    private String[] armCable = { "cable二頭彎曲", "cable三頭伸展" };
    private String[] armFreeWeight = {
            "啞鈴二頭彎曲", "啞鈴三頭伸展", "W槓二頭彎曲",
            "W槓三頭伸展", "槓鈴二頭彎曲", "槓鈴三頭伸展",
            "槓鈴窄握臥推" };
    private BodyPartEquipment armEquipment = new BodyPartEquipment(
            "手臂", armMechanical, armCable, armFreeWeight);

    private String[] bicepsMechanical = { "機械二頭彎曲" };
    private String[] bicepsCable = { "cable二頭彎曲" };
    private String[] bicepsFreeWeight = {
            "啞鈴二頭彎曲", "W槓二頭彎曲", "槓鈴二頭彎曲" };
    private BodyPartEquipment bicepsEquipment = new BodyPartEquipment(
            "肱二頭", bicepsMechanical, bicepsCable,
            bicepsFreeWeight);

    private String[] tricepsMechanical = { "機械三頭伸展" };
    private String[] tricepsCable = { "cable三頭伸展" };
    private String[] tricepsFreeWeight = {
            "啞鈴三頭伸展", "W槓三頭伸展", "槓鈴三頭伸展", "槓鈴窄握臥推" };
    private BodyPartEquipment tricepsEquipment = new BodyPartEquipment(
            "肱三頭", tricepsMechanical, tricepsCable,
            tricepsFreeWeight);

    public ArmEquipments() {
    }

    public BodyPartEquipment getArmEquipment() {
        return armEquipment;
    }

    public BodyPartEquipment getBicepsEquipment() {
        return bicepsEquipment;
    }

    public BodyPartEquipment getTricepsEquipment() {
        return tricepsEquipment;
    }

}
