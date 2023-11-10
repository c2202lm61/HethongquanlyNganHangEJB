package ent;

import ent.Accounts;
import ent.TransactionType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-10T16:41:22")
@StaticMetamodel(Transactions.class)
public class Transactions_ { 

    public static volatile SingularAttribute<Transactions, Accounts> accountID;
    public static volatile SingularAttribute<Transactions, Long> amount;
    public static volatile SingularAttribute<Transactions, TransactionType> transactionTypeID;
    public static volatile SingularAttribute<Transactions, Date> transactionDate;
    public static volatile SingularAttribute<Transactions, Integer> transactionID;

}