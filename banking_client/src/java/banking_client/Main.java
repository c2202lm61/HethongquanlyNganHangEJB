/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking_client;

import apt.caculatorSessionBeanRemote;
import apt.msgBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author user
 */
public class Main {

    @EJB(lookup = "msgBeanJNDI")
    private static msgBeanRemote msgBean;
    
    @EJB(lookup = "calJNDI")
    private static caculatorSessionBeanRemote caculatorSessionBean;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tổng của 2 số là"+caculatorSessionBean.plus(5, 3));
        msgBean.sayHello("Hello world");
    }
    
}
