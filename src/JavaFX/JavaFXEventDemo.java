package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Prezentacja przycisków i zdarzeń JavaFX");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(myScene);

        response = new Label("Kliknij przycisk");
        Button btnAlpha = new Button("Alfa");
        Button btnBeta = new Button("Beta");

        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Kliknięto Alfa");
            }
        });
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Kliknięto Beta");
            }
        });

        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);

        primaryStage.show();
    }
}
