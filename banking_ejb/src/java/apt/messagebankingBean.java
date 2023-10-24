/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/MessageDrivenBean.java to edit this template
 */
package apt;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author user
 */
@MessageDriven(mappedName = "jms/bankingQueue4", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class messagebankingBean implements MessageListener {
    
    public messagebankingBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage msg  = (TextMessage) message;
        try {
            System.out.println("Inside MDB: "+msg.getText());
        } catch (JMSException ex) {
            Logger.getLogger(messagebankingBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
