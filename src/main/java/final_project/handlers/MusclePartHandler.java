// BaseHandler.java
package final_project.handlers;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public abstract class MusclePartHandler implements EventHandler<MouseEvent> {

    @Override
    public abstract void handle(MouseEvent event);

    public void displayArmImage(String path, Pane display_muscle) {
        try {
            Image image = new Image(
                    new FileInputStream(path));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(400);
            imageView.setFitHeight(220);
            imageView.setY(50);
            display_muscle.getChildren().clear();
            display_muscle.getChildren().addAll(imageView);
        } catch (Exception e) {
            // 在此處理例外
        }
    }
}