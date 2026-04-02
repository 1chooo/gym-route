package gym_route.handlers.Parts;

import gym_route.equipments.BodyPartEquipment;
import gym_route.equipments.LegEquipments;
import gym_route.handlers.MusclePartHandler;
import gym_route.handlers.PartEquipmentBinder;
import gym_route.parts.LEG;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class LegHandler extends MusclePartHandler {
    private final ChoiceBox<String> leg;
    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane display_muscle;

    private final String imagePath = "./src/main/resources/gym_route/imgs/parts/leg.jpg";

    private final LegEquipments legEquipments = new LegEquipments();
    private final BodyPartEquipment legEquipment = legEquipments.getLegEquipment();
    private final BodyPartEquipment hipEquipment = legEquipments.getHipEquipment();
    private final BodyPartEquipment quadricepsEquipment = legEquipments.getQuadricepsEquipment();
    private final BodyPartEquipment hamstringsEquipment = legEquipments.getHamstringsEquipment();
    private final BodyPartEquipment calfEquipment = legEquipments.getCalfEquipment();

    private final PartEquipmentBinder binder = new PartEquipmentBinder();
    private final BodyPartEquipment[] equipmentBySubPartOrder = {
            legEquipment, hipEquipment, quadricepsEquipment, hamstringsEquipment, calfEquipment
    };

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
        binder.bindMultiSubPart(
                leg, LEG.LEG, legEquipment, equipmentBySubPartOrder,
                machine, cable, freeWeight);
    }
}
