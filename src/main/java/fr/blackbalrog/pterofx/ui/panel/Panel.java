package fr.blackbalrog.pterofx.ui.panel;

import fr.blackbalrog.pterofx.ui.UiManager;
import javafx.animation.FadeTransition;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import org.jetbrains.annotations.NotNull;

/**
 * UI Panel, Extend this class to create a new panel
 * @author RaftDev
 */
public abstract class Panel {
    protected final GridPane layout;
    protected final UiManager uiManager;

    public Panel(UiManager uiManager) {
        this.layout = new GridPane();
        this.uiManager = uiManager;
    }

    /**
     * Called when the panel is being initialized, add your ui elements to the layout here
     */
    public abstract void init();

    /**
     * Called when the panel becomes visible
     */
    public void onShow() {
        FadeTransition transition = new FadeTransition(Duration.seconds(1), this.layout);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.setAutoReverse(true);
        transition.play();
    }

    /**
     * Panel CSS identifier
     * @return panel css id
     */
    public abstract @NotNull String getId();

    public GridPane getLayout() {
        return layout;
    }

    public UiManager getUiManager() {
        return uiManager;
    }

    @Override
    public String toString() {
        return getId();
    }
}
