module ies.losmontecillos.fxmltableview {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ies.losmontecillos.fxmltableview to javafx.fxml;
    exports ies.losmontecillos.fxmltableview;
}