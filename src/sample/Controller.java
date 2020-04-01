package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    private void ButtonClicked(Berekening berekening) {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = berekening.bereken(getal1, getal2);
        txtResultaat.setText(String.valueOf(resultaat));
    }

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        ButtonClicked(new DeelBerekening());
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        ButtonClicked(new PlusBerekening());
    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        ButtonClicked(new MaalBerekening());
    }
}
