package com.galaev.tsp.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * The main class of the program,
 * that starts the whole application.
 * Creates the main scene, loaded from fxml file,
 * and shows the stage.
 *
 * @author Anton Galaev
 */
public class MainWindow extends Application {

    /**
     * The entry point of the JavaFX application.
     * Loads the scene from fxml and shows the stage.
     *
     * @param primaryStage application stage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
        primaryStage.setTitle("Travelling Salesman");
        Scene scene = new Scene(root, 700, 500);
        scene.getStylesheets().add("com/galaev/tsp/gui/resources/main.css");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("com/galaev/tsp/gui/resources/icon.png"));
        primaryStage.show();
    }

    /**
     * Main method.
     * Never called in JavaFX application.
     *
     * @param args string arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
