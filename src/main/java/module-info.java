module app.dashboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens app to javafx.fxml;
    exports app;
    exports app.Controller;
    opens app.Controller to javafx.fxml;
}