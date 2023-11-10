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
@Table(name = "AccountType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountType.findAll", query = "SELECT a FROM AccountType a"),
    @NamedQuery(name = "AccountType.findByAccountTypeID", query = "SELECT a FROM AccountType a WHERE a.accountTypeID = :accountTypeID"),
    @NamedQuery(name = "AccountType.findByAccountTypeName", query = "SELECT a FROM AccountType a WHERE a.accountTypeName = :accountTypeName")})
public class AccountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "accountTypeID")
    private Integer accountTypeID;
    @Basic(optional = false)
    @Column(name = "accountTypeName")
    private String accountTypeName;
    @OneToMany(mappedBy = "accountTypeID")
    private List<Accounts> accountsList;

    public AccountType() {
    }

    public AccountType(Integer accountTypeID) {
        this.accountTypeID = accountTypeID;
    }

    public AccountType(Integer accountTypeID, String accountTypeName) {
        this.accountTypeID = accountTypeID;
        this.accountTypeName = accountTypeName;
    }

    public Integer getAccountTypeID() {
        return accountTypeID;
    }

    public void setAccountTypeID(Integer accountTypeID) {
        this.accountTypeID = accountTypeID;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    @XmlTransient
    public List<Accounts> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<Accounts> accountsList) {
        this.accountsList = accountsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountTypeID != null ? accountTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountType)) {
            return false;
        }
        AccountType other = (AccountType) object;
        if ((this.accountTypeID == null && other.accountTypeID != null) || (this.accountTypeID != null && !this.accountTypeID.equals(other.accountTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.AccountType[ accountTypeID=" + accountTypeID + " ]";
    }
    
}
