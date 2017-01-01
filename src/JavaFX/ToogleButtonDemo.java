package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ToogleButtonDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja przełączników");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 800);
        primaryStage.setScene(myScene);

        response = new Label("Kliknij przycisk");
        ToggleButton tbOnOf = new ToggleButton("Włączony / Wyłączony");
        tbOnOf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tbOnOf.isSelected()) response.setText("Przycisk włączony");
                else response.setText("Przycisk wyłączony");
            }
        });
        rootNode.getChildren().addAll(tbOnOf, response);

        primaryStage.show();
    }
}
