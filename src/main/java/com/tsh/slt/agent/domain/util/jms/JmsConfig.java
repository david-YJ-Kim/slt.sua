//package com.plexter.sellter.agent.util.jms;
//
///**
// * Sample for EMS
// */
//
//import com.tibco.tibjms.TibjmsConnectionFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.annotation.EnableJms;
//
//import javax.jms.JMSException;
//
//@Configuration
//@EnableJms
//public class JmsConfig {
//
//    @Value("${ems.host}")
//    private String emsHost;
//
//    @Value("${ems.port}")
//    private String emsPort;
//
//    @Value("${ems.user}")
//    private String emsUser;
//
//    @Value("${ems.password}")
//    private String emsPassword;
//
//    @Value("${ems.destination.receive}")
//    private String emsReceiveQueue;
//
//    @Value("${ems.destination.request}")
//    private String emsRequestQueue;
//
//    @Bean
//    public TibjmsConnectionFactory connectionFactory() throws JMSException {
//        TibjmsConnectionFactory connectionFactory = new TibjmsConnectionFactory();
//        connectionFactory.setServerUrl(emsHost + ":" + emsPort);
//        connectionFactory.setUserName(emsUser);
//        connectionFactory.setUserPassword(emsPassword);
//        return connectionFactory;
//    }
//
//    public String getEmsReceiveQueue() {
//        return emsReceiveQueue;
//    }
//
//    public String getEmsRequestQueue() {
//        return emsRequestQueue;
//    }
//}
