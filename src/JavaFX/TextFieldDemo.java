package JavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {

    Label response;
    TextField tf;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja pola tekstowego");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        response = new Label("Poszukiwana fraza: ");

        Button btnGetText = new Button("Pobierz frazę");

        tf = new TextField();
        tf.setPromptText("Wpisz poszukiwana fraze");
        tf.setPrefColumnCount(15);
        tf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Poszukiwana fraza: " + tf.getText());
            }
        });

        btnGetText.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Poszukiwana fraza: " + tf.getText());
            }
        });

        Separator separator = new Separator();
        separator.setPrefWidth(280);

        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        primaryStage.show();
    }
}
