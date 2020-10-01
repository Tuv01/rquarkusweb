package org.applifecycle;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.jboss.logging.Logger;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class AppLifecycleListener {

    public static final Logger LOGGER = Logger.getLogger("Lifecycle");

    public void onStart(@Observes StartupEvent startupEvent){
        LOGGER.info("onStart executed");
    }

    public void onStop(@Observes ShutdownEvent shutdownEvent){
        LOGGER.info("onStop executed");
    }
    
}