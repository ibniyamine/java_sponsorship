module sn.groupeisi.parrainage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires TrayNotification;


    opens sn.groupeisi.parrainage to javafx.fxml;
    exports sn.groupeisi.parrainage;

    opens sn.groupeisi.parrainage.controllers to javafx.fxml;
    exports sn.groupeisi.parrainage.controllers;
}