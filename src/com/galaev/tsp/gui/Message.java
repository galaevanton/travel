package com.galaev.tsp.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main class for a Message Window.
 *
 * @author Anton Galaev
 */
public class Message {

    /**
     * Public constructor for a Message.
     * Creates a modal window with title and message,
     * provided as parameters.
     *
     * @param primaryStage primary stage
     * @param title title of message
     * @param message message itself
     */
    public Message(Stage primaryStage, String title, String message) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("view/MessageView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Stage stage = new Stage();
        //Initialize the Stage with type of modal
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        //Set the owner of the Stage
        stage.initOwner(primaryStage);
        stage.setTitle(title);
        Label label = (Label) root.lookup("#label");
        label.setText(message);
        Scene scene = new Scene(root, 350, 100);
        scene.getStylesheets().add("com/galaev/tsp/gui/resources/styles/popup.css");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
