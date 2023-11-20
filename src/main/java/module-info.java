module com.example.csc311_networkprogramming_ex1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.csc311_networkprogramming_ex1 to javafx.fxml;

    exports com.example.csc311_networkprogramming_ex1;
}