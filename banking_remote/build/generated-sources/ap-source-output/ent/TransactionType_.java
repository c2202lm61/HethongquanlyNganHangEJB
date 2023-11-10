package ent;

import ent.Transactions;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-10T16:41:22")
@StaticMetamodel(TransactionType.class)
public class TransactionType_ { 

    public static volatile SingularAttribute<TransactionType, Integer> transactionTypeID;
    public static volatile ListAttribute<TransactionType, Transactions> transactionsList;
    public static volatile SingularAttribute<TransactionType, String> transactionTypename;

}