/*
Copyright 2012 Adam Bien, adam-bien.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.lightfish.business.configuration.boundary;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import org.h2.tools.Server;
import org.lightfish.business.configuration.control.ConfigurationStore;
import org.lightfish.business.configuration.entity.Configuration;

/**
 *
 * @author Adam Bien, blog.adam-bien.com
 */
@Startup
@Singleton
public class Configurator {
    private Configuration configuration;
    @Inject ConfigurationStore configurationStore;

    @PostConstruct
    public void initialize() {
        this.configuration = configurationStore.retrieveConfiguration();
        try {
            //Does not work, no connection from browser possible
            Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
            Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();
        } catch (SQLException ex) {
            Logger.getLogger(Configurator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Produces
    public int getInteger(InjectionPoint ip) {
        return Integer.parseInt(getString(ip));
    }

    @Produces
    public boolean getBoolean(InjectionPoint ip) {
        return Boolean.parseBoolean(getString(ip));
    }

    @Produces
    public String getString(InjectionPoint ip) {
        String name = ip.getMember().getName();
        return this.configuration.get(name);
    }

    @Produces
    public String[] getStringArray(InjectionPoint ip) {
        return asArray(getString(ip));
    }

    public String[] getStringArray(String key) {
        return asArray(getValue(key));
    }

    public String getValue(String key) {
        return this.configuration.get(key);
    }

    public String[] asArray(String value) {
        return value.split(",");
    }

//    public Map<String, String> getConfiguration() {
//        return configuration;
//    }
    public int getValueAsInt(String interval) {
        return Integer.parseInt(getValue(interval));
    }

    public void setValue(String key, int interval) {
        this.setValue(key, String.valueOf(interval));
    }

    public void setValue(String key, boolean value) {
        this.setValue(key, String.valueOf(value));
    }

    public void setValue(String key, String value) {
        this.configuration.put(key, value);
        configurationStore.save(configuration);
    }

    public void setArrayValue(String key, String[] values) {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(value);
        }
        this.setValue(key, String.valueOf(sb.toString()));
    }
}
