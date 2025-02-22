package org.otp2.otp2bensa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("org.otp2.otp2bensa.message_en"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 440);
        stage.setTitle("Patrik Hyytiäinen!");        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}