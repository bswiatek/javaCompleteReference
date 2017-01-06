package JavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double glowVal = 0.0;
    double scaleFactor = 1.0;
    boolean shadow = false;

    Glow glow = new Glow(0.0);
    InnerShadow innerShadow = new InnerShadow(10.0, Color.RED);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    Button btnRotate = new Button("Obrót");
    Button btnGlow = new Button("Rozświetlenie");
    Button btnShadow = new Button("Cień: wyłączony");
    Button btnScale = new Button("Skalowanie");

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja efektow");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        btnGlow.setEffect(glow);
        btnRotate.getTransforms().add(rotate);
        btnScale.getTransforms().add(scale);

        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                angle +=30.0;
                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getHeight()/2);
            }
        });

        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scaleFactor += 0.1;
                if(scaleFactor > 1.0) scaleFactor = 0.4;
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        btnGlow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                glowVal += 0.1;
                if(glowVal > 1.0) glowVal = 0.0;
                glow.setLevel(glowVal);
            }
        });

        btnShadow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                shadow = !shadow;
                if(shadow) {
                    btnShadow.setEffect(innerShadow);
                    btnShadow.setText("Cień: włączony");
                } else {
                    btnShadow.setEffect(null);
                    btnShadow.setText("Cień: wyłączony");
                }
            }
        });

        rootNode.getChildren().addAll(btnRotate, btnScale, btnGlow, btnShadow);

        primaryStage.show();
    }
}
