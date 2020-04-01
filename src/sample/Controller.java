package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{
    private Bereken bereken;
    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        ButtonClicked(new Deelknop());

    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        ButtonClicked(new Plusknop());


    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        ButtonClicked(new Keerknop());
    }
    private void ButtonClicked(Bereken bereken){
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = bereken.Berekening(getal1, getal2);
        txtResultaat.setText(String.valueOf(resultaat));
    }


//    //private String formule(String string){
//        if(string.equals("*")){
//            return String.valueOf(Integer.parseInt(txtGetal1.getText()) * Integer.parseInt(txtGetal2.getText()));
//        } else if(string.equals("+")){
//            return String.valueOf(Integer.parseInt(txtGetal1.getText()) + Integer.parseInt(txtGetal2.getText()));
//        }else if(string.equals("/")){
//            return String.valueOf(Integer.parseInt(txtGetal1.getText()) / Integer.parseInt(txtGetal2.getText()));
//        }
//        return null;
//    }
}
