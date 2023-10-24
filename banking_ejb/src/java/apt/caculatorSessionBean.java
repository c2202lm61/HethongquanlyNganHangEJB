/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package apt;

import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless(mappedName = "calJNDI")
public class caculatorSessionBean implements caculatorSessionBeanRemote {

    @Override
    public int plus(int a, int b) {
        return a+b;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
