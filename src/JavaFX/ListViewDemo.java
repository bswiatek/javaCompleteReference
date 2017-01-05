package JavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja list");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        response = new Label("Wybierz srodek transportu");

        ObservableList<String> transportTypes = FXCollections.observableArrayList("Pociąg", "Samochód", "Samolot");

        ListView<String> lvTransport = new ListView<>(transportTypes);
        lvTransport.setPrefSize(80,80);
        lvTransport.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();

        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String selItems = "";
                ObservableList<String> selected = lvTransport.getSelectionModel().getSelectedItems();
                for(int i=0; i<selected.size(); i++)
                    selItems += "\n " + selected.get(i);

                response.setText("Wybrane środki transportu: " + selItems);
            }
        });

        rootNode.getChildren().addAll(lvTransport, response);

        primaryStage.show();
    }
}
