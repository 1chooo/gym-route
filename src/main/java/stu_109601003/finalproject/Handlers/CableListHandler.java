package stu_109601003.finalproject.Handlers;

import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import java.io.FileInputStream;

public class CableListHandler extends MusclePartHandler {

    private ListView<String> cable;
    private Pane display_muscle;

    public CableListHandler(
            ListView<String> cable, Pane display_muscle) {
        this.cable = cable;
        this.display_muscle = display_muscle;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void handleCableSelection(MouseEvent event) {
        String[] cableAction = {
                "cable夾胸", "cable低位夾胸",
                "cable高位夾胸", "cable後踢",
                "cable側踢", "cable腿內收",
                "cable水平划船", "cable反手高位下拉",
                "cable高位下拉", "cable直臂下壓",
                "cable二頭彎曲", "cable三頭伸展",
                "cable肩推", "cable側平舉",
                "cable臉拉", "cable反向飛鳥",
                "cable上拉", "cable聳肩"
        };
        String[] cableActionEnglish = {
                "Cable-Crossover", "Low-Cable-Crossover",
                "High-Cable-Crossover", "Cable-Hip-Extension",
                "Cable-Hip-Abduction", "Cable-Hips-Adduction",
                "close-grip-cable-row", "Reverse-Lat-Pulldown",
                "Lat-Pulldown", "Rope-Straight-Arm-Pulldown",
                "High-Cable-Single-Arm-Bicep-Curl", "Pushdown",
                "Cable-Shoulder-Press", "Cable-Lateral-Raise",
                "Face-Pull", "cable-rear-delt-fly",
                "Cable-Upright-Row", "Cable-Shrug"
        };
        for (int i = 0; i < cableAction.length; i++) {
            if (cable.getSelectionModel().selectedItemProperty().getValue().equals(cableAction[i])) {
                try {
                    Image image = new Image(new FileInputStream(
                            "./image/gif/" + cableActionEnglish[i] + ".gif"));
                    ImageView imageView = new ImageView(image);
                    imageView.setFitWidth(400);
                    imageView.setY(50);
                    display_muscle.getChildren().remove(0, 1);
                    display_muscle.getChildren().addAll(imageView);
                } catch (Exception e) {
                }
            } else {
            }
        }
    }
}
