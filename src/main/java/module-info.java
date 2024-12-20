module final_project {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;

  opens final_project to javafx.fxml;
  opens final_project.controllers to javafx.fxml;

  exports final_project;
  exports final_project.controllers;
  exports final_project.handlers;
  exports final_project.handlers.Parts;
  exports final_project.equipments;
  exports final_project.parts;
}
