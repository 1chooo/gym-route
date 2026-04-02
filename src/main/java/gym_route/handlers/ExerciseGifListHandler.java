package gym_route.handlers;

import java.io.FileInputStream;
import java.nio.file.Path;

import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * Shows exercise GIFs in {@code display_muscle} when the user selects an item in machine/cable/free-weight
 * lists. GIF files are resolved under {@code <user.dir>/image/gif/} (same effective base as the former
 * machine handler’s absolute path and the former relative {@code ./image/gif/} when the app is run from
 * the project root).
 */
public class ExerciseGifListHandler extends MusclePartHandler {

    private static final Path GIF_DIR = Path.of(System.getProperty("user.dir"), "image", "gif");

    private static final String[] MACHINE_LABELS = {
            "機械胸推", "機械上斜胸推",
            "機械下斜胸推", "蝴蝶機夾胸",
            "史密斯胸推", "史密斯上斜胸推",
            "史密斯下斜胸推", "機械腿推",
            "機械腿伸展", "機械坐式腿屈曲",
            "機械臥式腿屈曲", "機械腿外展",
            "機械腿內收", "機械小腿伸展",
            "機械臀後踢", "機械臀橋",
            "史密斯早安式", "史密斯深蹲",
            "史密斯屈膝禮弓步", "史密斯保加利亞蹲",
            "史密斯頸前蹲", "史密斯哈克蹲",
            "史密斯臀橋", "機械水平划船",
            "機械反手高位下拉", "機械高位下拉",
            "機械引體向上", "史密斯滑船",
            "機械二頭彎曲", "機械三頭伸展",
            "機械肩推", "機械飛鳥",
            "蝴蝶機反向飛鳥", "機械腹部訓練",
            "機械腹部旋轉", "跑步機",
            "橢圓機", "樓梯機",
            "踏步車", "臥式健身車",
            "立式健身車", "划船機"
    };

    private static final String[] MACHINE_FILE_STEMS = {
            "Lying-Chest-Press-Machine", "Incline-Chest-Press-Machine",
            "Decline-Chest-Press-Machine", "Pec-Deck-Fly",
            "Smith-Machine-Bench-Press", "Smith-Machine-Incline-Bench-Press",
            "Smith-Machine-Decline-Bench-Press", "Leg-Press",
            "LEG-EXTENSION", "Seated-Leg-Curl", "Leg-Curl",
            "HiP-ABDUCTION-MACHINE", "HIP-ADDUCTION-MACHINE",
            "Lever-Seated-Calf-Raise", "Glute-Kickback-Machine",
            "Hip-Thrust-on-The-Leg-Extension-Machine", "Smith-Machine-Good-Morning",
            "BARBELL-SQUAT", "no-image-found",
            "Barbell-Bulgarian-Split-Squat", "Barbell-Bench-Front-Squat",
            "Barbell-Hack-Squat", "Barbell-Glute-Bridge",
            "Reverse-Grip-Machine-Row", "Reverse-Lat-Pulldown",
            "Front-Pulldown", "Assisted-Pull-up",
            "Smith-Machine-Bent-Over-Row", "Lever-Preacher-Curl",
            "Lever-Tricep-Extension", "Lever-Shoulder-Press",
            "Lateral-Raise-Machine", "Rear-Delt-Machine-Flys",
            "Seated-Crunch-Machine", "Lever-Seated-Twist",
            "Treadmill-", "Elliptical-Machine",
            "Walking-on-Stepmill", "Walk-Wave-Machine",
            "Recumbent-Exercise-Bike", "Bike",
            "Rowing-Machine"
    };

    private static final String[] CABLE_LABELS = {
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

    private static final String[] CABLE_FILE_STEMS = {
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

    private static final String[] FREE_WEIGHT_LABELS = {
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

    private static final String[] FREE_WEIGHT_FILE_STEMS = {
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

    private final ListView<String> machine;
    private final ListView<String> cable;
    private final ListView<String> freeWeight;
    private final Pane displayMuscle;

    public ExerciseGifListHandler(
            ListView<String> machine,
            ListView<String> cable,
            ListView<String> freeWeight,
            Pane displayMuscle) {
        this.machine = machine;
        this.cable = cable;
        this.freeWeight = freeWeight;
        this.displayMuscle = displayMuscle;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void handleMachineSelection(MouseEvent event) {
        showGifForSelection(machine, displayMuscle, MACHINE_LABELS, MACHINE_FILE_STEMS);
    }

    public void handleCableSelection(MouseEvent event) {
        showGifForSelection(cable, displayMuscle, CABLE_LABELS, CABLE_FILE_STEMS);
    }

    public void handleFreeWeightSelection(MouseEvent event) {
        showGifForSelection(freeWeight, displayMuscle, FREE_WEIGHT_LABELS, FREE_WEIGHT_FILE_STEMS);
    }

    private static void showGifForSelection(
            ListView<String> list,
            Pane displayMuscle,
            String[] labelsZh,
            String[] fileStemsEn) {
        String selected = list.getSelectionModel().getSelectedItem();
        if (selected == null) {
            return;
        }
        for (int i = 0; i < labelsZh.length; i++) {
            if (selected.equals(labelsZh[i])) {
                try {
                    Path gifPath = GIF_DIR.resolve(fileStemsEn[i] + ".gif");
                    Image image = new Image(new FileInputStream(gifPath.toFile()));
                    ImageView imageView = new ImageView(image);
                    imageView.setFitWidth(400);
                    imageView.setY(50);
                    displayMuscle.getChildren().remove(0, 1);
                    displayMuscle.getChildren().addAll(imageView);
                } catch (Exception e) {
                    // same as legacy handlers: swallow load errors
                }
                return;
            }
        }
    }
}
