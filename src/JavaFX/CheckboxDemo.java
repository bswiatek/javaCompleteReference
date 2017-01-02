package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckboxDemo extends Application {

    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;

    Label response;
    Label allTargets;
    String targets = "";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prezentacja pól wyboru");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 500, 400);
        primaryStage.setScene(myScene);

        Label heading = new Label("Wybór opcji uruchamiania");
        response = new Label("Nie zaznaczono żadnej opcji");
        allTargets = new Label("Lista docelowa: <brak>");

        cbWeb = new CheckBox("WWW");
        cbDesktop = new CheckBox("Komputer");
        cbMobile = new CheckBox("Komorka");

        cbWeb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cbWeb.isSelected())
                    response.setText("WWW - zaznaczono");
                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cbDesktop.isSelected())
                    response.setText("Komputer - zaznaczono");
                showAll();
            }
        });

        cbMobile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cbMobile.isSelected())
                    response.setText("Komorka - zaznaczono");
                showAll();
            }
        });

        Separator separator = new Separator();
        separator.setPrefWidth(260);

        rootNode.getChildren().addAll(heading, separator, cbWeb, cbMobile, cbDesktop, response, allTargets);

        primaryStage.show();
    }

    void showAll() {
        targets = "";
        if(cbWeb.isSelected()) targets = "WWW ";
        if(cbDesktop.isSelected()) targets += "Komputer ";
        if(cbMobile.isSelected()) targets += "Komorka";

        if(targets.equals("")) targets = "<brak>";
        allTargets.setText("Lista docelowa: " + targets);
    }
}
