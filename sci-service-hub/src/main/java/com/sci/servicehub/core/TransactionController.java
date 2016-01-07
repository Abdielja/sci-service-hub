/**
 * 
 */
package com.sci.servicehub.core;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sci.servicehub.model.Company;
import com.sci.servicehub.model.Invoice;
import com.sci.servicehub.model.Request;
import com.sci.servicehub.model.Role;
import com.sci.servicehub.model.Route;
import com.sci.servicehub.model.UserData;

/**
 * @author abdiel Jaramillo
 *
 */

@RestController
public class TransactionController
{

    private final AtomicLong    counter  = new AtomicLong();

    @RequestMapping(value = "/transaction/open", method = RequestMethod.POST)
    public ResponseEntity<UserData> transactionOpen(@RequestBody Request req)
    {
        
        if (req.getUserName().equals("None") || req.getPassword().equals("None"))
        {
            return new ResponseEntity<UserData>(HttpStatus.NON_AUTHORITATIVE_INFORMATION);            
        }        

        UserData ud = new UserData();
        
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
        return new ResponseEntity<UserData>(ud, HttpStatus.OK);            
    }

    @RequestMapping(value = "/transaction/invoice", method = RequestMethod.POST)
    public ResponseEntity<Invoice> transactionInvoice(@RequestBody Invoice invoice)
    {

        return new ResponseEntity<Invoice>(HttpStatus.NO_CONTENT);
        
    }
    
}
