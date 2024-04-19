// BaseHandler.java
package stu_109601003.finalproject.Handlers;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public abstract class MuscleHandler implements EventHandler<MouseEvent> {

    @Override
    public abstract void handle(MouseEvent event);

    
}