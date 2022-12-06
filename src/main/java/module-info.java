module com.example.interfata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfata to javafx.fxml;
    exports com.example.interfata;
}