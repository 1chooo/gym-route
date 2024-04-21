package stu_109601003.finalproject.Equipments;

import stu_109601003.finalproject.Parts.CHEST;

public class ChestEquipments {
    private String[] chestMechanical = {
            "機械胸推", "機械上斜胸推", "機械下斜胸推", "蝴蝶機夾胸",
            "史密斯胸推", "史密斯上斜胸推", "史密斯下斜胸推" };
    private String[] chestCable = {
            "cable夾胸", "cable高位夾胸", "cable低位夾胸" };
    private String[] chestFreeWeight = {
            "平板槓鈴臥推", "上斜槓鈴臥推", "下斜槓鈴臥推", "啞鈴飛鳥",
            "啞鈴下壓飛鳥", "啞鈴胸推", "啞鈴上斜胸推", "啞鈴下斜胸推",
            "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)", "啞鈴下斜胸推(窄握)", "啞鈴前平舉" };
    private BodyPartEquipment chestEquipment = new BodyPartEquipment(
            CHEST.CHEST, chestMechanical,
            chestCable, chestFreeWeight);

    private String[] upperChestMechanical = {
            "機械胸推", "機械上斜胸推", "史密斯胸推", "史密斯上斜胸推"
    };
    private String[] upperChestCable = {
            "cable高位夾胸", "cable低位夾胸"
    };
    private String[] upperChestFreeWeight = {
            "平板槓鈴臥推", "上斜槓鈴臥推", "啞鈴下壓飛鳥", "啞鈴胸推",
            "啞鈴上斜胸推", "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)", "啞鈴前平舉" };
    private BodyPartEquipment upperChestEquipment = new BodyPartEquipment(
            CHEST.UPPER_CHEST, upperChestMechanical,
            upperChestCable, upperChestFreeWeight);

    private String[] lowerChestMechanical = {
            "機械胸推", "機械下斜胸推", "蝴蝶機夾胸", "史密斯胸推",
            "史密斯下斜胸推" };
    private String[] lowerChestCable = {
            "cable夾胸", "cable高位夾胸", "cable低位夾胸" };
    private String[] lowerChestFreeWeight = {
            "平板槓鈴臥推", "下斜槓鈴臥推", "啞鈴飛鳥", "啞鈴下壓飛鳥",
            "啞鈴胸推", "啞鈴下斜胸推", "啞鈴胸推(窄握)", "啞鈴下斜胸推(窄握)",
            "啞鈴前平舉" };
    private BodyPartEquipment lowerChestEquipment = new BodyPartEquipment(
            CHEST.LOWER_CHEST, lowerChestMechanical,
            lowerChestCable, lowerChestFreeWeight);

    public ChestEquipments() {
    }

    public BodyPartEquipment getChestEquipment() {
        return chestEquipment;
    }

    public BodyPartEquipment getUpperChestEquipment() {
        return upperChestEquipment;
    }

    public BodyPartEquipment getLowerChestEquipment() {
        return lowerChestEquipment;
    }
}
