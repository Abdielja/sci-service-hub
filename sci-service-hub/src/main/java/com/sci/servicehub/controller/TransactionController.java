/**
 * 
 */
package com.sci.servicehub.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sci.servicehub.model.Invoice;
import com.sci.servicehub.model.Request;
import com.sci.servicehub.model.RestResponse;
import com.sci.servicehub.model.User;
import com.sci.servicehub.model.UserData;
import com.sci.servicehub.model.example.Quote;
import com.sci.servicehub.repository.UserRepository;
import com.sci.servicehub.service.remote.UserRestService;

/**
 * @author abdiel Jaramillo
 *
 */

@RestController
public class TransactionController
{

    @Autowired
    UserRepository userRepo;
    
    @Autowired
    UserRestService userRestService;
    
    @RequestMapping(value = "/transaction/open", method = RequestMethod.POST)
    public ResponseEntity<UserData> transactionOpen(@RequestBody Request req)
    {
        
        // *** Verify parameters are not empty ***
        if (req.getUserName().equals("None") || req.getPassword().equals("None"))
        {
            return new ResponseEntity<UserData>(HttpStatus.NON_AUTHORITATIVE_INFORMATION);            
        }        

        User user = userRepo.findByUserName(req.getUserName());
        
        // *** Verify user credentials ***
        if (user != null)
        {
            if(!user.getPassword().equals(req.getPassword()))
            {
                return new ResponseEntity<UserData>(HttpStatus.UNAUTHORIZED);                                
            }
        }
        else
        {
            return new ResponseEntity<UserData>(HttpStatus.UNAUTHORIZED);                        
        }

        UserData ud = userRestService.GetUserData();
        
        return new ResponseEntity<UserData>(ud, HttpStatus.OK);            
    }

    @RequestMapping(value = "/transaction/salesman", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionSalesmanInfo(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getSalesmanInfo(requestParams.get("userId"), requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/customer", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionCustomersByUser(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getCustomersByUser(requestParams.get("userId"), requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/organization", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionOrganizationsByUser(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getOrganizationsByUser(requestParams.get("userId"), requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/product", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionProductsByUser(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getProductsByUser(requestParams.get("userId"), requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/taxCategory", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionTaxCategories(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getTaxCategories(requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/paymentTerms", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionPaymentTerms(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getPaymentTerms(requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/paymentMethods", method = RequestMethod.GET)
    public ResponseEntity<RestResponse> transactionPaymentMethods(@RequestParam Map<String,String> requestParams)
    {
    
        RestResponse res = userRestService.getPaymentMethods(requestParams.get("userName"), requestParams.get("password"));
        
        return new ResponseEntity<RestResponse>(res, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/transaction/invoice", method = RequestMethod.POST)
    public ResponseEntity<Invoice> transactionInvoice(@RequestBody Invoice invoice)
    {

        return new ResponseEntity<Invoice>(HttpStatus.NO_CONTENT);
        
    }

    @RequestMapping(value = "/transaction/quote", method = RequestMethod.GET)
    public ResponseEntity<Quote> transactionQuote()
    {
    
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        
        System.out.println("\n" + quote + "\n");
        
        return new ResponseEntity<Quote>(quote, HttpStatus.OK);
    }
    

}
