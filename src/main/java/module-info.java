module com.ygseol.gui.ygseol {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ygseol.gui.ygseol to javafx.fxml;
    exports com.ygseol.gui.ygseol;
}