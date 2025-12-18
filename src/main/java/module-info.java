module com.ygseol.gui.ygseol {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.net.http;

    opens com.ygseol.gui.ygseol to javafx.fxml;
    exports com.ygseol.gui.ygseol;
}