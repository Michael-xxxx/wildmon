package org.lightfish.business.configuration.control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.lightfish.business.configuration.entity.Configuration;

/**
 *
 * @author rveldpau
 */
@Stateless
public class ConfigurationStore {

    @PersistenceContext
    EntityManager em;

    public Configuration retrieveConfiguration() {
        Configuration configuration = em.find(Configuration.class, Configuration.ID);
        if (configuration == null) {
            configuration = createDefault();
        }

        return configuration;
    }

    public void save(Configuration configuration) {
        em.merge(configuration);
    }

    private Configuration createDefault() {
        Configuration configuration = new Configuration();
        configuration.put("location", "localhost:9990");
        configuration.put("jdbcPoolNames", "SamplePool");
        configuration.put("interval", "2");
        configuration.put("username", "");
        configuration.put("password", "");
        configuration.put("serverInstances", "server");
        configuration.put("maxParallelThreads", "0");
        configuration.put("collectionTimeout", "10");
        configuration.put("dataCollectionRetries", "1");
        configuration.put("defaultMaxLogResults", "40");
        configuration.put("collectLogs", "true");
        configuration.put("application", "lightfish4wildfly.war");
        em.persist(configuration);
        return configuration;
    }
}
