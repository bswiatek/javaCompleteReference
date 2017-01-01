package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LabelImageDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Wyświetlanie obrazu");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        Image hourglass = new Image("file:/home/bartek/Pictures/image002.jpg");
        ImageView hourglassIV = new ImageView(hourglass);
        Label hourglassLabel = new Label("klepsydra", hourglassIV);
        hourglassLabel.setContentDisplay(ContentDisplay.TOP);
        rootNode.getChildren().add(hourglassLabel);

        primaryStage.show();
    }
}
