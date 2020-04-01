package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    private void buttonClicked(Bewerking bewerking)
    {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = bewerking.bereken(getal1, getal2);
        txtResultaat.setText("" + resultaat);
    }

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        buttonClicked(new BewerkingDeel());
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        buttonClicked(new BewerkingPlus());

    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        buttonClicked(new BewerkingMaal());
    }
}
