package com.example.chatjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea mainArea;

    @FXML
    TextField textArea;

    @FXML
    Button buttonSend;

    public void sendMsg(){
        if (textArea.getText().trim().length() > 0) {
            mainArea.appendText(textArea.getText() + "\n");
            textArea.clear();
            textArea.requestFocus();
        }
    }
}