package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Wyświetlanie obrazu");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(myScene);

        Image hourglass = new Image("file:/home/bartek/Pictures/image002.jpg");
        ImageView hourglassIV = new ImageView(hourglass);
        rootNode.getChildren().add(hourglassIV);

        primaryStage.show();
    }
}
