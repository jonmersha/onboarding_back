package com.coopay.soap.soapBody.onboarding;

import com.coopay.security.RequestCredentials;

public class AccountAuthorizeSoap {
    public String body(String accountID, RequestCredentials requestCredentials){

        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cus=\"http://temenos.com/CUSTONBRD\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <cus:ACCOUNTAUTH>\n" +
                "         <WebRequestCommon>\n" +
                "            <company>"+requestCredentials.getBranchCode()+"</company>\n" +
                "            <password>"+requestCredentials.getPassword()+"</password>\n" +
                "            <userName>"+requestCredentials.getUserName()+"</userName>\n" +
                "         </WebRequestCommon>\n" +
                "         <ACCOUNTAUTHType>\n" +
                "            <transactionId>"+accountID+"</transactionId>\n" +
                "         </ACCOUNTAUTHType>\n" +
                "      </cus:ACCOUNTAUTH>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
