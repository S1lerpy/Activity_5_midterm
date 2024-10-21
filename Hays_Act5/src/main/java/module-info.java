module com.perlas.perlas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.perlas.perlas to javafx.fxml;
    exports com.perlas.perlas;
    exports controller;
    opens controller to javafx.fxml;
}