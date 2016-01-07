/**
 * 
 */
package com.sci.servicehub.model;

/**
 * @author abdiel Jaramillo
 *
 */

public class Route
{

    // ***** Properties *****

    private long oid;
    private String serverId;
    private String name;
    private String organizationId;
    private String roleId;
    
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
     * @return the organizationId
     */
    public String getOrganizationId()
    {
        return organizationId;
    }
    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
    }

    /**
     * @return the roleId
     */
    public String getRoleId()
    {
        return roleId;
    }
    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }



    // ***** Constructors *****

    public Route()
    {
        
    }
    
}
