package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    private double getGetal1() {
        return Double.parseDouble(txtGetal1.getText());
    }

    private double getGetal2() {
        return Double.parseDouble(txtGetal2.getText());
    }

    private void ButtonClicked(IBerekening berekening) {
        double getal1 = getGetal1();
        double getal2 = getGetal2();
        double resultaat = berekening.bereken(getal1, getal2);
        txtResultaat.setText(String.valueOf(resultaat));
    }

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        ButtonClicked (new deelKnop());
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        ButtonClicked (new plusKnop());
    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        ButtonClicked (new keerKnop());
    }

    @FXML
    private void minButtonClicked (ActionEvent event) {
        ButtonClicked (new minKnop());
    }

    @FXML
    private void moduloButtonClicked (ActionEvent event) {
        ButtonClicked (new moduloKnop());
    }
}
