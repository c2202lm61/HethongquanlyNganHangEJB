package ent;

import ent.Accounts;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-10T15:29:06")
@StaticMetamodel(AccountType.class)
public class AccountType_ { 

    public static volatile ListAttribute<AccountType, Accounts> accountsList;
    public static volatile SingularAttribute<AccountType, Integer> accountTypeID;
    public static volatile SingularAttribute<AccountType, String> accountTypeName;

}