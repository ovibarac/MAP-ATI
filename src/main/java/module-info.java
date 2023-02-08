module com.example.examen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.examen to javafx.fxml;
    exports com.example.examen;

    opens com.example.examen.controller to javafx.fxml;
    exports com.example.examen.controller;

    opens com.example.examen.domain to javafx.base;
    exports com.example.examen.domain;
    exports com.example.examen.observer;

}