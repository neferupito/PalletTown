package com.nefee.pallettown.api.config;

import com.nefee.pallettown.api.status.StatusResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class PalletTownApplication extends Application {

    @Override
    public final Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(StatusResource.class);
        return classes;
    }

//    @Override
//    public Set<Object> getSingletons() {
//        final Set<Object> singletons = new HashSet<Object>();
//        // Register an instance of LoggingFilter.
//        singletons.add(new LoggingFilter(LOGGER, true));
//        return singletons;
//    }

//    @Override
//    public Map<String, Object> getProperties() {
//        final Map<String, Object> properties = new HashMap<String, Object>();
//        // Enable Tracing support.
//        properties.put(ServerProperties.TRACING, "ALL");
//        return properties;
//    }

}
