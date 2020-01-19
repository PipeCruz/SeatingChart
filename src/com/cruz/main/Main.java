package com.cruz.main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * Homework #8: Seating Chart
     * Requirements:
     * <p>
     * - Students are displayed in a 2-D grid.
     * todo- Students can be removed from the seating chart.
     * todo- Students can be added to the seating chart.
     * - Students can be moved to an empty seat.
     * - Students can have their seats swapped.
     * todo- A custom seating chart can be loaded and will fill seats in column major order.
     */

    @Override
    public void start(Stage primaryStage) throws Exception {//fixme make a readable .csv style to start the list
        Parent root = FXMLLoader.load(getClass().getResource("/com/cruz/files/fxml/Main.fxml"));
        primaryStage.setTitle("Seating Simulator");
        primaryStage.setScene(new Scene(root, 885, 600));
        primaryStage.centerOnScreen();
//        primaryStage.getIcons().add(new Image("/pictures/icon.png"));fixme
        primaryStage.setOnCloseRequest(e -> {
            Platform.exit();
            try {
                stop();
            } catch (Exception ex) {
                ex.printStackTrace();
            }finally {
                System.out.println("program closed.");
            }
        });
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}
}
