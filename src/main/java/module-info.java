module com.example.demo09042025 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo09042025 to javafx.fxml;
    exports com.example.demo09042025;
}