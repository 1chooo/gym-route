module stu_109601003.final_project {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;

  opens stu_109601003.final_project to javafx.fxml;
  opens stu_109601003.final_project.controllers to javafx.fxml;

  exports stu_109601003.final_project;
  exports stu_109601003.final_project.controllers;
  exports stu_109601003.final_project.handlers;
  exports stu_109601003.final_project.handlers.Parts;
  exports stu_109601003.final_project.equipments;
  exports stu_109601003.final_project.parts;
}
