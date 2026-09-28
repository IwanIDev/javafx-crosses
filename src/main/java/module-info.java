module dev.iwani.crosses {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.iwani.crosses to javafx.fxml;
    exports dev.iwani.crosses;
}