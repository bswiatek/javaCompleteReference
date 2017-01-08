package JavaFX;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MenuDemo extends Application {

    MenuBar mb;
    EventHandler<ActionEvent> MEHandler;
    ContextMenu editMenu;
    ToolBar tbDebug;
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Prezentacja Menu");
        final BorderPane rootNode = new BorderPane();
        Scene myScene = new Scene(rootNode, 300, 300);
        myStage.setScene(myScene);
        response = new Label("Prezentacja menu");

        MEHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = ((MenuItem) event.getTarget()).getText();
                if (name.equals("Zakończ")) Platform.exit();
                response.setText("Wybrano " + name);
            }
        };

        mb = new MenuBar();
        makeFileMenu();
        makeOptionsMenu();
        makeHelpMenu();
        makeContextMenu();

        TextField tf = new TextField();
        tf.setPrefColumnCount(20);
        tf.setContextMenu(editMenu);

        makeToolBar();

        rootNode.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
            @Override
            public void handle(ContextMenuEvent event) {
                editMenu.show(rootNode, event.getScreenX(), event.getScreenY());
            }
        });

        rootNode.setTop(mb);
        FlowPane fpRoot = new FlowPane(10, 10);
        fpRoot.setAlignment(Pos.CENTER);

        Separator separator = new Separator();
        separator.setPrefWidth(260);

        fpRoot.getChildren().addAll(response,separator,tf);
        rootNode.setBottom(tbDebug);
        rootNode.setCenter(fpRoot);
        myStage.show();
    }

    private void makeToolBar() {
        Button btnSet = new Button("Ustaw punkt wstrzymania");
        Button btnClear = new Button("Usuń punkt wstrzymania");
        Button btnResume = new Button("Wznów");

        btnSet.setContentDisplay(ContentDisplay.TEXT_ONLY);
        btnClear.setContentDisplay(ContentDisplay.TEXT_ONLY);
        btnResume.setContentDisplay(ContentDisplay.TEXT_ONLY);

        tbDebug = new ToolBar(btnSet, btnClear, btnResume);

        EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText(((Button) event.getTarget()).getText());
            }
        };

        btnSet.setOnAction(btnHandler);
        btnClear.setOnAction(btnHandler);
        btnResume.setOnAction(btnHandler);
    }

    void makeFileMenu() {
        Menu fileMenu = new Menu("_Plik");
        MenuItem open = new MenuItem("Otwórz");
        MenuItem close = new MenuItem("Zamknij");
        MenuItem save = new MenuItem("Zapisz");
        MenuItem exit = new MenuItem("Zakończ");

        fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
        open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        close.setAccelerator(KeyCombination.keyCombination("shortcut+M"));
        save.setAccelerator(KeyCombination.keyCombination("shortcut+Z"));
        exit.setAccelerator(KeyCombination.keyCombination("shortcut+K"));

        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);

        mb.getMenus().add(fileMenu);
    }

    void makeOptionsMenu() {
        Menu optionsMenu = new Menu("Opcje");
        Menu colorsMenu = new Menu("Kolory");

        CheckMenuItem red = new CheckMenuItem("Czerwony");
        CheckMenuItem green = new CheckMenuItem("Zielony");
        CheckMenuItem blue = new CheckMenuItem("Niebieski");

        colorsMenu.getItems().addAll(red, green, blue);
        optionsMenu.getItems().add(colorsMenu);
        green.setSelected(true);

        Menu priorityMenu = new Menu("Priorytet");
        RadioMenuItem high = new RadioMenuItem("Wysoki");
        RadioMenuItem low = new RadioMenuItem("Niski");

        ToggleGroup tg = new ToggleGroup();
        high.setToggleGroup(tg);
        low.setToggleGroup(tg);
        high.setSelected(true);

        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);
        optionsMenu.getItems().add(new SeparatorMenuItem());

        MenuItem reset = new MenuItem("Resetuj");
        optionsMenu.getItems().add(reset);

        red.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);

        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if(newValue==null) return;

                RadioMenuItem rmi = (RadioMenuItem) newValue;
                response.setText("Wybrano priorytet: " + rmi.getText());
            }
        });

        mb.getMenus().add(optionsMenu);
    }

    void makeHelpMenu() {
        ImageView aboutIV = new ImageView("file:/home/bartek/Pictures/image002.jpg");
        Menu helpMenu = new Menu("Pomoc");
        MenuItem about = new MenuItem("O programie", aboutIV);

        helpMenu.getItems().add(about);
        about.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        about.setOnAction(MEHandler);
        mb.getMenus().add(helpMenu);
    }

    void makeContextMenu() {
        MenuItem cut = new MenuItem("Wytnij");
        MenuItem copy = new MenuItem("Kopiuj");
        MenuItem paste = new MenuItem("Wklej");

        editMenu = new ContextMenu(cut, copy, paste);

        cut.setOnAction(MEHandler);
        copy.setOnAction(MEHandler);
        paste.setOnAction(MEHandler);
    }
}
