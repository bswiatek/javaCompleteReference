package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneDemo extends Application {

    ScrollPane scrlPane;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja kontrolki");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        Label scrlLabel = new Label("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n" +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation \n" +
                "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \n" +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat \n" +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        scrlPane = new ScrollPane(scrlLabel);
        scrlPane.setPrefViewportWidth(130);
        scrlPane.setPrefViewportHeight(80);
        scrlPane.setPannable(true);

        Button btnReset = new Button("Przywróc");

        btnReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scrlPane.setVvalue(0);
                scrlPane.setHvalue(0);
            }
        });

        rootNode.getChildren().addAll(scrlPane, btnReset);

        primaryStage.show();
    }
}
