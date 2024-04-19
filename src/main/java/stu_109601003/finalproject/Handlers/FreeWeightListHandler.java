package stu_109601003.finalproject.Handlers;

import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import java.io.FileInputStream;

public class FreeWeightListHandler extends MuscleHandler {

    private Pane display_muscle;
    private ListView<String> freeWeight;

    public FreeWeightListHandler(
            ListView<String> freeWeight, Pane display_muscle) {
        this.freeWeight = freeWeight;
        this.display_muscle = display_muscle;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void handleFreeWeightSelection(MouseEvent event) {
        String[] freeWeightAction = {
                "平板槓鈴臥推", "上斜槓鈴臥推",
                "下斜槓鈴臥推", "啞鈴飛鳥",
                "啞鈴下壓飛鳥", "啞鈴胸推",
                "啞鈴上斜胸推", "啞鈴下斜胸推",
                "啞鈴胸推(窄握)", "啞鈴上斜胸推(窄握)",
                "啞鈴下斜胸推(窄握)", "啞鈴前平舉",
                "深蹲", "啞鈴單腳蹲",
                "啞鈴保加利亞蹲", "啞鈴跨步蹲",
                "直膝硬舉", "羅馬尼亞硬舉",
                "啞鈴相撲蹲", "相撲硬舉",
                "啞鈴提腫", "槓鈴臀橋",
                "硬舉", "單臂啞鈴划船",
                "槓鈴划船", "w槓鈴划船",
                "啞鈴二頭彎曲", "啞鈴三頭伸展",
                "W槓二頭彎曲", "W槓三頭伸展",
                "槓鈴二頭彎曲", "槓鈴窄握臥推",
                "槓鈴三頭伸展", "槓鈴肩推",
                "啞鈴肩推", "啞鈴側平舉",
                "啞鈴Y平舉", "槓鈴上拉",
                "w槓上拉", "啞鈴反向飛鳥",
                "槓鈴聳肩", "啞鈴聳肩"
        };
        String[] freeWeightActionEnglish = {
                "Barbell-Bench-Press", "Incline-Barbell-Bench-Press",
                "Decline-Barbell-Bench-Press", "Dumbbell-Fly",
                "Dumbbell-Pullover", "Dumbbell-Press",
                "Incline-Dumbbell-Press", "Decline-Dumbbell-Press",
                "Close-Grip-Dumbbell-Press", "Close-grip-Incline-Dumbbell-Press",
                "Decline-hammer-press", "Two-Arm-Dumbbell-Front-Raise",
                "BARBELL-SQUAT", "Kettlebell-Pistol-Squats",
                "Dumbbell-Bulgarian-Split-Squat", "Dumbbell-Lunge",
                "Stiff-Leg-Deadlift", "Barbell-Romanian-Deadlift",
                "Barbell-sumo-squat", "Barbell-Sumo-Deadlift",
                "Dumbbell-Calf-Raise", "Barbell-Glute-Bridge",
                "Barbell-Deadlift", "Dumbbell-Row",
                "Reverse-Grip-Barbell-Row", "Reverse-Grip-Barbell-Row",
                "Double-Arm-Dumbbell-Curl", "Seated-Dumbbell-Triceps-Extension",
                "Z-Bar-Preacher-Curl", "Seated-EZ-Bar-Overhead-Triceps-Extension",
                "Barbell-Curl", "Close-Grip-Bench-Press",
                "Barbell-Triceps-Extension", "Barbell-Shoulder-Press",
                "Dumbbell-Shoulder-Press", "Dumbbell-Lateral-Raise",
                "Incline-Dumbbell-Y-Raise", "barbell-uprightrow",
                "Barbell-Upright-Row", "Bent-Over-Lateral-Raise",
                "Barbell-Shrug", "Dumbbell-Shrug"
        };
        for (int i = 0; i < freeWeightAction.length; i++) {
            if (freeWeight.getSelectionModel().selectedItemProperty().getValue()
                    .equals(freeWeightAction[i])) {
                try {
                    Image image = new Image(new FileInputStream(
                            "./image/gif/" + freeWeightActionEnglish[i] + ".gif"));
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
