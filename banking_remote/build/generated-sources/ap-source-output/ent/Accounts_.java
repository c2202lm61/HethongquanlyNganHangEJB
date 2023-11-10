package ent;

import ent.AccountType;
import ent.Customers;
import ent.Transactions;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-10T16:41:22")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile SingularAttribute<Accounts, Integer> accountID;
    public static volatile SingularAttribute<Accounts, AccountType> accountTypeID;
    public static volatile SingularAttribute<Accounts, Long> balance;
    public static volatile SingularAttribute<Accounts, Customers> customerID;
    public static volatile SingularAttribute<Accounts, Date> openDate;
    public static volatile ListAttribute<Accounts, Transactions> transactionsList;

}