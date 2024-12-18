package stu_109601003.finalproject.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import stu_109601003.finalproject.equipments.BackEquipments;
import stu_109601003.finalproject.equipments.BodyPartEquipment;
import stu_109601003.finalproject.handlers.EquipmentHandler;
import stu_109601003.finalproject.handlers.MusclePartHandler;
import stu_109601003.finalproject.parts.BACK;

public class BackHandler extends MusclePartHandler {
    private ChoiceBox<String> back;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/stu_109601003/finalproject/imgs/parts/back.jpg";

    private BackEquipments backEquipments = new BackEquipments();
    private BodyPartEquipment backEquipment = backEquipments.getBackEquipment();
    private BodyPartEquipment erectorSpinaeEquipment = backEquipments.getErectorSpinaeEquipment();
    private BodyPartEquipment trapeziusEquipment = backEquipments.getTrapeziusEquipment();

    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    private BACK[] backs = { BACK.BACK, BACK.ERECTOR_SPINAE, BACK.TRAPEZIUS };

    public BackHandler(
            ChoiceBox<String> back, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.back = back;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void backHandle() {
        displayArmImage(imagePath, display_muscle);

        equipmentHandler.updateEquipment(
                back, BACK.BACK, backEquipment,
                machine, cable, freeWeight);

        back.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number number, Number t1) {
                if (backs[t1.intValue()] == BACK.BACK) {
                    equipmentHandler.setEquipment(
                            backEquipment, machine, cable, freeWeight);
                } else if (backs[t1.intValue()] == BACK.ERECTOR_SPINAE) {
                    equipmentHandler.setEquipment(
                            erectorSpinaeEquipment, machine, cable, freeWeight);
                } else if (backs[t1.intValue()] == BACK.TRAPEZIUS) {
                    equipmentHandler.setEquipment(
                            trapeziusEquipment, machine, cable, freeWeight);
                } else {
                }
            }
        });
    }
}
