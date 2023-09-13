package fr.blackbalrog.pterofx.ui;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * UI Manager, manages the ui of the application
 */
public class UiManager extends Application {
    private Window window;

    /**
     * Start of the UI Thread
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage stage) throws Exception {
        this.window = new Window(stage);
        this.window.setTitle("Hello World!");
        this.window.show();
    }
}
