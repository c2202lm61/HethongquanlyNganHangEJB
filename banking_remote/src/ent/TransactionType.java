/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ent;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TransactionType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionType.findAll", query = "SELECT t FROM TransactionType t"),
    @NamedQuery(name = "TransactionType.findByTransactionTypename", query = "SELECT t FROM TransactionType t WHERE t.transactionTypename = :transactionTypename"),
    @NamedQuery(name = "TransactionType.findByTransactionTypeID", query = "SELECT t FROM TransactionType t WHERE t.transactionTypeID = :transactionTypeID")})
public class TransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "transactionType_name")
    private String transactionTypename;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transactionTypeID")
    private Integer transactionTypeID;
    @OneToMany(mappedBy = "transactionTypeID")
    private List<Transactions> transactionsList;

    public TransactionType() {
    }

    public TransactionType(Integer transactionTypeID) {
        this.transactionTypeID = transactionTypeID;
    }

    public TransactionType(Integer transactionTypeID, String transactionTypename) {
        this.transactionTypeID = transactionTypeID;
        this.transactionTypename = transactionTypename;
    }

    public String getTransactionTypename() {
        return transactionTypename;
    }

    public void setTransactionTypename(String transactionTypename) {
        this.transactionTypename = transactionTypename;
    }

    public Integer getTransactionTypeID() {
        return transactionTypeID;
    }

    public void setTransactionTypeID(Integer transactionTypeID) {
        this.transactionTypeID = transactionTypeID;
    }

    @XmlTransient
    public List<Transactions> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transactions> transactionsList) {
        this.transactionsList = transactionsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionTypeID != null ? transactionTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionType)) {
            return false;
        }
        TransactionType other = (TransactionType) object;
        if ((this.transactionTypeID == null && other.transactionTypeID != null) || (this.transactionTypeID != null && !this.transactionTypeID.equals(other.transactionTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.TransactionType[ transactionTypeID=" + transactionTypeID + " ]";
    }
    
}
