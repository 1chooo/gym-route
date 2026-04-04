package gym_route.controllers;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.Objects;

public class PreviewController {

    private static final int PREVIEW_DATA_ROWS = 8;
    private static final int PREVIEW_DATA_COLS = 7;

    @FXML
    private GridPane previewGrid;

    @FXML
    Button backCurriculum;
    @FXML
    Button viewCalender;

    static Label[][] curriculumLabelMatrix;

    public void clickedBackCurriculum() throws IOException {
        SceneController.switchScene(PAGE.CURRICULUM);
    }

    public void clickedViewCalender() throws IOException {
        CalendarController calendarController = new CalendarController();
        calendarController.loadCurriculumToWeekToDayListOfWeek();
        SceneController.switchScene(PAGE.CALENDAR);
        System.out.println(CalendarController.dayListOfWeek);// test
        calendarController.displayCalendar();
    }

    public static void displayScreenArrayToPreview() throws IOException {
        for (int row = 0; row <= 7; row++) {
            for (int column = 0; column <= 6; column++) {
                String value = CurriculumController.curriculumForWeek[row][column];
                curriculumLabelMatrix[row][column].setText(Objects.toString(value, ""));
            }
        }
    }

    @FXML
    public void initialize() {
        wirePreviewMatrix();
    }

    private void wirePreviewMatrix() {
        curriculumLabelMatrix = new Label[PREVIEW_DATA_ROWS][PREVIEW_DATA_COLS];
        for (Node node : previewGrid.getChildren()) {
            if (!(node instanceof Label)) {
                continue;
            }
            int row = GridPane.getRowIndex(node) != null ? GridPane.getRowIndex(node) : 0;
            int col = GridPane.getColumnIndex(node) != null ? GridPane.getColumnIndex(node) : 0;
            if (row < 1 || col < 1) {
                continue;
            }
            int dataRow = row - 1;
            int dataCol = col - 1;
            if (dataRow >= PREVIEW_DATA_ROWS || dataCol >= PREVIEW_DATA_COLS) {
                continue;
            }
            curriculumLabelMatrix[dataRow][dataCol] = (Label) node;
        }
    }

}
