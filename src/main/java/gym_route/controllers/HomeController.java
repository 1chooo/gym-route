package gym_route.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

import gym_route.handlers.CableListHandler;
import gym_route.handlers.FreeWeightListHandler;
import gym_route.handlers.MachineListHandler;
import gym_route.handlers.Parts.AerobicHandler;
import gym_route.handlers.Parts.ArmHandler;
import gym_route.handlers.Parts.BackHandler;
import gym_route.handlers.Parts.ChestHandler;
import gym_route.handlers.Parts.CoreHandler;
import gym_route.handlers.Parts.LegHandler;
import gym_route.handlers.Parts.ShoulderHandler;

public class HomeController {
    @FXML
    VBox main_page;
    @FXML
    Button back_b;
    @FXML
    ChoiceBox<String> chest;
    @FXML
    ChoiceBox<String> leg;
    @FXML
    ChoiceBox<String> back;
    @FXML
    ChoiceBox<String> shoulder;
    @FXML
    ChoiceBox<String> arm;
    @FXML
    ChoiceBox<String> core;
    @FXML
    ChoiceBox<String> aerobic;
    @FXML
    Pane display_muscle;
    @FXML
    ListView<String> machine;
    @FXML
    ListView<String> cable;
    @FXML
    ListView<String> freeWeight;
    @FXML
    Label sets_times;
    @FXML
    Label contact_us;
    @FXML
    Button set_table;

    private ChestHandler chestHandler;
    private LegHandler legHandler;
    private BackHandler backHandler;
    private ShoulderHandler shoulderHandler;
    private ArmHandler armHandler;
    private CoreHandler coreHandler;
    private AerobicHandler aerobicHandler;

    private MachineListHandler machineListHandler;
    private CableListHandler cableListHandler;
    private FreeWeightListHandler freeWeightListHandler;

    @FXML
    public void initialize() {
        chestHandler = new ChestHandler(
                chest, display_muscle,
                machine, cable, freeWeight);
        legHandler = new LegHandler(
                leg, display_muscle,
                machine, cable, freeWeight);
        backHandler = new BackHandler(
                back, display_muscle,
                machine, cable, freeWeight);
        shoulderHandler = new ShoulderHandler(
                shoulder, display_muscle,
                machine, cable, freeWeight);
        armHandler = new ArmHandler(
                arm, display_muscle,
                machine, cable, freeWeight);
        coreHandler = new CoreHandler(
                core, display_muscle,
                machine, cable, freeWeight);
        aerobicHandler = new AerobicHandler(
                aerobic, display_muscle,
                machine, cable, freeWeight);

        machineListHandler = new MachineListHandler(
                machine, display_muscle);
        cableListHandler = new CableListHandler(
                cable, display_muscle);
        freeWeightListHandler = new FreeWeightListHandler(
                freeWeight, display_muscle);
    }

    public void handle(MouseEvent event) {
    }

    public void clickedChest(MouseEvent event) {
        chestHandler.chestHandle();
    }

    public void clickedLeg(MouseEvent event) {
        legHandler.legHandle();
    }

    public void clickedBack(MouseEvent event) {
        backHandler.backHandle();
    }

    public void clickedShoulder(MouseEvent event) {
        shoulderHandler.shoulderHandle();
    }

    public void clickedArm(MouseEvent event) {
        armHandler.armHandle();
    }

    public void clickedCore(MouseEvent event) {
        coreHandler.coreHandle();
    }

    public void clickedAerobic(MouseEvent event) {
        aerobicHandler.aerobicHandle();
    }

    public void clickedMachineList(MouseEvent event) {
        machineListHandler.handleMachineSelection(event);
    }

    public void clickedCableList(MouseEvent event) {
        cableListHandler.handleCableSelection(event);
    }

    public void clickedFreeWeightList(MouseEvent event) {
        freeWeightListHandler.handleFreeWeightSelection(event);
    }

    public void clickedPreviousPage() throws IOException {
        SceneController.switchScene(PAGE.LOGIN);
    }

    public void clickedNextPage() throws IOException {
        SceneController.switchScene(PAGE.CURRICULUM);
    }
}
