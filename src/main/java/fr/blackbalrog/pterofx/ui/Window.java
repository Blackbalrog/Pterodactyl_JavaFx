package fr.blackbalrog.pterofx.ui;

import fr.blackbalrog.pterofx.ui.panel.Panel;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Application Window
 * @author RaftDev
 */
public class Window {
    private final Stage stage;
    private final GridPane layout;

    public Window(Stage stage) {
        this.stage = stage;
        this.layout = new GridPane();

        Scene scene = new Scene(this.layout);
        this.stage.setScene(scene);
    }

    public Window() {
        this(new Stage());
    }

    /**
     * Sets the panel of the window
     * @param panel panel
     * @see Panel
     */
    public void setPanel(Panel panel) {
        this.layout.getChildren().clear();

        panel.init();
        panel.getLayout().setId(panel.getId());

        this.layout.getChildren().add(panel.getLayout());
    }

    /**
     * Sets the title of the window
     * @param title window title
     */
    public void setTitle(String title) {
        this.stage.setTitle(title);
    }

    /**
     * Shows the window
     */
    public void show() {
        this.stage.show();
    }

    /**
     * Hides the window
     */
    public void hide() {
        this.stage.hide();
    }

    /**
     * Closes the window
     */
    public void close() {
        this.stage.close();
    }

    //Getters
    public Stage getStage() {
        return stage;
    }

    public GridPane getLayout() {
        return layout;
    }
}
