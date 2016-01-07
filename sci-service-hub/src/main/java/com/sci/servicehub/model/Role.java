/**
 * 
 */
package com.sci.servicehub.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abdiel Jaramillo
 *
 */
public class Role
{

    // ***** Properties *****
    
    private long oid;
    private String name;
    private String description;
    private String organizationId;
    private String organizationList;
    private String serverId;
    private String warehouseId;
    
    private List<Route> routes;
    
    /**
     * @return the oid
     */
    public long getOid()
    {
        return oid;
    }
    /**
     * @param l the oid to set
     */
    public void setOid(long l)
    {
        this.oid = l;
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
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
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
     * @return the organizationList
     */
    public String getOrganizationList()
    {
        return organizationList;
    }
    /**
     * @param organizationList the organizationList to set
     */
    public void setOrganizationList(String organizationList)
    {
        this.organizationList = organizationList;
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
     * @return the warehouseId
     */
    public String getWarehouseId()
    {
        return warehouseId;
    }
    /**
     * @param warehouseId the warehouseId to set
     */
    public void setWarehouseId(String warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    /**
     * @return the routes
     */
    public List<Route> getRoutes()
    {
        return routes;
    }
    /**
     * @param routes the routes to set
     */
    public void setRoutes(List<Route> routes)
    {
        this.routes = routes;
    }
    
    // ***** Constructors *****
    
    public Role()
    {
        routes = new ArrayList<Route>();
    }
}
