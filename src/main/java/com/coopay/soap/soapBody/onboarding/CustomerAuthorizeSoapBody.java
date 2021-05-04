package com.coopay.soap.soapBody.onboarding;


import com.coopay.security.RequestCredentials;

public class CustomerAuthorizeSoapBody {


    public String  customerAuthorizationSoapBody(String customerId,RequestCredentials requestCredentials){

        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cus=\"http://temenos.com/CUSTONBRD\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <cus:CUSTOMERAUTH>\n" +
                "         <WebRequestCommon>\n" +
                "            <!--Optional:-->\n" +
                "            <company>"+requestCredentials.getBranchCode()+"</company>\n" +
                "            <password>"+requestCredentials.getPassword()+"</password>\n" +
                "            <userName>"+requestCredentials.getUserName()+"</userName>\n" +
                "         </WebRequestCommon>\n" +
                "         <!--Optional:-->\n" +
                "         <CUSTOMERNAUType>\n" +
                "            <!--Optional:-->\n" +
                "            <transactionId>"+customerId+"</transactionId>\n" +
                "         </CUSTOMERNAUType>\n" +
                "      </cus:CUSTOMERAUTH>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }




}
