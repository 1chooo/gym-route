package gym_route.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gym_route.equipments.AerobicEquipments;
import gym_route.equipments.ArmEquipments;
import gym_route.equipments.BackEquipments;
import gym_route.equipments.ChestEquipments;
import gym_route.equipments.CoreEquipments;
import gym_route.equipments.CurriculumComboFiller;
import gym_route.equipments.LegEquipments;
import gym_route.equipments.ShoulderEquipments;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CurriculumController {

    /** Display order matches {@link #curriculumForWeek} column index (0 = Sunday). */
    public static final List<String> WEEKDAY_NAMES = List.of(
            "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");

    private static final Map<String, Integer> WEEKDAY_TO_COLUMN;

    static {
        Map<String, Integer> columnByWeekday = new HashMap<>();
        for (int i = 0; i < WEEKDAY_NAMES.size(); i++) {
            columnByWeekday.put(WEEKDAY_NAMES.get(i), i);
        }
        WEEKDAY_TO_COLUMN = Map.copyOf(columnByWeekday);
    }

    /**
     * Legacy bug: “股二頭” populated the free-weight section from the arm biceps list (preserved).
     */
    private static final List<String> LEGACY_HAMSTRINGS_FREE_USES_BICEPS_LIST = List.of(
            "啞鈴二頭彎曲", "W槓二頭彎曲", "槓鈴二頭彎曲");

    /**
     * Legacy: triceps cable/free arrays were never populated in {@code initialize} (preserved).
     */
    private static final List<String> LEGACY_EMPTY_TRICEPS_SECTION = List.of();

    @FXML
    VBox title;
    @FXML
    Button backButton;
    @FXML
    ChoiceBox chest;
    @FXML
    ChoiceBox leg;
    @FXML
    ChoiceBox back;
    @FXML
    ChoiceBox shoulder;
    @FXML
    ChoiceBox arm;
    @FXML
    ChoiceBox core;
    @FXML
    ChoiceBox aerobic;
    @FXML
    ComboBox wholeComboBox;
    @FXML
    Label weekdayLabel;
    @FXML
    ComboBox weekday;
    @FXML
    Label setsLabel;
    @FXML
    TextField sets;
    @FXML
    Label timesLabel;
    @FXML
    TextField times;
    @FXML
    Label orderLabel;
    @FXML
    ComboBox order;
    @FXML
    Button enter;
    @FXML
    Button clear;
    @FXML
    Label status;
    @FXML
    ListView<String> screen;
    @FXML
    Button deleteList;
    @FXML
    Button previewButton;

    private final ChestEquipments chestEquipments = new ChestEquipments();
    private final LegEquipments legEquipments = new LegEquipments();
    private final BackEquipments backEquipments = new BackEquipments();
    private final ShoulderEquipments shoulderEquipments = new ShoulderEquipments();
    private final ArmEquipments armEquipments = new ArmEquipments();
    private final CoreEquipments coreEquipments = new CoreEquipments();
    private final AerobicEquipments aerobicEquipments = new AerobicEquipments();

    private final ArrayList<String> orderArray = new ArrayList<>();

    public void setBackButton() throws IOException {
        SceneController.switchScene(PAGE.HOME);
    }

    public void setWeekday() {
        weekday.getItems().addAll(WEEKDAY_NAMES);
    }

    public void addOrderArray() {
        String[] action = {
                "1", "2", "3", "4", "5", "6", "7", "8"
        };
        Collections.addAll(orderArray, action);
    }

    public void setOrder() {
        order.getItems().addAll(orderArray);
    }

    public void clickedChest() {
        String value = chest.getValue() != null ? chest.getValue().toString() : null;
        if (value == null) {
            return;
        }
        if (value.equals("胸")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), chestEquipments.getChestEquipment());
        } else if (value.equals("上胸")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), chestEquipments.getUpperChestEquipment());
        } else if (value.equals("下胸")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), chestEquipments.getLowerChestEquipment());
        }
    }

    public void clickedLeg() {
        String value = leg.getValue() != null ? leg.getValue().toString() : null;
        if (value == null) {
            return;
        }
        if (value.equals("腳")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), legEquipments.getLegEquipment());
        } else if (value.equals("臀")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), legEquipments.getHipEquipment());
        } else if (value.equals("股四頭")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), legEquipments.getQuadricepsEquipment());
        } else if (value.equals("股二頭")) {
            CurriculumComboFiller.fillThreeSections(
                    wholeComboBox.getItems(),
                    legEquipments.getHamstringsEquipment().getMechanicalEquipment(),
                    legEquipments.getHamstringsEquipment().getCableEquipment(),
                    LEGACY_HAMSTRINGS_FREE_USES_BICEPS_LIST);
        } else if (value.equals("小腿")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), legEquipments.getCalfEquipment());
        }
    }

    public void clickedBack() {
        String value = back.getValue() != null ? back.getValue().toString() : null;
        if (value == null) {
            return;
        }
        if (value.equals("背")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), backEquipments.getBackEquipment());
        } else if (value.equals("豎脊肌")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), backEquipments.getErectorSpinaeEquipment());
        } else if (value.equals("圓肌")) {
            CurriculumComboFiller.fillThreeSections(
                    wholeComboBox.getItems(),
                    backEquipments.getTrapeziusEquipment().getMechanicalEquipment(),
                    backEquipments.getTrapeziusEquipment().getCableEquipment(),
                    backEquipments.getErectorSpinaeEquipment().getFreeWeightEquipment());
        }
    }

    public void clickedShoulder() {
        String value = shoulder.getValue() != null ? shoulder.getValue().toString() : null;
        if (value == null) {
            return;
        }
        if (value.equals("肩")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), shoulderEquipments.getShoulderEquipment());
        } else if (value.equals("前束")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), shoulderEquipments.getFrontDeltoidEquipment());
        } else if (value.equals("中束")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), shoulderEquipments.getMiddleDeltoidEquipment());
        } else if (value.equals("後束")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), shoulderEquipments.getRearDeltoidEquipment());
        } else if (value.equals("斜方肌")) {
            CurriculumComboFiller.fillMechanicalCableAndCableAsFree(
                    wholeComboBox.getItems(),
                    backEquipments.getTrapeziusEquipment().getMechanicalEquipment(),
                    shoulderEquipments.getTrapeziusEquipment().getCableEquipment());
        }
    }

    public void clickedArm() {
        String value = arm.getValue() != null ? arm.getValue().toString() : null;
        if (value == null) {
            return;
        }
        if (value.equals("手臂")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), armEquipments.getArmEquipment());
        } else if (value.equals("肱二頭")) {
            CurriculumComboFiller.fillMechanicalCableFreeWeight(
                    wholeComboBox.getItems(), armEquipments.getBicepsEquipment());
        } else if (value.equals("肱三頭")) {
            CurriculumComboFiller.fillThreeSections(
                    wholeComboBox.getItems(),
                    armEquipments.getTricepsEquipment().getMechanicalEquipment(),
                    LEGACY_EMPTY_TRICEPS_SECTION,
                    LEGACY_EMPTY_TRICEPS_SECTION);
        }
    }

    public void clickedCore() {
        if (core.getValue() != null && core.getValue().toString().equals("核心")) {
            CurriculumComboFiller.fillCoreSection(
                    wholeComboBox.getItems(), coreEquipments.getCoreEquipment());
        }
    }

    public void clickedAerobic() {
        if (aerobic.getValue() != null && aerobic.getValue().toString().equals("有氧")) {
            CurriculumComboFiller.fillAerobicSection(
                    wholeComboBox.getItems(), aerobicEquipments.getAerobicEquipment());
        }
    }

    public void clickedClear() {
        wholeComboBox.getItems().clear();
        status.setText("已清空選項");
        sets.clear();
        times.clear();
        order.setValue("1");
        weekday.setValue(WEEKDAY_NAMES.get(0));
    }

    static ArrayList<ArrayList<String>> screenArrayList = new ArrayList<>();
    ObservableList<String> screenlist = FXCollections.observableArrayList();

    public void clickedEnter() {
        try {
            ArrayList<String> tmp = new ArrayList<>();
            tmp.add(weekday.getValue().toString());
            tmp.add(order.getValue().toString());
            tmp.add(wholeComboBox.getValue().toString() + " " + times.getText() + "下 X " + sets.getText() + "組");
            screenArrayList.add(tmp);
            status.setText("恭喜你輸入成功");
            screenlist.clear();
            for (int i = 0; i < screenArrayList.size(); i++) {
                screenlist.add(screenArrayList.get(i).get(0) + ", " + screenArrayList.get(i).get(1) + ", "
                        + screenArrayList.get(i).get(2));
            }
            screen.setItems(screenlist);
        } catch (Exception exception) {
            status.setText("請選取動作");
            status.setVisible(true);
        }
    }

    public void clickedClearRow() {
        try {
            int screen_index = screen.getSelectionModel().getSelectedIndex();
            if (screen_index == -1) {
                status.setText("請選取清單欲刪除資料");
            } else {
                int column = WEEKDAY_TO_COLUMN.get(screenArrayList.get(screen_index).get(0));
                int row = Integer.parseInt(screenArrayList.get(screen_index).get(1)) - 1;

                screenArrayList.remove(screen_index);
                screenlist.clear();
                for (int i = 0; i < screenArrayList.size(); i++) {
                    screenlist.add(screenArrayList.get(i).get(0) + ", " + screenArrayList.get(i).get(1) + ", "
                            + screenArrayList.get(i).get(2));
                }
                screen.setItems(screenlist);
                curriculumForWeek[row][column] = null;
                PreviewController.displayScreenArrayToPreview();
            }
        } catch (Exception e) {
            status.setText("請選取清單欲刪除資料");
        }
    }

    static String[][] curriculumForWeek = new String[8][7];

    public void loadScreenArray() throws IOException {
        for (ArrayList<String> temp : screenArrayList) {
            int column = WEEKDAY_TO_COLUMN.get(temp.get(0));
            int row = Integer.parseInt(temp.get(1)) - 1;
            curriculumForWeek[row][column] = temp.get(2);
        }
        PreviewController.displayScreenArrayToPreview();
    }

    public void clickedPreview() throws IOException {
        SceneController.switchScene(PAGE.PREVIEW);
        loadScreenArray();
    }

    @FXML
    private void initialize() throws IOException {
        addOrderArray();
        setWeekday();
        setOrder();
    }
}
