module david.benitez.pruebagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens david.benitez.pruebagit to javafx.fxml;
    exports david.benitez.pruebagit;
}