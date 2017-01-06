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

public class ComboBoxDemo extends Application {

    Label response;
    ComboBox<String> cbTransport;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja listy kombinowanej");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        response = new Label();

        ObservableList<String> transportTypes = FXCollections.observableArrayList("Pociąg", "Samochód", "Samolot");
        cbTransport = new ComboBox<>(transportTypes);

        cbTransport.setValue("Pociąg");
        response.setText("wybranym środkiem transportu jest: " + cbTransport.getValue());

        cbTransport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Wybrany środek transportu: " + cbTransport.getValue());
            }
        });

        rootNode.getChildren().addAll(cbTransport, response);

        primaryStage.show();
    }
}
