package com.example.dictionary_oop1;

import Database.DictionaryManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        stage.setTitle("English Dictionary");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        DictionaryManager.getAllWord();
        DictionaryManagement.insertFromFile();
        launch();
    }
}