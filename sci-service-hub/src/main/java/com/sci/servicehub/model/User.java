package com.sci.servicehub.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{

    // ********** Status Constants **********
    
    public static final int STATUS_OPEN = 1;
    public static final int STATUS_CLOSED = 2;
    
    // ********** Properties **********
    
    private long id;
    private String serverId;
    private String userName;
    private String password;
    private String name;
    private String active;
    private int status;    
    private LocalDate lastBalanceDate;
        
    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long getId()
    {
        return id;
    }
    /**
     * @param oid the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return the serverId
     */
    public String getServerId()
    {
        return serverId;
    }
    /**
     * @param serverId the serverId to set
     */
    public void setServerId(String serverId)
    {
        this.serverId = serverId;
    }

    /**
     * @return the userName
     */
    @Column(unique=true)
    public String getUserName()
    {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
 
    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the active
     */
    public String getActive()
    {
        return active;
    }
    /**
     * @param active the active to set
     */
    public void setActive(String active)
    {
        this.active = active;
    }

    /**
     * @return the status
     */
    public int getStatus()
    {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(int status)
    {
        this.status = status;
    }

    /**
     * @return the lastBalanceDate
     */
    public LocalDate getLastBalanceDate()
    {
        return lastBalanceDate;
    }
    /**
     * @param lastBalanceDate the lastBalanceDate to set
     */
    public void setLastBalanceDate(LocalDate lastBalanceDate)
    {
        this.lastBalanceDate = lastBalanceDate;
    }
    
    
    // ***** Constructors *****

    public User()
    {
    	
    }
    
    // ***** public Methods *****
    
    @Override
    public String toString() 
    {
        return String.format("User[id=%d, name='%s']", id, name);
    }
    
}
