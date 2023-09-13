package fr.blackbalrog.pterofx.logging;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy;
import ch.qos.logback.core.rolling.RolloverFailure;

/**
 * Logger new file triggering policy
 * @author RaftDev
 */
@NoAutoStart
public class StartupTimeBasedTriggeringPolicy<E> extends DefaultTimeBasedFileNamingAndTriggeringPolicy<E> {
    @Override
    public void start() {
        super.start();
        atomicNextCheck.set(0L);
        isTriggeringEvent(null, null);
        try {
            tbrp.rollover();
        } catch (RolloverFailure e) {
            //Do nothing
        }
    }
}
