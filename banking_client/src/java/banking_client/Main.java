/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking_client;

import apt.CustomersFacadeRemote;
import apt.TransactionTypeFacadeRemote;
import ent.TransactionType;
import javax.ejb.EJB;

/**
 *
 * @author user
 */
public class Main {

    @EJB(lookup = "TransactionTypeFacade")
    private static TransactionTypeFacadeRemote transactionTypeFacade;

    @EJB(lookup = "CustomersFacade")
    
    private static CustomersFacadeRemote customersFacade;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(customersFacade.count());
        TransactionType transactionType = new TransactionType();
        transactionType.setTransactionTypename("Banktransfer");
        transactionTypeFacade.create(transactionType);
        // TODO code application logic here
    }
    
}
