package stopwatch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class StopwatchController {

    @FXML
    private Label stopWatchLabel;

    @FXML
    private Button startStopButton;

    @FXML
    private Button resetButton;

    private Stopwatch stopwatch = new Stopwatch();

    @FXML
    private void initialize() {
        stopWatchLabel.textProperty().bind(stopwatch.hhmmssProperty());
        stopwatch.start();
    }

    @FXML
    private void handleStartStopButton(ActionEvent event) {
        switch (stopwatch.getStatus()) {
            case RUNNING:
                stopwatch.stop();
                startStopButton.setText("Start");
                resetButton.setDisable(false);
                break;
            case PAUSED:
                stopwatch.start();
                startStopButton.setText("Stop");
                resetButton.setDisable(true);
                break;
        }
    }

    @FXML
    private void handleResetButton(ActionEvent event) {
        stopwatch.reset();
        resetButton.setDisable(true);
    }

}
