module com.app.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.app.schoolmanager to javafx.fxml;
    exports com.app.schoolmanager;

    opens com.app.schoolmanager.Models to javafx.base;
    exports com.app.schoolmanager.Models;

    opens com.app.schoolmanager.Controller to javafx.fxml;
    exports com.app.schoolmanager.Controller;

    opens com.app.schoolmanager.IDBConfig to javafx.fxml;
    exports com.app.schoolmanager.IDBConfig;


}
