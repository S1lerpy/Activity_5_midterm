package com.perlas.perlas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/main.fxml")));
        primaryStage.setTitle("ActivityFiveApp");

        primaryStage.setScene(new Scene(root, 438, 289));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}