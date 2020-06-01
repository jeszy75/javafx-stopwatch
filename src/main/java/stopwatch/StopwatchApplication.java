package stopwatch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StopwatchApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(StopwatchApplication.class.getResource("/stopwatch.fxml"));
        stage.setTitle("JavaFX Timer");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

}
