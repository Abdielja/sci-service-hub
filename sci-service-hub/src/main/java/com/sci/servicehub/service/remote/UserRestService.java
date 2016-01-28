/**
 * 
 */
package com.sci.servicehub.service.remote;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sci.servicehub.model.Company;
import com.sci.servicehub.model.Response;
import com.sci.servicehub.model.RestResponse;
import com.sci.servicehub.model.Role;
import com.sci.servicehub.model.Route;
import com.sci.servicehub.model.UserData;

/**
 * @author Abdiel Jaramillo
 *
 */

@Service
public class UserRestService
{
    
    // ***** External Properties *****
    
    @Value("${service-hub.openbravo.rest-url-json}")
    private String openbravoRestUrlJson;

    // ***** This is for debugging purposes only ***** 
    private final AtomicLong    counter  = new AtomicLong();
    // ***********************************************
    
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
 
        // ***** This is for debugging purposes only ***** 

        System.out.println("\nOpenbravo Rest URl: " + openbravoRestUrlJson);

        ud = new UserData();
        
        ud.setOid(counter.incrementAndGet());
        ud.setUserOid(1);
        ud.setName("Edgardo Natis");
        ud.setBusinessPartnerId("1081EFAA351D0B2601352134A21B0AA0");
        
        LocalDate date = LocalDate.now();
        ud.setStartDate(date);
        //ud.setStartDate(date.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        
        Role role_1 = new Role();
        role_1.setOid(counter.incrementAndGet());
        role_1.setDescription("Servicios Generales FAMA FM, S.A");
        role_1.setName("PA FMA RZT 0407");
        role_1.setOrganizationId("3C25A3F8BEFD4331BA3B4EDFF77BF6BC");
        role_1.setOrganizationList("17267376A7314A7995D941C2E010651B,3C25A3F8BEFD4331BA3B4EDFF77BF6BC");
        role_1.setServerId("95857EBB264247A581231837B20DB546");
        role_1.setWarehouseId("C50559574E704D01B75C8EA11EE746C1");
        
        Route route_1 = new Route();
        route_1.setOid(counter.incrementAndGet());
        route_1.setServerId("17267376A7314A7995D941C2E010651B");
        route_1.setName("PA FMA RZT 0407");
        route_1.setRoleId(role_1.getServerId());
        route_1.setOrganizationId("17267376A7314A7995D941C2E010651B");
        
        role_1.getRoutes().add(route_1);
        
        ud.getRoles().add(role_1);
            
        Company company = new Company();
        company.setName("Servicios Generales FAMA, S.A.");
        company.setServerId("1081EFAA357711B801358BEDA4CC0947");
        company.setRuc("1678711-1-681562 DV 70");
        
        ud.getCompanies().add(company);
        
        // ***********************************************
        
        return ud;
        
    }
    
    public RestResponse getPaymentTerms(String userName, String password)
    {
    
        RestTemplate restTemplate = new RestTemplate();
        RestResponse res = restTemplate.getForObject("http://190.219.6.238:9095/OBDND/org.openbravo.service.json.jsonrest/DND_PAYMENTTERM_V?&l=" + userName + "&p=" + password, RestResponse.class);

        return res;
    }
    
    public RestResponse getPaymentMethods(String userName, String password)
    {
    
        RestTemplate restTemplate = new RestTemplate();
        RestResponse res = restTemplate.getForObject("http://190.219.6.238:9095/OBDND/org.openbravo.service.json.jsonrest/DND_PAYMENTMETHOD_V?_where=username='ORodriguez'&l=" + userName + "&p=" + password, RestResponse.class);

        return res;
    }
    
}
