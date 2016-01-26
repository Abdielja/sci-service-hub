/**
 * 
 */
package com.sci.servicehub.service.remote;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sci.servicehub.model.UserData;

/**
 * @author Abdiel Jaramillo
 *
 */

@Service
public class UserRestService
{
    @Value("${service-hub.openbravo.rest-url-json}")
    private String openbravoRestUrlJson;
    
    // ***** Constructors *****
    
    public UserRestService()
    {
     
    }

    
    // ***** Public Methods *****
    
    public UserData GetUserData()
    {
     
        UserData ud = null;
        
System.out.println("\nOpenbravo Rest URl: " + openbravoRestUrlJson);
        
        RestTemplate restTemplate = new RestTemplate();
        //RestResponse res = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", RestResponse.class);
        
        return ud;
        
    }
    
}
