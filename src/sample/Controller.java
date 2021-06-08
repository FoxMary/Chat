package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    public void textFieldEnter(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
    }

    public void clientBtnClick(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
