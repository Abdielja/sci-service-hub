/**
 * 
 */
package com.sci.servicehub.model;

import java.util.List;

/**
 * @author Abdiel Jaramillo
 *
 */

public class Response
{

    private int status;
    private int totalRows;
    private int startRow;
    private int endRow;
    
    private List<?> data;
    
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }

    public int getTotalRows()
    {
        return totalRows;
    }
    public void setTotalRows(int totalRows)
    {
        this.totalRows = totalRows;
    }

    public int getStartRow()
    {
        return startRow;
    }
    public void setStartRow(int startRow)
    {
        this.startRow = startRow;
    }

    public int getEndRow()
    {
        return endRow;
    }
    public void setEndRow(int endRow)
    {
        this.endRow = endRow;
    }

    public List<?> getData()
    {
        return data;
    }
    public void setData(List<?> data)
    {
        this.data = data;
    }

}
