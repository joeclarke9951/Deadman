package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox vbox = new VBox();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
