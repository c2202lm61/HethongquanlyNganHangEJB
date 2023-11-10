/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package msg;

import javax.ejb.Remote;

/**
 *
 * @author user
 */
@Remote
public interface bankingSessionBeanRemote {

    void sentMessage(String msg);
    
}
