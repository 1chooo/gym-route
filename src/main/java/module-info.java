module gym_route {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;

  opens gym_route to javafx.fxml;
  opens gym_route.controllers to javafx.fxml;

  exports gym_route;
  exports gym_route.controllers;
  exports gym_route.handlers;
  exports gym_route.handlers.Parts;
  exports gym_route.equipments;
  exports gym_route.parts;
}
