package com.example.dictionary_oop1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    TextField textField;

    @FXML
    ListView<String> listView = new ListView<String>();

    @FXML
    protected void buttonSearch(ActionEvent event) {
        listView.getItems().clear();
        String input = textField.getText();
        ArrayList<Word> list = DictionaryManagement.dictionarySearcher(input);
        for (int i = 0; i < list.size(); i++) {
            listView.getItems().add(list.get(i).getWord_target());
        }
    }

    @FXML
    protected void handleItemClicks() {
        listView.setOnMouseClicked(event -> {
            String selectedItem = listView.getSelectionModel().getSelectedItem().toString();
            welcomeText.setText(DictionaryManagement.dictionaryLookup(selectedItem));
            TextToSpeech tts = new TextToSpeech("kevin16");
            tts.speak(selectedItem);
        });
    }
}