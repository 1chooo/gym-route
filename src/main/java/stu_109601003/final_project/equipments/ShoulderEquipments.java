package stu_109601003.final_project.equipments;

import stu_109601003.final_project.parts.SHOULDER;

public class ShoulderEquipments {
    private String[] shoulderMechanical = {
            "機械肩推", "機械飛鳥",
            "蝴蝶機反向飛鳥" };
    private String[] shoulderCable = {
            "cable肩推", "cable側平舉",
            "cable臉拉", "cable上拉",
            "cable反向飛鳥", "cable聳肩" };
    private String[] shoulderFreeWeight = {
            "槓鈴肩推", "啞鈴肩推",
            "啞鈴前平舉", "啞鈴側平舉",
            "啞鈴Y平舉", "槓鈴上拉",
            "w槓上拉", "啞鈴反向飛鳥",
            "槓鈴聳肩", "啞鈴聳肩",
            "上斜槓鈴臥推" };
    private BodyPartEquipment shoulderEquipment = new BodyPartEquipment(
            SHOULDER.SHOULDER, shoulderMechanical,
            shoulderCable, shoulderFreeWeight);

    private String[] frontDeltoidMechanical = {
            "機械肩推", "機械飛鳥" };
    private String[] frontDeltoidCable = {
            "cable肩推", "cable側平舉" };
    private String[] frontDeltoidFreeWeight = {
            "槓鈴肩推", "啞鈴肩推",
            "啞鈴前平舉", "啞鈴Y平舉",
            "上斜槓鈴臥推" };
    private BodyPartEquipment frontDeltoidEquipment = new BodyPartEquipment(
            SHOULDER.FRONT_DELTOID, frontDeltoidMechanical,
            frontDeltoidCable, frontDeltoidFreeWeight);

    private String[] middleDeltoidMechanical = {
            "機械肩推", "機械飛鳥" };
    private String[] middleDeltoidCable = {
            "cable肩推", "cable側平舉",
            "cable上拉"
    };
    private String[] middleDeltoidFreeWeight = {
            "槓鈴肩推", "啞鈴肩推",
            "啞鈴側平舉", "啞鈴Y平舉",
            "槓鈴上拉", "w槓上拉" };
    private BodyPartEquipment middleDeltoidEquipment = new BodyPartEquipment(
            SHOULDER.MIDDLE_DELTOID, middleDeltoidMechanical,
            middleDeltoidCable, middleDeltoidFreeWeight);

    private String[] rearDeltoidMechanical = {
            "蝴蝶機反向飛鳥" };
    private String[] rearDeltoidCable = {
            "cable臉拉", "cable反向飛鳥" };
    private String[] rearDeltoidFreeWeight = {
            "啞鈴反向飛鳥" };
    private BodyPartEquipment rearDeltoidEquipment = new BodyPartEquipment(
            SHOULDER.REAR_DELTOID, rearDeltoidMechanical,
            rearDeltoidCable, rearDeltoidFreeWeight);

    private String[] trapeziusMechanical = {
    };
    private String[] trapeziusCable = {
            "cable聳肩" };
    private String[] trapeziusFreeWeight = {
            "槓鈴聳肩", "啞鈴聳肩" };
    private BodyPartEquipment trapeziusEquipment = new BodyPartEquipment(
            SHOULDER.TRAPEZIUS, trapeziusMechanical,
            trapeziusCable, trapeziusFreeWeight);

    public ShoulderEquipments() {
    }

    public BodyPartEquipment getShoulderEquipment() {
        return shoulderEquipment;
    }

    public BodyPartEquipment getFrontDeltoidEquipment() {
        return frontDeltoidEquipment;
    }

    public BodyPartEquipment getMiddleDeltoidEquipment() {
        return middleDeltoidEquipment;
    }

    public BodyPartEquipment getRearDeltoidEquipment() {
        return rearDeltoidEquipment;
    }

    public BodyPartEquipment getTrapeziusEquipment() {
        return trapeziusEquipment;
    }

}
