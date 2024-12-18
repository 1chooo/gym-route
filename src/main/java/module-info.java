module stu_109601003.finalproject {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;

  opens stu_109601003.finalproject to javafx.fxml;
  opens stu_109601003.finalproject.controllers to javafx.fxml;

  exports stu_109601003.finalproject;
  exports stu_109601003.finalproject.controllers;
  exports stu_109601003.finalproject.handlers;
  exports stu_109601003.finalproject.handlers.Parts;
  exports stu_109601003.finalproject.equipments;
  exports stu_109601003.finalproject.parts;
}
