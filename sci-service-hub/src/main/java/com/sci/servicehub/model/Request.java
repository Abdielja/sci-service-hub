/**
 * 
 */
package com.sci.servicehub.model;

/**
 * @author abdiel Jaramillo
 *
 */


public class Request
{

    // ***** Properties *****
    
    private long   oid;
    private int type;
    private String userName;
    private String password;
    private int provider;
    private boolean asynchronous;
    private String creationDate;
    private String description;

    /**
     * @return the oid
     */
    public long getOid()
    {
        return oid;
    }

    /**
     * @return the type
     */
    public int getType()
    {
        return type;
    }

    /**
     * @return the userName
     */
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
     * @return the provider
     */
    public int getProvider()
    {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(int provider)
    {
        this.provider = provider;
    }

    /**
     * @return the asynchronous
     */
    public boolean isAsynchronous()
    {
        return asynchronous;
    }

    /**
     * @param asynchronous the asynchronous to set
     */
    public void setAsynchronous(boolean asynchronous)
    {
        this.asynchronous = asynchronous;
    }

    /**
     * @return the creationDate
     */
    public String getCreationDate()
    {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
   
    
    // ***** Constructors *****
    
    public Request()
    {
    }

}
