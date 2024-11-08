module org.otp2.otp2bensa {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.otp2.otp2bensa to javafx.fxml;
    exports org.otp2.otp2bensa;
}