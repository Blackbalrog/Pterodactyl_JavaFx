package fr.blackbalrog.pterofx;

import fr.blackbalrog.pterofx.ui.UiManager;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Project Main Class
public class PteroFx {
    public static final Logger LOGGER = LoggerFactory.getLogger("PteroFx");
    public static void main(String[] args) {
        PteroFx.LOGGER.info("Initializing Application..");
        PteroFx.LOGGER.info("Starting UI thread..");
        Application.launch(UiManager.class); //Starts JavaFx
    }
}
