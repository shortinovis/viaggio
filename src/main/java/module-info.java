module com.example.viaggi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viaggi to javafx.fxml;
    exports com.example.viaggi;
}