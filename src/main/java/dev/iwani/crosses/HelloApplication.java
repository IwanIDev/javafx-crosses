package dev.iwani.crosses;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tic-tac-toe-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 560);
        stage.setTitle("Noughts and Crosses");
        stage.setScene(scene);
        stage.show();
    }
}
