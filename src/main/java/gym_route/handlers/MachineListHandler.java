package gym_route.handlers;

import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import java.io.FileInputStream;

public class MachineListHandler extends MusclePartHandler {

    private Pane display_muscle;
    private ListView<String> machine;

    public MachineListHandler(
            ListView<String> machine, Pane display_muscle) {
        this.machine = machine;
        this.display_muscle = display_muscle;
    }

    @Override
    public void handle(MouseEvent event) {
    }

    public void handleMachineSelection(MouseEvent event) {
        String[] machineAction = {
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
        String[] machineActionEnglish = {
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
        for (int i = 0; i < machineAction.length; i++) {
            if (machine.getSelectionModel().selectedItemProperty().getValue().equals(machineAction[i])) {
                try {
                    Image image = new Image(new FileInputStream(
                            System.getProperty("user.dir") + "/image/gif/" + machineActionEnglish[i] + ".gif"));
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
