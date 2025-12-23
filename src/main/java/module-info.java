module com.ygseol.gui.ygseol {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.sql;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.net.http;
    requires static lombok;
    requires hibernate.entitymanager;
    requires hibernate.core;
    exports com.ygseol.gui.ygseol.config;

    opens com.ygseol.gui.ygseol to javafx.fxml;
    exports com.ygseol.gui.ygseol;
    exports com.ygseol.gui.ygseol.controller;
    opens com.ygseol.gui.ygseol.controller to javafx.fxml;
}