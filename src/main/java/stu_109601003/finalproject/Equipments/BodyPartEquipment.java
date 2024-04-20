package stu_109601003.finalproject.Equipments;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class BodyPartEquipment {
    private String bodyPart;
    private ObservableList<String> mechanicalEquipment;
    private ObservableList<String> cableEquipment;
    private ObservableList<String> freeWeightEquipment;

    public BodyPartEquipment(String bodyPart, String[] mechanical, String[] cable, String[] freeWeight) {
        this.bodyPart = bodyPart;
        this.mechanicalEquipment = FXCollections.observableArrayList(mechanical);
        this.cableEquipment = FXCollections.observableArrayList(cable);
        this.freeWeightEquipment = FXCollections.observableArrayList(freeWeight);
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public ObservableList<String> getMechanicalEquipment() {
        return mechanicalEquipment;
    }

    public ObservableList<String> getCableEquipment() {
        return cableEquipment;
    }

    public ObservableList<String> getFreeWeightEquipment() {
        return freeWeightEquipment;
    }

    public void setMechanicalEquipment(String[] mechanical) {
        this.mechanicalEquipment.clear();
        this.mechanicalEquipment.addAll(mechanical);
    }

    public void setCableEquipment(String[] cable) {
        this.cableEquipment.clear();
        this.cableEquipment.addAll(cable);
    }

    public void setFreeWeightEquipment(String[] freeWeight) {
        this.freeWeightEquipment.clear();
        this.freeWeightEquipment.addAll(freeWeight);
    }
}
