package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());
        double resultaat = getal1 / getal2;
        txtResultaat.setText("" + resultaat);
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());
        double resultaat = getal1 + getal2;

        String newResult = Double.toString(resultaat);
        txtResultaat.setText(newResult);

    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());
        double resultaat = getal1 * getal2;

        String newResult = Double.toString(resultaat);
        txtResultaat.setText(newResult);
    }

    @FXML
    private void minButtonClicked (ActionEvent event) {
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());
        double resultaat = getal1 - getal2;

        String newResult = Double.toString(resultaat);
        txtResultaat.setText(newResult);
    }
}
