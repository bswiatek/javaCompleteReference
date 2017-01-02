package JavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo2 extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja radio buttonów");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 800);
        primaryStage.setScene(myScene);

        response = new Label("Nie potwierdzono środka transportu");
        Button btnConfirm = new Button("Potwierdź wybór");

        RadioButton rbTrain = new RadioButton("Pociąg");
        RadioButton rbCar = new RadioButton("Samochód");
        RadioButton rbPlane = new RadioButton("Samolot");
        ToggleGroup tg = new ToggleGroup();

        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);

        rbPlane.setSelected(true);

        btnConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RadioButton rb = (RadioButton) tg.getSelectedToggle();
                response.setText("Potwierdzony wybór: " + rb.getText());
            }
        });

        rootNode.getChildren().addAll(rbCar, rbPlane, rbTrain, btnConfirm, response);

        primaryStage.show();
    }
}
