package eu.edu.npu.lab05.Task03.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class MainController {
    ToggleGroup group = new ToggleGroup();
    ArrayList<Image> imageList = new ArrayList();

    @FXML
    Button button;
    @FXML
    ChoiceBox<String> choiceBox;
    @FXML
    ComboBox<String> comboBox;

    public void initialize() {
        choiceBox.getItems().setAll(FXCollections.observableArrayList("Опція 1", "Опція 2", "Опція 3"));
        choiceBox.getSelectionModel().select(0);

    }
}
