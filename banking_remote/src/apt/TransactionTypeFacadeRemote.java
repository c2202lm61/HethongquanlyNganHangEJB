/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apt;

import ent.TransactionType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author user
 */
@Remote
public interface TransactionTypeFacadeRemote {

    void create(TransactionType transactionType);

    void edit(TransactionType transactionType);

    void remove(TransactionType transactionType);

    TransactionType find(Object id);

    List<TransactionType> findAll();

    List<TransactionType> findRange(int[] range);

    int count();
    
}
