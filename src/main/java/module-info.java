module com.example.ejercicio3jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio3jfx to javafx.fxml;
    exports com.example.ejercicio3jfx;
}