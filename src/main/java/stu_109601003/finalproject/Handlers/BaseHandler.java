// BaseHandler.java
package stu_109601003.finalproject.Handlers;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public abstract class BaseHandler implements EventHandler<MouseEvent> {

    @Override
    public abstract void handle(MouseEvent event);
}