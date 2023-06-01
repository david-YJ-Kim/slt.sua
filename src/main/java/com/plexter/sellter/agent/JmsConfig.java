package com.plexter.sellter.agent;

/**
 * Sample for EMS
 */

import com.tibco.tibjms.TibjmsConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Configuration
@EnableJms
public class JmsConfig {
    @Bean
    public ConnectionFactory connectionFactory() throws JMSException {
        TibjmsConnectionFactory connectionFactory = new TibjmsConnectionFactory();
        connectionFactory.setServerUrl("tibjmsnaming://localhost:7222");
        connectionFactory.setUserName("admin");
        connectionFactory.setUserPassword("admin");
        return connectionFactory;
    }
}
