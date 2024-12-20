package gym_route.equipments;

import gym_route.parts.BACK;

public class BackEquipments {
    private String[] backMechanical = {
            "機械水平划船", "機械反手高位下拉", "機械高位下拉", "機械引體向上",
            "史密斯滑船" };
    private String[] backCable = {
            "cable水平划船", "cable反手高位下拉", "cable高位下拉", "cable直臂下壓" };
    private String[] backFreeWeight = {
            "單臂啞鈴划船", "槓鈴划船", "w槓鈴划船", "直膝硬舉",
            "羅馬尼亞硬舉" };
    private BodyPartEquipment backEquipment = new BodyPartEquipment(
            BACK.BACK, backMechanical,
            backCable, backFreeWeight);

    private String[] erectorSpinaeMechanical = {
    };
    private String[] erectorSpinaeCable = {
    };
    private String[] erectorSpinaeFreeWeight = {
            "直膝硬舉", "羅馬尼亞硬舉" };
    private BodyPartEquipment erectorSpinaeEquipment = new BodyPartEquipment(
            BACK.ERECTOR_SPINAE, erectorSpinaeMechanical,
            erectorSpinaeCable, erectorSpinaeFreeWeight);

    private String[] trapeziusMechanical = {
            "機械反手高位下拉", "機械高位下拉", "機械引體向上", "史密斯滑船" };
    private String[] trapeziusCable = {
            "cable反手高位下拉", "cable高位下拉", "cable直臂下壓" };
    private String[] trapeziusFreeWeight = {
            "單臂啞鈴划船", "槓鈴划船", "w槓鈴划船" };
    private BodyPartEquipment trapeziusEquipment = new BodyPartEquipment(
            BACK.TRAPEZIUS, trapeziusMechanical,
            trapeziusCable, trapeziusFreeWeight);

    public BackEquipments() {
    }

    public BodyPartEquipment getBackEquipment() {
        return backEquipment;
    }

    public BodyPartEquipment getErectorSpinaeEquipment() {
        return erectorSpinaeEquipment;
    }

    public BodyPartEquipment getTrapeziusEquipment() {
        return trapeziusEquipment;
    }

}
