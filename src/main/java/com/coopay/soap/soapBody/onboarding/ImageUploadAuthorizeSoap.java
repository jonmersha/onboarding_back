package com.coopay.soap.soapBody.onboarding;

import com.coopay.security.RequestCredentials;

public class ImageUploadAuthorizeSoap {
    public String body(String imageId, RequestCredentials requestCredentials){


        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cus=\"http://temenos.com/CUSTONBRD\">\n" +
                "\t<soapenv:Header/> \n" +
                "\t<soapenv:Body>\n" +
                "\t\t<cus:IMImageUploadAUTH> \n" +
                "\t\t<WebRequestCommon>\n" +
                "\n" +
                "\t\t<company>"+requestCredentials.getBranchCode()+"</company> \n" +
                "\t\t<password>"+requestCredentials.getPassword()+"</password> \n" +
                "\t\t<userName>"+requestCredentials.getUserName()+"</userName>\n" +
                "\t</WebRequestCommon>\n" +
                "\n" +
                "\t<IMDOCUMENTUPLOADCAPTUREType>\n" +
                "\n" +
                "\t<transactionId>"+imageId+"</transactionId> \n" +
                "\t</IMDOCUMENTUPLOADCAPTUREType>\n" +
                "</cus:IMImageUploadAUTH> \n" +
                "</soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
