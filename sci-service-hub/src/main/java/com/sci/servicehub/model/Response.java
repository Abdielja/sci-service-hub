/**
 * 
 */
package com.sci.servicehub.model;

import org.springframework.http.HttpStatus;

/**
 * @author Abdiel Jaramillo
 *
 */
public class Response
{

    // ***** Properties *****
    
    private HttpStatus httpStatus;
    
    /**
     * @return the httpStatus
     */
    public HttpStatus getHttpStatus()
    {
        return httpStatus;
    }
    /**
     * @param httpStatus the httpStatus to set
     */
    public void setHttpStatus(HttpStatus httpStatus)
    {
        this.httpStatus = httpStatus;
    }
    
    
    
    public Response()
    {
        
    }
    
    public Response(HttpStatus status)
    {
        this.httpStatus = status;
    }
    
}
