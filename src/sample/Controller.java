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
        rekenKnop(1);

    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        rekenKnop(2);

    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        rekenKnop(3);
    }

    @FXML
    private void rekenKnop(int getal)
    {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        if (getal == 1) {txtResultaat.setText("" + getal1 / getal2);}
        if (getal == 2) {txtResultaat.setText("" + getal1 + getal2);}
        if (getal == 3) {txtResultaat.setText("" + getal1 * getal2);}

    }
}
