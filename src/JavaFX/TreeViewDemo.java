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

public class TreeViewDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja kontrolki");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        response = new Label("jeszcze nic nie wybrano");

        TreeItem<String> tiRoot = new TreeItem<>("Pozywienie");
        TreeItem<String> tiFruit = new TreeItem<>("Owoce");
        TreeItem<String> tiApples = new TreeItem<>("Jablka");

        tiApples.getChildren().add(new TreeItem<>("Koksa"));
        tiApples.getChildren().add(new TreeItem<>("Jonatan"));
        tiApples.getChildren().add(new TreeItem<>("Antonówka"));

        tiFruit.getChildren().add(tiApples);
        tiFruit.getChildren().add(new TreeItem<>("Gruszki"));
        tiFruit.getChildren().add(new TreeItem<>("Pomarańcze"));

        tiRoot.getChildren().add(tiFruit);

        TreeItem<String> tiVegetables = new TreeItem<>("Warzywa");
        tiVegetables.getChildren().add(new TreeItem<>("Kukurydza"));
        tiVegetables.getChildren().add(new TreeItem<>("Groszek"));
        tiVegetables.getChildren().add(new TreeItem<>("Brokuly"));
        tiVegetables.getChildren().add(new TreeItem<>("Fasola"));
        tiRoot.getChildren().add(tiVegetables);

        TreeItem<String> tiNuts = new TreeItem<>("Orzechy");
        tiNuts.getChildren().add(new TreeItem<>("Laskowe"));
        tiNuts.getChildren().add(new TreeItem<>("Ziemne"));
        tiNuts.getChildren().add(new TreeItem<>("Włoskie"));
        tiRoot.getChildren().add(tiNuts);

        TreeView<String> tvFood = new TreeView<>(tiRoot);

        MultipleSelectionModel<TreeItem<String>> tvSelModel = tvFood.getSelectionModel();

        tvSelModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<String>> observable, TreeItem<String> oldValue, TreeItem<String> newValue) {
                if (newValue != null) {
                    String path = newValue.getValue();
                    TreeItem<String> tmp = newValue.getParent();
                    while (tmp != null) {
                        path = tmp.getValue() + "->" + path;
                        tmp = tmp.getParent();
                    }

                    response.setText("Wybrano element: " + newValue.getValue() + "\nPelna sciezka: " + path);
                }
            }
        });

        rootNode.getChildren().addAll(tvFood, response);

        primaryStage.show();
    }
}
