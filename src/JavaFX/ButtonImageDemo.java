package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonImageDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Obraz na przyciskach");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 800);
        primaryStage.setScene(myScene);

        response = new Label("Kliknij przycisk");
        Button btnHourglass = new Button("Klepsydra", new ImageView("file:/home/bartek/Pictures/image002.jpg"));
        Button btnAnalogClock = new Button("Zegar", new ImageView("file:/home/bartek/Pictures/image002.jpg"));
        btnHourglass.setContentDisplay(ContentDisplay.TOP);
        btnAnalogClock.setContentDisplay(ContentDisplay.TOP);
        btnHourglass.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Kliknięto klepsydrę");
            }
        });
        btnAnalogClock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Kliknięto zegar");
            }
        });
        rootNode.getChildren().addAll(btnAnalogClock, btnHourglass, response);

        primaryStage.show();
    }
}
