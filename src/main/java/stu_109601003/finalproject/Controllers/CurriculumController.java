package stu_109601003.finalproject.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.*;

public class CurriculumController {

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

  /**
   * Announce the body parts.
   */

  // ------------------------

  /**
   * Chest Parts
   */

  // Machine Chest
  ArrayList<String> machineChestArray = new ArrayList<>();

  public void addMachineChestArray() {
    String[] action = {
        "機械胸推", "機械上斜胸推",
        "機械下斜胸推", "蝴蝶機夾胸",
        "史密斯胸推", "史密斯上斜胸推",
        "史密斯下斜胸推"
    };
    Collections.addAll(machineChestArray, action);
  }

  // Cable Chest
  ArrayList<String> cableChestArray = new ArrayList<>();

  public void addCableChestArray() {
    String[] action = {
        "cable夾胸", "cable低位夾胸",
        "cable高位夾胸"
    };
    Collections.addAll(cableChestArray, action);
  }

  // FreeWeight Chest
  ArrayList<String> freeWeightChestArray = new ArrayList<>();

  public void addFreeWeightChestArray() {
    String[] action = {
        "平板槓鈴臥推", "上斜槓鈴臥推",
        "下斜槓鈴臥推", "啞鈴飛鳥",
        "啞鈴下壓飛鳥", "啞鈴胸推",
        "啞鈴上斜胸推", "啞鈴下斜胸推",
        "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
        "啞鈴下斜胸推(窄握)", "啞鈴前平舉"
    };
    Collections.addAll(freeWeightChestArray, action);
  }

  // Machine Incline Chest
  ArrayList<String> machineInclineChestArray = new ArrayList<>();

  public void addMachineInclineChestArray() {
    String[] action = {
        "機械胸推", "機械上斜胸推",
        "史密斯胸推", "史密斯上斜胸推"
    };
    Collections.addAll(machineInclineChestArray, action);
  }

  // Cable Incline Chest
  ArrayList<String> cableInclineChestArray = new ArrayList<>();

  public void addCableInclineChestArray() {
    String[] action = {
        "cable高位夾胸", "cable低位夾胸"
    };
    Collections.addAll(cableInclineChestArray, action);
  }

  // FreeWeight Incline Chest
  ArrayList<String> freeWeightInclineChestArray = new ArrayList<>();

  public void addFreeWeightInclineChestArray() {
    String[] action = {
        "平板槓鈴臥推", "上斜槓鈴臥推",
        "啞鈴下壓飛鳥", "啞鈴胸推",
        "啞鈴上斜胸推", "啞鈴胸推(窄握)",
        "啞鈴上斜胸推(窄握)", "啞鈴前平舉"
    };
    Collections.addAll(freeWeightInclineChestArray, action);
  }

  // Machine Decline Chest
  ArrayList<String> machineDeclineChestArray = new ArrayList<>();

  public void addMachineDeclineChestArray() {
    String[] action = {
        "機械胸推", "機械下斜胸推",
        "蝴蝶機夾胸", "史密斯胸推",
        "史密斯下斜胸推"
    };
    Collections.addAll(machineDeclineChestArray, action);
  }

  // Cable Decline Chest
  ArrayList<String> cableDeclineChestArray = new ArrayList<>();

  public void addCableDeclineChestArray() {
    String[] action = {
        "cable夾胸", "cable高位夾胸",
        "cable低位夾胸"
    };
    Collections.addAll(cableDeclineChestArray, action);
  }

  // FreeWeight Decline Chest
  ArrayList<String> freeWeightDeclineChestArray = new ArrayList<>();

  public void addFreeWeightDeclineChestArray() {
    String[] action = {
        "平板槓鈴臥推", "下斜槓鈴臥推",
        "啞鈴飛鳥", "啞鈴下壓飛鳥",
        "啞鈴胸推", "啞鈴下斜胸推",
        "啞鈴胸推(窄握)", "啞鈴下斜胸推(窄握)",
        "啞鈴前平舉"
    };
    Collections.addAll(freeWeightDeclineChestArray, action);
  }

  /**
   * Leg Parts
   */

  // Machine Leg
  ArrayList<String> machineLegArray = new ArrayList<>();

  public void addMachineLegArrayArray() {
    String[] action = {
        "機械腿推", "機械腿伸展",
        "機械坐式腿屈曲", "機械臥式腿屈曲",
        "機械腿外展", "機械腿內收",
        "機械小腿伸展", "機械臀後踢",
        "機械臀橋", "史密斯早安式",
        "史密斯深蹲", "史密斯屈膝禮弓步",
        "史密斯保加利亞蹲", "史密斯頸前蹲",
        "史密斯哈克蹲", "史密斯臀橋"
    };
    Collections.addAll(machineLegArray, action);
  }

  // Cable Leg
  ArrayList<String> cableLegArray = new ArrayList<>();

  public void addCableLegArray() {
    String[] action = {
        "cable後踢", "cable側踢",
        "cable腿內收"
    };
    Collections.addAll(cableLegArray, action);
  }

  // FreeWeight Leg
  ArrayList<String> freeWeightLegArray = new ArrayList<>();

  public void addFreeWeightLegArray() {
    String[] action = {
        "深蹲", "啞鈴單腳蹲",
        "啞鈴保加利亞蹲", "啞鈴跨步蹲",
        "硬舉", "直膝硬舉",
        "羅馬尼亞硬舉", "啞鈴相撲蹲",
        "相撲硬舉", "槓鈴臀橋",
        "啞鈴提腫"
    };
    Collections.addAll(freeWeightLegArray, action);
  }

  // Machine Hip
  ArrayList<String> machineHipArray = new ArrayList<>();

  public void addMachineHipArrayArray() {
    String[] action = {
        "機械腿推", "機械腿外展",
        "機械腿內收", "機械臀後踢",
        "機械臀橋", "史密斯早安式",
        "史密斯深蹲", "史密斯屈膝禮弓步",
        "史密斯保加利亞蹲", "史密斯頸前蹲",
        "史密斯哈克蹲", "史密斯臀橋"
    };
    Collections.addAll(machineHipArray, action);
  }

  // Cable Hip
  ArrayList<String> cableHipArray = new ArrayList<>();

  public void addCableHipArray() {
    String[] action = {
        "cable後踢", "cable側踢",
        "cable腿內收"
    };
    Collections.addAll(cableHipArray, action);
  }

  // FreeWeight Hip
  ArrayList<String> freeWeightHipArray = new ArrayList<>();

  public void addFreeWeightHipArray() {
    String[] action = {
        "深蹲", "啞鈴單腳蹲",
        "啞鈴保加利亞蹲", "啞鈴跨步蹲",
        "硬舉", "直膝硬舉",
        "羅馬尼亞硬舉", "啞鈴相撲蹲",
        "相撲硬舉", "槓鈴臀橋"
    };
    Collections.addAll(freeWeightHipArray, action);
  }

  // Machine QuadricepsFemorisMuscle
  ArrayList<String> machineQuadricepsFemorisMuscleArray = new ArrayList<>();

  public void addMachineQuadricepsFemorisMuscleArrayArray() {
    String[] action = {
        "機械腿推", "啞鈴單腳蹲",
        "機械腿伸展", "史密斯深蹲",
        "史密斯屈膝禮弓步", "史密斯保加利亞蹲",
        "史密斯頸前蹲", "史密斯哈克蹲"
    };
    Collections.addAll(machineQuadricepsFemorisMuscleArray, action);
  }

  // Cable QuadricepsFemorisMuscle
  ArrayList<String> cableQuadricepsFemorisMuscleArray = new ArrayList<>();

  // FreeWeight QuadricepsFemorisMuscle
  ArrayList<String> freeWeightQuadricepsFemorisMuscleArray = new ArrayList<>();

  public void addFreeWeightQuadricepsFemorisMuscleArray() {
    String[] action = {
        "深蹲", "啞鈴單腳蹲",
        "啞鈴保加利亞蹲", "啞鈴跨步蹲",
        "硬舉", "羅馬尼亞硬舉",
        "啞鈴相撲蹲", "相撲硬舉"
    };
    Collections.addAll(freeWeightQuadricepsFemorisMuscleArray, action);
  }

  // Machine BicepsFemorisMuscle
  ArrayList<String> machineBicepsFemorisMuscleArray = new ArrayList<>();

  public void addMachineBicepsFemorisMuscleArray() {
    String[] action = {
        "機械腿推", "機械坐式腿屈曲",
        "機械臥式腿屈曲", "機械腿外展",
        "機械腿內收", "機械臀後踢",
        "機械臀橋", "史密斯早安式",
        "史密斯深蹲", "史密斯屈膝禮弓步",
        "史密斯保加利亞蹲", "史密斯頸前蹲",
        "史密斯哈克蹲", "史密斯臀橋"
    };
    Collections.addAll(machineBicepsFemorisMuscleArray, action);
  }

  // Cable BicepsFemorisMuscle
  ArrayList<String> cableBicepsFemorisMuscleArray = new ArrayList<>();

  public void addCableBicepsFemorisMuscleArray() {
    String[] action = {
        "cable後踢", "cable側踢",
        "cable腿內收"
    };
    Collections.addAll(cableBicepsFemorisMuscleArray, action);
  }

  // FreeWeight BicepsFemorisMuscle
  ArrayList<String> freeWeightBicepsFemorisMuscleArray = new ArrayList<>();

  public void addFreeWeightBicepsFemorisMuscleArray() {
    String[] action = {
        "深蹲", "啞鈴單腳蹲",
        "啞鈴保加利亞蹲", "啞鈴跨步蹲",
        "硬舉", "直膝硬舉",
        "羅馬尼亞硬舉", "啞鈴相撲蹲",
        "相撲硬舉", "槓鈴臀橋"
    };
    Collections.addAll(freeWeightBicepsFemorisMuscleArray, action);
  }

  // Machine Calf
  ArrayList<String> machineCalfArray = new ArrayList<>();

  public void addMachineCalfArray() {
    String[] action = {
        "機械小腿伸展"
    };
    Collections.addAll(machineCalfArray, action);
  }

  // Cable Calf
  ArrayList<String> cableCalfArray = new ArrayList<>();

  public void addCableCalfArray() {
    String[] action = {
        "cable後踢", "cable側踢",
        "cable腿內收"
    };
    Collections.addAll(cableCalfArray, action);
  }

  // FreeWeight Calf
  ArrayList<String> freeWeightCalfArray = new ArrayList<>();

  public void addFreeWeightCalfArray() {
    String[] action = {
        "啞鈴提腫"
    };
    Collections.addAll(freeWeightCalfArray, action);
  }

  /**
   * Back Parts
   */

  // Machine Back
  ArrayList<String> machineBackArray = new ArrayList<>();

  public void addMachineBackArray() {
    String[] action = {
        "機械水平划船", "機械反手高位下拉",
        "機械高位下拉", "機械引體向上",
        "史密斯滑船"
    };
    Collections.addAll(machineBackArray, action);
  }

  // Cable Back
  ArrayList<String> cableBackArray = new ArrayList<>();

  public void addCableBackArray() {
    String[] action = {
        "cable水平划船", "cable反手高位下拉",
        "cable高位下拉", "cable直臂下壓"
    };
    Collections.addAll(cableBackArray, action);
  }

  // FreeWeight Back
  ArrayList<String> freeWeightBackArray = new ArrayList<>();

  public void addFreeWeightBackArray() {
    String[] action = {
        "單臂啞鈴划船", "槓鈴划船",
        "w槓鈴划船", "直膝硬舉",
        "羅馬尼亞硬舉"
    };
    Collections.addAll(freeWeightBackArray, action);
  }

  // Machine ErectorSpinae
  ArrayList<String> machineErectorSpinaeArray = new ArrayList<>();

  // Cable ErectorSpinae
  ArrayList<String> cableErectorSpinaeArray = new ArrayList<>();

  // FreeWeight ErectorSpinae
  ArrayList<String> freeWeightErectorSpinaeArray = new ArrayList<>();

  public void addFreeWeightErectorSpinaeArray() {
    String[] action = {
        "直膝硬舉", "羅馬尼亞硬舉"
    };
    Collections.addAll(freeWeightErectorSpinaeArray, action);
  }

  // Machine TeresMuscle
  ArrayList<String> machineTeresMuscleArray = new ArrayList<>();

  public void addMachineTeresMuscleArray() {
    String[] action = {
        "機械反手高位下拉", "機械高位下拉",
        "機械引體向上", "史密斯滑船"
    };
    Collections.addAll(machineTeresMuscleArray, action);
  }

  // Cable TeresMuscle
  ArrayList<String> cableTeresMuscleArray = new ArrayList<>();

  public void addCableTeresMuscleArray() {
    String[] action = {
        "cable反手高位下拉", "cable高位下拉",
        "cable直臂下壓"
    };
    Collections.addAll(cableTeresMuscleArray, action);
  }

  // FreeWeight TeresMuscle
  ArrayList<String> freeWeightTeresMuscleArray = new ArrayList<>();

  public void addFreeWeightTeresMuscleArray() {
    String[] action = {
        "單臂啞鈴划船", "槓鈴划船",
        "w槓鈴划船" };
    Collections.addAll(freeWeightTeresMuscleArray, action);
  }

  /**
   * Shoulder Parts
   */

  // Machine Shoulder
  ArrayList<String> machineShoulderArray = new ArrayList<>();

  public void addMachineShoulderArray() {
    String[] action = {
        "機械肩推", "機械飛鳥",
        "蝴蝶機反向飛鳥"
    };
    Collections.addAll(machineShoulderArray, action);
  }

  // Cable Shoulder
  ArrayList<String> cableShoulderArray = new ArrayList<>();

  public void addCableShoulderArray() {
    String[] action = {
        "cable肩推", "cable側平舉",
        "cable臉拉", "cable上拉",
        "cable反向飛鳥", "cable聳肩"
    };
    Collections.addAll(cableShoulderArray, action);
  }

  // FreeWeight Shoulder
  ArrayList<String> freeWeightShoulderArray = new ArrayList<>();

  public void addFreeWeightShoulderArray() {
    String[] action = {
        "槓鈴肩推", "啞鈴肩推",
        "啞鈴前平舉", "啞鈴側平舉",
        "啞鈴Y平舉", "槓鈴上拉",
        "w槓上拉", "啞鈴反向飛鳥",
        "槓鈴聳肩", "啞鈴聳肩",
        "上斜槓鈴臥推"
    };
    Collections.addAll(freeWeightShoulderArray, action);
  }

  // Machine AnteriorDeltoid
  ArrayList<String> machineAnteriorDeltoidArray = new ArrayList<>();

  public void addMachineAnteriorDeltoidArray() {
    String[] action = {
        "機械肩推", "機械飛鳥"
    };
    Collections.addAll(machineAnteriorDeltoidArray, action);
  }

  // Cable AnteriorDeltoid
  ArrayList<String> cableAnteriorDeltoidArray = new ArrayList<>();

  public void addCableAnteriorDeltoidArray() {
    String[] action = {
        "cable肩推", "cable側平舉"
    };
    Collections.addAll(cableAnteriorDeltoidArray, action);
  }

  // FreeWeight AnteriorDeltoid
  ArrayList<String> freeWeightAnteriorDeltoidArray = new ArrayList<>();

  public void addFreeWeightAnteriorDeltoidArray() {
    String[] action = {
        "槓鈴肩推", "啞鈴肩推",
        "啞鈴前平舉", "啞鈴Y平舉",
        "上斜槓鈴臥推"
    };
    Collections.addAll(freeWeightAnteriorDeltoidArray, action);
  }

  // Machine LateralDeltoid
  ArrayList<String> machineLateralDeltoidArray = new ArrayList<>();

  public void addMachineLateralDeltoidArray() {
    String[] action = {
        "機械肩推", "機械飛鳥"
    };
    Collections.addAll(machineLateralDeltoidArray, action);
  }

  // Cable LateralDeltoid
  ArrayList<String> cableLateralDeltoidArray = new ArrayList<>();

  public void addCableLateralDeltoidArray() {
    String[] action = {
        "cable肩推", "cable側平舉",
        "cable上拉"
    };
    Collections.addAll(cableLateralDeltoidArray, action);
  }

  // FreeWeight LateralDeltoid
  ArrayList<String> freeWeightLateralDeltoidArray = new ArrayList<>();

  public void addFreeWeightLateralDeltoidArray() {
    String[] action = {
        "槓鈴肩推", "啞鈴肩推",
        "啞鈴側平舉", "啞鈴Y平舉",
        "槓鈴上拉", "w槓上拉"
    };
    Collections.addAll(freeWeightLateralDeltoidArray, action);
  }

  // Machine PosteriorDeltoid
  ArrayList<String> machinePosteriorDeltoidArray = new ArrayList<>();

  public void addMachinePosteriorDeltoidArray() {
    String[] action = {
        "蝴蝶機反向飛鳥"
    };
    Collections.addAll(machinePosteriorDeltoidArray, action);
  }

  // Cable PosteriorDeltoid
  ArrayList<String> cablePosteriorDeltoidArray = new ArrayList<>();

  public void addCablePosteriorDeltoidArray() {
    String[] action = {
        "cable臉拉", "cable反向飛鳥"
    };
    Collections.addAll(cablePosteriorDeltoidArray, action);
  }

  // FreeWeight PosteriorDel
  ArrayList<String> freeWeightPosteriorDeltoidArray = new ArrayList<>();

  public void addFreeWeightPosteriorDeltoidArray() {
    String[] action = {
        "啞鈴反向飛鳥"
    };
    Collections.addAll(freeWeightPosteriorDeltoidArray, action);
  }

  // Machine TrapeziusMuscle
  ArrayList<String> machineTrapeziusMuscleArray = new ArrayList<>();

  // Cable TrapeziusMuscle
  ArrayList<String> cableTrapeziusMuscleArray = new ArrayList<>();

  public void addCableTrapeziusMuscleArray() {
    String[] action = {
        "cable聳肩"
    };
    Collections.addAll(cableTrapeziusMuscleArray, action);
  }

  // FreeWeight TrapeziusMuscle
  ArrayList<String> freeTrapeziusMuscleHipArray = new ArrayList<>();

  public void addFreeTrapeziusMuscleHipArray() {
    String[] action = {
        "槓鈴聳肩", "啞鈴聳肩"
    };
    Collections.addAll(freeTrapeziusMuscleHipArray, action);
  }

  /**
   * Arm parts
   */

  // Machine Arm
  ArrayList<String> machineArmArray = new ArrayList<>();

  public void addMachineArmArray() {
    String[] action = {
        "機械二頭彎曲", "機械三頭伸展"
    };
    Collections.addAll(machineArmArray, action);
  }

  // Cable Arm
  ArrayList<String> cableArmArray = new ArrayList<>();

  public void addCableArmArray() {
    String[] action = {
        "cable二頭彎曲", "cable三頭伸展"
    };
    Collections.addAll(cableArmArray, action);
  }

  // FreeWeight Arm
  ArrayList<String> freeWeightArmArray = new ArrayList<>();

  public void addFreeWeightArmArray() {
    String[] action = {
        "啞鈴二頭彎曲", "啞鈴三頭伸展",
        "W槓二頭彎曲", "W槓三頭伸展",
        "槓鈴二頭彎曲", "槓鈴三頭伸展",
        "槓鈴窄握臥推"
    };
    Collections.addAll(freeWeightArmArray, action);
  }

  // Machine Biceps
  ArrayList<String> machineBicepsArray = new ArrayList<>();

  public void addMachineBicepsArray() {
    String[] action = {
        "機械二頭彎曲"
    };
    Collections.addAll(machineBicepsArray, action);
  }

  // Cable Biceps
  ArrayList<String> cableBicepsArray = new ArrayList<>();

  public void addCableBicepsArray() {
    String[] action = {
        "cable二頭彎曲"
    };
    Collections.addAll(cableBicepsArray, action);
  }

  // FreeWeight Biceps
  ArrayList<String> freeWeightBicepsArray = new ArrayList<>();

  public void addFreeWeightBicepsArray() {
    String[] action = {
        "啞鈴二頭彎曲", "W槓二頭彎曲",
        "槓鈴二頭彎曲"
    };
    Collections.addAll(freeWeightBicepsArray, action);
  }

  // MachineTriceps
  ArrayList<String> machineTricepsArray = new ArrayList<>();

  public void addMachineTricepsArray() {
    String[] action = {
        "機械三頭伸展"
    };
    Collections.addAll(machineTricepsArray, action);
  }

  // Cable Triceps
  ArrayList<String> cableTricepsArray = new ArrayList<>();

  public void addCableTricepsArray() {
    String[] action = {
        "cable三頭伸展"
    };
    Collections.addAll(cableBicepsArray, action);
  }

  // FreeWeight Triceps
  ArrayList<String> freeWeightTricepsArray = new ArrayList<>();

  public void addFreeWeightTricepsArray() {
    String[] action = {
        "啞鈴三頭伸展", "W槓三頭伸展",
        "槓鈴三頭伸展", "槓鈴窄握臥推"
    };
    Collections.addAll(freeWeightBicepsArray, action);
  }

  /**
   * Core Parts
   */

  // Machine Core
  // Cable Core
  // FreeWeight Core
  ArrayList<String> coreArray = new ArrayList<>();

  public void addCoreArray() {
    String[] action = {
        "機械腹部訓練", "機械腹部旋轉"
    };
    Collections.addAll(coreArray, action);
  }

  /**
   * Aerobic Parts
   */

  // Machine Aerobic
  // Cable Aerobic
  // FreeWeight Aerobic
  ArrayList<String> aerobicArray = new ArrayList<>();

  public void addAerobicArray() {
    String[] action = {
        "跑步機", "橢圓機",
        "樓梯機", "踏步車",
        "臥式健身車", "立式健身車",
        "划船機"
    };
    Collections.addAll(aerobicArray, action);
  }

  public void setBackButton() throws IOException {
    SceneController.switchScene(PAGE.HOME);
  }

  // weekday array initialize
  ArrayList<String> weekdayArray = new ArrayList<>();

  public void addWeekdayArray() throws IOException {
    String[] action = {
        "星期日", "星期一",
        "星期二", "星期三",
        "星期四", "星期五",
        "星期六"
    };
    Collections.addAll(weekdayArray, action);
  }

  public void setWeekday() throws IOException {
    weekday.getItems().addAll(weekdayArray);
  }

  // order array initialize
  ArrayList<String> orderArray = new ArrayList<>();

  public void addOrderArray() throws IOException {
    String[] action = {
        "1", "2",
        "3", "4",
        "5", "6",
        "7", "8"
    };
    Collections.addAll(orderArray, action);
  }

  public void setOrder() throws IOException {
    order.getItems().addAll(orderArray);
  }

  public void clickedChest() throws IOException {
    if (chest.getValue().toString().equals("胸")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineChestArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableChestArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightChestArray);
    } else if (chest.getValue().toString().equals("上胸")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineInclineChestArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableInclineChestArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightInclineChestArray);
    } else if (chest.getValue().toString().equals("下胸")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineDeclineChestArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableDeclineChestArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightDeclineChestArray);
    }
  }

  public void clickedLeg() throws IOException {
    if (leg.getValue().toString().equals("腳")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineLegArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableLegArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightLegArray);
    } else if (leg.getValue().toString().equals("臀")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineHipArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableHipArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightHipArray);
    } else if (leg.getValue().toString().equals("股四頭")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineQuadricepsFemorisMuscleArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableQuadricepsFemorisMuscleArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightQuadricepsFemorisMuscleArray);
    } else if (leg.getValue().toString().equals("股二頭")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineBicepsFemorisMuscleArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableBicepsFemorisMuscleArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightBicepsArray);
    } else if (leg.getValue().toString().equals("小腿")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineCalfArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableCalfArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightCalfArray);
    }
  }

  public void clickedBack() throws IOException {
    if (back.getValue().toString().equals("背")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineBackArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableBackArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightBackArray);
    } else if (back.getValue().toString().equals("豎脊肌")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineErectorSpinaeArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableErectorSpinaeArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightErectorSpinaeArray);
    } else if (back.getValue().toString().equals("圓肌")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineTeresMuscleArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableTeresMuscleArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightErectorSpinaeArray);
    }
  }

  public void clickedShoulder() throws IOException {
    if (shoulder.getValue().toString().equals("肩")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineShoulderArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableShoulderArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightShoulderArray);
    } else if (shoulder.getValue().toString().equals("前束")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineAnteriorDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableAnteriorDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightAnteriorDeltoidArray);
    } else if (shoulder.getValue().toString().equals("中束")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineLateralDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableLateralDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightLateralDeltoidArray);
    } else if (shoulder.getValue().toString().equals("後束")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machinePosteriorDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cablePosteriorDeltoidArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightPosteriorDeltoidArray);
    } else if (shoulder.getValue().toString().equals("斜方肌")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineTeresMuscleArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableTrapeziusMuscleArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(cableTrapeziusMuscleArray);
    }
  }

  public void clickedArm() throws IOException {
    if (arm.getValue().toString().equals("手臂")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineArmArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableArmArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightArmArray);
    } else if (arm.getValue().toString().equals("肱二頭")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineBicepsArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableBicepsArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightBicepsArray);
    } else if (arm.getValue().toString().equals("肱三頭")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----機械-----");
      wholeComboBox.getItems().addAll(machineTricepsArray);
      wholeComboBox.getItems().addAll("", "-----纜繩-----");
      wholeComboBox.getItems().addAll(cableTricepsArray);
      wholeComboBox.getItems().addAll("", "-----自由重量-----");
      wholeComboBox.getItems().addAll(freeWeightTricepsArray);
    }
  }

  public void clickedCore() throws IOException {
    if (core.getValue().toString().equals("核心")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----核心-----");
      wholeComboBox.getItems().addAll(coreArray);
    }
  }

  public void clickedAerobic() throws IOException {
    if (aerobic.getValue().toString().equals("有氧")) {
      wholeComboBox.getItems().clear();
      wholeComboBox.getItems().addAll("-----有氧-----");
      wholeComboBox.getItems().addAll(aerobicArray);
    }
  }

  public void clickedClear() throws IOException {
    wholeComboBox.getItems().clear();
    status.setText("已清空選項");
    sets.clear();
    times.clear();
    order.setValue("1");// 順序序順
    weekday.setValue("星期日");// 星期
  }

  // Column: weekday; Row: order

  static ArrayList<ArrayList<String>> screenArrayList = new ArrayList<>();
  ObservableList<String> screenlist = FXCollections.observableArrayList();

  public void clickedEnter() throws IOException {
    try {
      ArrayList<String> tmp = new ArrayList<>();
      tmp.add(weekday.getValue().toString());
      tmp.add(order.getValue().toString());
      tmp.add(wholeComboBox.getValue().toString() + " " + times.getText() + "下 X " + sets.getText() + "組");
      screenArrayList.add(tmp);
      status.setText("恭喜你輸入成功");
      // ObservableList<String> screenlist = FXCollections.observableArrayList();
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

  public void clickedClearRow() throws IOException {
    try {
      int screen_index = screen.getSelectionModel().getSelectedIndex();
      if (screen_index == -1) {
        status.setText("請選取清單欲刪除資料");
      } else {
        int column = dict.get(screenArrayList.get(screen_index).get(0));
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

  // Used by previewController
  static String[][] curriculumForWeek = new String[8][7];
  Dictionary<String, Integer> dict = new Hashtable<>();

  public void loadScreenArray() throws IOException {
    for (ArrayList<String> temp : screenArrayList) {
      int column = dict.get(temp.get(0));
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
    // loadScreenArray
    dict.put("星期日", 0);
    dict.put("星期一", 1);
    dict.put("星期二", 2);
    dict.put("星期三", 3);
    dict.put("星期四", 4);
    dict.put("星期五", 5);
    dict.put("星期六", 6);
    //
    addMachineChestArray();
    addCableChestArray();
    addFreeWeightChestArray();
    addMachineInclineChestArray();
    addCableInclineChestArray();
    addFreeWeightInclineChestArray();
    addMachineDeclineChestArray();
    addCableDeclineChestArray();
    addFreeWeightDeclineChestArray();
    addMachineLegArrayArray();
    addCableLegArray();
    addFreeWeightLegArray();
    addMachineHipArrayArray();
    addCableHipArray();
    addFreeWeightHipArray();
    addMachineQuadricepsFemorisMuscleArrayArray();
    addFreeWeightQuadricepsFemorisMuscleArray();
    addMachineBicepsFemorisMuscleArray();
    addCableBicepsFemorisMuscleArray();
    addFreeWeightBicepsFemorisMuscleArray();
    addMachineCalfArray();
    addCableCalfArray();
    addFreeWeightCalfArray();
    addMachineBackArray();
    addCableBackArray();
    addFreeWeightBackArray();
    addFreeWeightErectorSpinaeArray();
    addMachineTeresMuscleArray();
    addCableTeresMuscleArray();
    addFreeWeightTeresMuscleArray();
    addMachineShoulderArray();
    addCableShoulderArray();
    addFreeWeightShoulderArray();
    addMachineAnteriorDeltoidArray();
    addCableAnteriorDeltoidArray();
    addFreeWeightAnteriorDeltoidArray();
    addMachineLateralDeltoidArray();
    addCableLateralDeltoidArray();
    addFreeWeightLateralDeltoidArray();
    addMachinePosteriorDeltoidArray();
    addCablePosteriorDeltoidArray();
    addFreeWeightPosteriorDeltoidArray();
    addCableTrapeziusMuscleArray();
    addFreeTrapeziusMuscleHipArray();
    addMachineArmArray();
    addCableArmArray();
    addFreeWeightArmArray();
    addMachineBicepsArray();
    addCableBicepsArray();
    addFreeWeightBicepsArray();
    addMachineTricepsArray();
    addCableTricepsArray();
    addFreeWeightTricepsArray();
    addCoreArray();
    addAerobicArray();
    addWeekdayArray();
    addOrderArray();
    setWeekday();
    setOrder();
  }
}