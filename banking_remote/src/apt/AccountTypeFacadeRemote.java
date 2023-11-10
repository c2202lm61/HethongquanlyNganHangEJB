/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apt;

import ent.AccountType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author user
 */
@Remote
public interface AccountTypeFacadeRemote {

    void create(AccountType accountType);

    void edit(AccountType accountType);

    void remove(AccountType accountType);

    AccountType find(Object id);

    List<AccountType> findAll();

    List<AccountType> findRange(int[] range);

    int count();
    
}
