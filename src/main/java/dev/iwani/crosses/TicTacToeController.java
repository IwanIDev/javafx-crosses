package dev.iwani.crosses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TicTacToeController {
    @FXML
    private Label turnLabel;

    private String nextSymbol = "X";

    @FXML
    private void handleCellClick(ActionEvent event) {
        Button cell = (Button) event.getSource();

        if (!cell.getText().isEmpty()) {
            return;
        }

        cell.setText(nextSymbol);
        nextSymbol = nextSymbol.equals("X") ? "O" : "X";
        turnLabel.setText("Next: " + nextSymbol);
    }
}
