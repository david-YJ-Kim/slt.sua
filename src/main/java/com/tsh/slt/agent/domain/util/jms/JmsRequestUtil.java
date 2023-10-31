//package com.plexter.sellter.agent.util.jms;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.jms.*;
//
//@Component
//public class JmsRequestUtil {
//
//    private final JmsConfig jmsConfig;
//
//    private final ConnectionFactory connectionFactory;
//    private final Connection connection;
//    private final Session session;
//    private final MessageProducer scrapRequestProducer;
//    private final Destination scrapRequestDestination;
//
//
//
//
//    @Autowired
//    public JmsRequestUtil(JmsConfig jmsConfig) throws JMSException {
//        this.jmsConfig = jmsConfig;
//        this.connectionFactory = jmsConfig.connectionFactory();
//        this.connection = this.connectionFactory.createConnection();
//        this.session = this.connection.createSession(Session.AUTO_ACKNOWLEDGE);
//
//        this.scrapRequestDestination = this.session.createQueue(jmsConfig.getEmsRequestQueue());
//        this.scrapRequestProducer = this.session.createProducer(this.scrapRequestDestination);
//        this.scrapRequestProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
//
//    }
//
//    public void sendScrapRequest(String payload)  {
//        try{
//            Session localSession = this.connection.createSession(Session.AUTO_ACKNOWLEDGE);
//            TextMessage message = localSession.createTextMessage();
//            Destination destination = localSession.createQueue(jmsConfig.getEmsRequestQueue());
//            MessageProducer messageProducer = localSession.createProducer(destination);
//
//            message.setText(payload);
//            // scrapRequestProducer.send(this.scrapRequestDestination, message);
//            messageProducer.send(destination, message);
//        }catch (JMSException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public boolean closeScrapProducer() {
//        try{
//            this.scrapRequestProducer.close();
//            return true;
//        }catch (JMSException e){
//            // TODO Hadnle Exception.
//            return false;
//        }
//    }
//
//    public boolean closeJmsSession() {
//        try{
//            this.session.close();
//            return true;
//        }catch (JMSException e){
//            // TODO Hadnle Exception.
//            return false;
//        }
//    }
//
//    public boolean closeJmsConnection() {
//        try{
//            this.connection.close();
//            return true;
//        }catch (JMSException e){
//            // TODO Hadnle Exception.
//            return false;
//        }
//    }
//
//
//}
