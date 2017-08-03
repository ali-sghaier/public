/*
 * Created on 1 août 2017
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.sghaier.neolink.entretien.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Personal - Ali
 *
 *         1 août 2017
 *
 */
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4936671548791747449L;

    private Long              id;

    private String            name;

    private String            lastName;

    private Integer           age;

    private String            phone;

    private String            address;

    private List<Account>     accounts;

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
    public User() {

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the accounts
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
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
        final User other = (User) obj;
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
        return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone + ", address=" + address
                + ", accounts=" + accounts + "]";
    }

}
