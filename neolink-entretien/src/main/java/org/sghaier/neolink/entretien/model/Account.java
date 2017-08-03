/*
 * Created on 1 août 2017
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.sghaier.neolink.entretien.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Personal - Ali
 *
 *         1 août 2017
 *
 */
public class Account implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4883829414625858605L;

    private Long              id;

    private Date              dateCreation;

    private BigDecimal        balance;

    private User              user;

    /**
     * <br>
     * <br>
     *
     * @author Personal - Ali
     *
     *         1 août 2017
     *
     * 
     */
    public Account() {

    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        }
        else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Account [id=" + id + ", dateCreation=" + dateCreation + ", balance=" + balance + ", user=" + user + "]";
    }

}
