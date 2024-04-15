module stu_109601003.finalproject {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;
  requires transitive javafx.graphics;
  


  opens stu_109601003.finalproject to javafx.fxml;
  exports stu_109601003.finalproject;
  exports ChestParts;
  opens ChestParts to javafx.fxml;
  exports LegParts;
  opens LegParts to javafx.fxml;
  exports BackParts;
  opens BackParts to javafx.fxml;
  exports ShoulderParts;
  opens ShoulderParts to javafx.fxml;
  exports ArmParts;
  opens ArmParts to javafx.fxml;
  exports CoreParts;
  opens CoreParts to javafx.fxml;
  exports AerobicParts;
  opens AerobicParts to javafx.fxml;
}