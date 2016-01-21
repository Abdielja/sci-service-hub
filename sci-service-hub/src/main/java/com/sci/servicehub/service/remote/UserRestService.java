/**
 * 
 */
package com.sci.servicehub.service.remote;

import org.springframework.web.client.RestTemplate;

import com.sci.servicehub.model.UserData;

/**
 * @author Abdiel Jaramillo
 *
 */

public class UserRestService
{

    // ***** Constructors *****
    
    public UserRestService()
    {
     
    }

    
    // ***** Public Methods *****
    
    public UserData GetUserData()
    {
     
        UserData ud = null;

        RestTemplate restTemplate = new RestTemplate();
        //RestResponse res = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", RestResponse.class);
        
        return ud;
        
    }
    
}
