/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apt;

import ent.TransactionType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless(mappedName = "TransactionTypeFacade")
public class TransactionTypeFacade extends AbstractFacade<TransactionType> implements apt.TransactionTypeFacadeRemote {

    @PersistenceContext(unitName = "banking_modulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionTypeFacade() {
        super(TransactionType.class);
    }
    
}
