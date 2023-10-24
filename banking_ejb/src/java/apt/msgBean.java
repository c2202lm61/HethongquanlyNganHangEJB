/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package apt;

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
@Stateless(mappedName = "msgBeanJNDI")
public class msgBean implements msgBeanRemote {

    @Resource(mappedName = "jms/bankingQueue4")
    private Queue bankingQueue4;

    @Resource(mappedName = "jms/bankingQueue4Factory")
    private ConnectionFactory bankingQueue4Factory;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Message createJMSMessageForjmsBankingQueue4(Session session, Object messageData) throws JMSException {
        // TODO create and populate message to send
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToBankingQueue4(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = bankingQueue4Factory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(bankingQueue4);
            messageProducer.send(createJMSMessageForjmsBankingQueue4(session, messageData));
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

    @Override
    public void sayHello(String msg) {
        try {
            sendJMSMessageToBankingQueue4(msg);
        } catch (JMSException ex) {
            Logger.getLogger(msgBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
