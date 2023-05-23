module com.example.hwjavaa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hwjavaa to javafx.fxml;
    exports com.example.hwjavaa;
}