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
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = getal1 / getal2;
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = getal1 + getal2;
        System.out.println(resultaat);
    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {

    }
}
