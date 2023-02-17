module com.khanh.app2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.khanh.app2 to javafx.fxml;
    exports com.khanh.app2;
}
