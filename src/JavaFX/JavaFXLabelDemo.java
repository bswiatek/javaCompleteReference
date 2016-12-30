package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("W metodzie init");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Prezentacja etykiet JavaFX");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(myScene);

        Label myLabel = new Label("To jest etykieta JavaFX");
        rootNode.getChildren().add(myLabel);

        primaryStage.show();
    }
}
