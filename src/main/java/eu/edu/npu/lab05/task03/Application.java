package eu.edu.npu.lab05.task03;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("test.txt");
            fw.write("TEST");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        launch(args);

    }
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Морозиво");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}