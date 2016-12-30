package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("Uruchomienie aplikacji JavaFX");
        launch(args);
    }

    public void init() {
        System.out.println("W metodzie init");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("W metodzie start");
        primaryStage.setTitle("Szkielet aplikacji JavaFX");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public void stop() {
        System.out.println("W metodzie stop");
    }
}
