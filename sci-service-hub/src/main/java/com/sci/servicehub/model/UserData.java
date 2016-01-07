/**
 * 
 */
package com.sci.servicehub.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author abdiel Jaramillo
 *
 */
public class UserData
{

    // ***** Properties *****
    
    private long oid;
    private long userOid;
    private String name;
    private String businessPartnerId;
    private LocalDate startDate;

    private List<Company> companies;
    private List<Role> roles;
    
    /**
     * @return the oid
     */
    public long getOid()
    {
        return oid;
    }
    /**
     * @param oid the oid to set
     */
    public void setOid(long oid)
    {
        this.oid = oid;
    }

    /**
     * @return the userOid
     */
    public long getUserOid()
    {
        return userOid;
    }
    /**
     * @param userOid the userOid to set
     */
    public void setUserOid(long userOid)
    {
        this.userOid = userOid;
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
     * @return the businessPartnerId
     */
    public String getBusinessPartnerId()
    {
        return businessPartnerId;
    }
    /**
     * @param businessPartnerId the businessPartnerId to set
     */
    public void setBusinessPartnerId(String businessPartnerId)
    {
        this.businessPartnerId = businessPartnerId;
    }

    /**
     * @return the startDate
     */
    public LocalDate getStartDate()
    {
        return startDate;
    }
    /**
     * @param localDate the startDate to set
     */
    public void setStartDate(LocalDate localDate)
    {
        this.startDate = localDate;
    }

    
    /**
     * @return the companies
     */
    public List<Company> getCompanies()
    {
        return companies;
    }
    /**
     * @param companies the companies to set
     */
    public void setCompanies(List<Company> companies)
    {
        this.companies = companies;
    }
    
    /**
     * @return the roles
     */
    public List<Role> getRoles()
    {
        return roles;
    }
    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }
    
    
    // ***** Constructors *****
    
    public UserData()
    {
        setCompanies(new ArrayList<Company>());
        setRoles(new ArrayList<Role>());
    }
    
}
