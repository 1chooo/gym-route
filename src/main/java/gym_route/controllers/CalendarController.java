package gym_route.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class CalendarController {

  private static final int CALENDAR_ROWS = 5;
  private static final int CALENDAR_COLS = 7;

  @FXML
  private GridPane calendarGrid;

  @FXML
  Button returnHome;

  @FXML
  Label year;

  Calendar calendarUseForDisplay = Calendar.getInstance();
  Calendar calendarCurrent = Calendar.getInstance();
  static Label[][] dateLabelMatrix;
  static VBox[][] cellVboxMatrix;
  static ListView<String>[][] curriculumListViewMatrix;

  @FXML
  public void initialize() {
    wireCalendarMatrices();
    int currentYear = calendarCurrent.get(Calendar.YEAR);
    year.setText(currentYear + "");
  }

  private void wireCalendarMatrices() {
    dateLabelMatrix = new Label[CALENDAR_ROWS][CALENDAR_COLS];
    cellVboxMatrix = new VBox[CALENDAR_ROWS][CALENDAR_COLS];
    @SuppressWarnings("unchecked")
    ListView<String>[][] listMatrix = new ListView[CALENDAR_ROWS][CALENDAR_COLS];
    curriculumListViewMatrix = listMatrix;

    for (Node node : calendarGrid.getChildren()) {
      if (!(node instanceof VBox)) {
        continue;
      }
      int row = GridPane.getRowIndex(node) != null ? GridPane.getRowIndex(node) : 0;
      int col = GridPane.getColumnIndex(node) != null ? GridPane.getColumnIndex(node) : 0;
      VBox vbox = (VBox) node;
      if (vbox.getChildren().size() < 2) {
        continue;
      }
      Label dateLabel = (Label) vbox.getChildren().get(0);
      @SuppressWarnings("unchecked")
      ListView<String> listView = (ListView<String>) vbox.getChildren().get(1);
      dateLabelMatrix[row][col] = dateLabel;
      cellVboxMatrix[row][col] = vbox;
      curriculumListViewMatrix[row][col] = listView;
    }
  }

  static ArrayList<ObservableList<String>> dayListOfWeek = new ArrayList<>();

  public void loadCurriculumToWeekToDayListOfWeek() {
    for (int column = 0; column <= 6; column++) {
      ObservableList<String> tempDayList = FXCollections.observableArrayList();
      for (int row = 0; row <= 7; row++) {
        if (CurriculumController.curriculumForWeek[row][column] != null) {
          tempDayList.add(CurriculumController.curriculumForWeek[row][column]);
        }
      }
      dayListOfWeek.add(tempDayList);
    }
  }

  public void displayCalendar() {
    calendarUseForDisplay.set(Calendar.DATE, 1);

    int currenMonth = calendarCurrent.get(Calendar.MONTH) + 1;
    int currentDate = calendarCurrent.get(Calendar.DATE);
    int weekOf1th = calendarUseForDisplay.get(Calendar.DAY_OF_WEEK) - 1;
    int daysInMonth = calendarCurrent.getActualMaximum(Calendar.DATE);

    int day = 1;
    int dayOfWeek = weekOf1th;

    for (int row = 0; row <= 4; row++) {
      for (int column = 0; column <= 6; column++) {
        if (row == 0 && column < weekOf1th) {
          dateLabelMatrix[row][column].setText("");
        } else if (day <= daysInMonth) {
          String text = String.format(" %d / %d", currenMonth, day);
          dateLabelMatrix[row][column].setText(text);
          if (day == currentDate) {
            cellVboxMatrix[row][column].setStyle("-fx-background-color: #d5ffd5");
          }
          day++;
          curriculumListViewMatrix[row][column].setItems(dayListOfWeek.get(dayOfWeek));
          if (dayOfWeek == 6) {
            dayOfWeek = 0;
          } else {
            dayOfWeek++;
          }
        } else {
          dateLabelMatrix[row][column].setText("");
        }
      }
    }
  }

  @FXML
  protected void onBackButtonClick() throws IOException {
    SceneController.switchScene(PAGE.HOME);
    dayListOfWeek.clear();
  }
}
