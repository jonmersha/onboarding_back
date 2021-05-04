package com.coopay.soap.soapBody;

import com.coopay.security.RequestCredentials;

public class AccountView {
    public String accountViewBody(RequestCredentials requestCredentials, String accountNumber){

       // String accountNumber="1000065313972";

        String accountViewBody="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:mmt=\"http://temenos.com/MMT\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <mmt:ACCOUNTVIEW>\n" +
                "         <WebRequestCommon>\n" +
                "            \t<company>"+requestCredentials.getBranchCode()+"</company>\n" +
                "           \t<password>"+requestCredentials.getPassword()+"</password>\n" +
                "            \t<userName>"+requestCredentials.getUserName()+"</userName>\n" +
                "         </WebRequestCommon>\n" +
                "         <ACCTVIEWType>\n" +
                "  \n" +
                "            <enquiryInputCollection>\n" +
                "           \n" +
                "               <columnName>ACCOUNT.NUMBER</columnName>\n" +
                "              \n" +
                "               <criteriaValue>"+accountNumber+"</criteriaValue>\n" +
                "  \n" +
                "               <operand>EQ</operand>\n" +
                "            </enquiryInputCollection>\n" +
                "         </ACCTVIEWType>\n" +
                "      </mmt:ACCOUNTVIEW>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        return accountViewBody;
    }
}
