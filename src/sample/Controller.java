package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;
    @FXML
    private void buttonClicked(ActionEvent event)
    {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        String operator = event.getSource().toString().substring(35).substring(0, 1);
        int resultaat = 0;
        switch(operator) {
            case "+":
                resultaat = getal1 + getal2;
                break;
            case "*":
                resultaat = getal1 * getal2;
                break;
            case "/":
                resultaat = getal1 / getal2;
                break;
        }
        txtResultaat.setText("" + resultaat);
    }
}
