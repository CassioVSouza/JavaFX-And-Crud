module com.crud.crudjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crud.crudjavafx to javafx.fxml;
    exports com.crud.crudjavafx;
}