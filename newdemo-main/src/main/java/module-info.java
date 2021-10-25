module com.example.dictionary_oop1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires freetts;
    requires java.sql;

    opens com.example.dictionary_oop1 to javafx.fxml;
    exports com.example.dictionary_oop1;
    exports Database;
    opens Database to javafx.fxml;
}