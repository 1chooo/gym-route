// ChestHandler.java
package gym_route.handlers.Parts;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.LegEquipments;
import gym_route.handlers.EquipmentHandler;
import gym_route.handlers.MusclePartHandler;
import gym_route.parts.LEG;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

public class LegHandler extends MusclePartHandler {
    private ChoiceBox<String> leg;
    private ListView<String> machine;
    private ListView<String> cable;
    private ListView<String> freeWeight;
    private Pane display_muscle;

    private String imagePath = "./src/main/resources/gym_route/imgs/parts/leg.jpg";

    private LEG[] legs = { LEG.LEG, LEG.HIP, LEG.QUADRICEPS, LEG.HAMSTRINGS, LEG.CALF };
    private LegEquipments legEquipments = new LegEquipments();
    private BodyPartEquipment legEquipment = legEquipments.getLegEquipment();
    private BodyPartEquipment hipEquipment = legEquipments.getHipEquipment();
    private BodyPartEquipment quadricepsEquipment = legEquipments.getQuadricepsEquipment();
    private BodyPartEquipment hamstringsEquipment = legEquipments.getHamstringsEquipment();
    private BodyPartEquipment calfEquipment = legEquipments.getCalfEquipment();

    private EquipmentHandler equipmentHandler = new EquipmentHandler();

    public LegHandler(
            ChoiceBox<String> leg, Pane display_muscle,
            ListView<String> machine, ListView<String> cable,
            ListView<String> freeWeight) {
        this.leg = leg;
        this.display_muscle = display_muscle;
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void legHandle() {
        displayArmImage(imagePath, display_muscle);

        equipmentHandler.updateEquipment(
                leg, LEG.LEG, legEquipment,
                machine, cable, freeWeight);

        leg.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number number, Number t1) {
                if (legs[t1.intValue()] == LEG.LEG) {
                    equipmentHandler.setEquipment(
                            legEquipment, machine, cable, freeWeight);
                } else if (legs[t1.intValue()] == LEG.HIP) {
                    equipmentHandler.setEquipment(
                            hipEquipment, machine, cable, freeWeight);
                } else if (legs[t1.intValue()] == LEG.QUADRICEPS) {
                    equipmentHandler.setEquipment(
                            quadricepsEquipment, machine, cable, freeWeight);
                } else if (legs[t1.intValue()] == LEG.HAMSTRINGS) {
                    equipmentHandler.setEquipment(
                            hamstringsEquipment, machine, cable, freeWeight);
                } else if (legs[t1.intValue()] == LEG.CALF) {
                    equipmentHandler.setEquipment(
                            calfEquipment, machine, cable, freeWeight);
                } else {
                }
            }
        });
    }
}