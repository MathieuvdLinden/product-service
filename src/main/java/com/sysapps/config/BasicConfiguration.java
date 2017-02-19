package com.sysapps.config;

import com.datastax.driver.core.Session;
import com.sysapps.model.Product;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableAutoConfiguration
public class BasicConfiguration {

    @Configuration
    @EnableCassandraRepositories
    static class CassandraConfig extends AbstractCassandraConfiguration {

        @Override
        protected String getKeyspaceName() {
            return "products";
        }

        @Bean
        CassandraTemplate cassandraTemplate(Session session) {
            return new CassandraTemplate(session);
        }

        @Override
        public String[] getEntityBasePackages() {
            return new String[] { Product.class.getPackage().getName() };
        }

        @Override
        public SchemaAction getSchemaAction() {
            return SchemaAction.RECREATE;
        }
    }
}
