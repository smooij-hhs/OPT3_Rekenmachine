package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    private double rekenen (String bereken){
        double resultaat = 0;
        double getal1 = Double.parseDouble(txtGetal1.getText());
        double getal2 = Double.parseDouble(txtGetal2.getText());
        if (bereken.equals("+")){
            resultaat = getal1 + getal2;
        }
        else if (bereken.equals("-")){
            resultaat = getal1 - getal2;
        }
        else if (bereken.equals("/")){
            resultaat = getal1 / getal2;
        }
        else if (bereken.equals("*")){
            resultaat = getal1 * getal2;
        }
        else if (bereken.equals("%")){
            resultaat = getal1 % getal2;
        }

        return resultaat;
    }

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        String newResult = Double.toString(rekenen("/"));
        txtResultaat.setText(newResult);
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        String newResult = Double.toString(rekenen("+"));
        txtResultaat.setText(newResult);
    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        String newResult = Double.toString(rekenen("*"));
        txtResultaat.setText(newResult);
    }

    @FXML
    private void minButtonClicked (ActionEvent event) {
        String newResult = Double.toString(rekenen("-"));
        txtResultaat.setText(newResult);
    }

    @FXML
    private void moduloButtonClicked (ActionEvent event) {
        String newResult = Double.toString(rekenen("%"));
        txtResultaat.setText(newResult);
    }
}
