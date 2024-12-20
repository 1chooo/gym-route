package gym_route.equipments;

import gym_route.parts.LEG;

public class LegEquipments {
    private String[] legMechanical = {
            "機械腿推", "機械腿伸展", "機械坐式腿屈曲", "機械臥式腿屈曲",
            "機械腿外展", "機械腿內收", "機械小腿伸展", "機械臀後踢",
            "機械臀橋", "史密斯早安式", "史密斯深蹲", "史密斯屈膝禮弓步",
            "史密斯保加利亞蹲", "史密斯頸前蹲", "史密斯哈克蹲", "史密斯臀橋" };
    private String[] legCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] legFreeWeight = {
            "深蹲", "啞鈴單腳蹲", "啞鈴保加利亞蹲", "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", "羅馬尼亞硬舉", "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋", "啞鈴提腫" };
    private BodyPartEquipment legEquipment = new BodyPartEquipment(
            LEG.LEG, legMechanical,
            legCable, legFreeWeight);

    private String[] hipMechanical = {
            "機械腿推", "機械腿外展", "機械腿內收", "機械臀後踢",
            "機械臀橋", "史密斯早安式", "史密斯深蹲", "史密斯屈膝禮弓步",
            "史密斯保加利亞蹲", "史密斯頸前蹲", "史密斯哈克蹲", "史密斯臀橋" };
    private String[] hipCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] hipFreeWeight = {
            "深蹲", "啞鈴單腳蹲", "啞鈴保加利亞蹲", "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", "羅馬尼亞硬舉", "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋" };
    private BodyPartEquipment hipEquipment = new BodyPartEquipment(
            LEG.HIP, hipMechanical,
            hipCable, hipFreeWeight);

    private String[] quadricepsMechanical = {
            "機械腿推", "啞鈴單腳蹲", "機械腿伸展", "史密斯深蹲",
            "史密斯屈膝禮弓步", "史密斯保加利亞蹲", "史密斯頸前蹲", "史密斯哈克蹲" };
    private String[] quadricepsCable = {
    };
    private String[] quadricepsFreeWeight = {
            "深蹲", "啞鈴單腳蹲", "啞鈴保加利亞蹲", "啞鈴跨步蹲",
            "硬舉", "羅馬尼亞硬舉", "啞鈴相撲蹲", "相撲硬舉" };
    private BodyPartEquipment quadricepsEquipment = new BodyPartEquipment(
            LEG.QUADRICEPS, quadricepsMechanical,
            quadricepsCable, quadricepsFreeWeight);

    private String[] hamstringsMechanical = {
            "機械腿推", "機械坐式腿屈曲", "機械臥式腿屈曲", "機械腿外展",
            "機械腿內收", "機械臀後踢", "機械臀橋", "史密斯早安式",
            "史密斯深蹲", "史密斯屈膝禮弓步", "史密斯保加利亞蹲", "史密斯頸前蹲",
            "史密斯哈克蹲", "史密斯臀橋" };
    private String[] hamstringsCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] hamstringsFreeWeight = {
            "深蹲", "啞鈴單腳蹲", "啞鈴保加利亞蹲", "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", "羅馬尼亞硬舉", "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋" };
    private BodyPartEquipment hamstringsEquipment = new BodyPartEquipment(
            LEG.HAMSTRINGS, hamstringsMechanical,
            hamstringsCable, hamstringsFreeWeight);

    private String[] calfMechanical = {
            "機械小腿伸展" };
    private String[] calfCable = {
    };
    private String[] calfFreeWeight = {
            "啞鈴提腫" };
    private BodyPartEquipment calfEquipment = new BodyPartEquipment(
            LEG.CALF, calfMechanical,
            calfCable, calfFreeWeight);

    public LegEquipments() {
    }

    public BodyPartEquipment getLegEquipment() {
        return legEquipment;
    }

    public BodyPartEquipment getHipEquipment() {
        return hipEquipment;
    }

    public BodyPartEquipment getHamstringsEquipment() {
        return hamstringsEquipment;
    }

    public BodyPartEquipment getQuadricepsEquipment() {
        return quadricepsEquipment;
    }

    public BodyPartEquipment getCalfEquipment() {
        return calfEquipment;
    }

}
