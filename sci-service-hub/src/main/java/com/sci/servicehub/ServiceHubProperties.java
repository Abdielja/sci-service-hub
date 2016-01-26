/**
 * 
 */
package com.sci.servicehub;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author abdiel Jaramillo
 *
 */

@ConfigurationProperties(prefix = "service-hub")
public class ServiceHubProperties
{

    public static class Openbravo
    {
        private String restUrlJson;
        private String restUrlXml;
        
        public String getRestUrlJson()
        {
            return restUrlJson;
        }
        public void setRestUrlJson(String restUrlJson)
        {
            this.restUrlJson = restUrlJson;
        }
        
        public String getRestUrlXml()
        {
            return restUrlXml;
        }
        public void setRestUrlXml(String restUrlXml)
        {
            this.restUrlXml = restUrlXml;
        }
    }
    
    private String version;
    private Openbravo openbravo;
    
    public String getVersion()
    {
        return version;
    }
    public void setVersion(String version)
    {
        this.version = version;
    }
    
    public Openbravo getOpenbravo()
    {
        return openbravo;
    }
    public void setOpenbravo(Openbravo openbravo)
    {
        this.openbravo = openbravo;
    }
    
}
