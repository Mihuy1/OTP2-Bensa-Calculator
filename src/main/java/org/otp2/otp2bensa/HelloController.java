package org.otp2.otp2bensa;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField kmTextField;

    @FXML
    private TextField fuelPerKmTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Label distanceLabel;

    @FXML
    private Label fuelBurnLabel;

    @FXML
    private Button calculateButton;

    public final double FUEL_PER_KM = 1.1;


    public void onCalculateButtonClicked() {
        double distance = Double.parseDouble(kmTextField.getText());
        double fuelPer100Km = Double.parseDouble(fuelPerKmTextField.getText());
        double price = distance * (fuelPer100Km / 100) * FUEL_PER_KM;
        resultLabel.setText(String.format(resultLabel.getText(), price));   
        resultLabel.setVisible(true);
    }

    public void setEN() {
        Locale l = new Locale("en");
        loadFXML(l);
    }

    public void setJP() {
        Locale l = new Locale("jp");
        loadFXML(l);
    }

    public void loadFXML(Locale l) {
        ResourceBundle bundle = ResourceBundle.getBundle("org.otp2.otp2bensa.message", l);
        distanceLabel.setText(bundle.getString("distance.label"));
        fuelBurnLabel.setText(bundle.getString("fuel.label"));
        calculateButton.setText(bundle.getString("calculate.button"));
        resultLabel.setText(bundle.getString("result.label"));
        resultLabel.setVisible(false);

    }
}