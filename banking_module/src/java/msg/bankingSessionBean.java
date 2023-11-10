/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package msg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 *
 * @author user
 */
@Stateless(mappedName = "bankingSessionBean")
public class bankingSessionBean implements bankingSessionBeanRemote {

    @Resource(mappedName = "jms/bankingQueue")
    private Queue bankingQueue;

    @Resource(mappedName = "jms/bankingQueueFactory")
    private ConnectionFactory bankingQueueFactory;
    
    @Override
    public void sentMessage(String msg) {
        try {
            sendJMSMessageToBankingQueue(msg);
        } catch (JMSException ex) {
            Logger.getLogger(bankingSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Message createJMSMessageForjmsBankingQueue(Session session, Object messageData) throws JMSException {
        // TODO create and populate message to send
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToBankingQueue(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = bankingQueueFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(bankingQueue);
            messageProducer.send(createJMSMessageForjmsBankingQueue(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
