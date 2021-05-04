package com.coopay.soap;


import com.coopay.utility.PathString;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class RequestProcess {

    public SOAPMessage soapRequest(String soapMessage){
        SOAPConnectionFactory soapConnectionFactory = null;
        try {
            soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage responseMassage=soapConnection.call(getSoapMessageFromString(soapMessage), PathString.ON_BOARDING_URL);
            return responseMassage;
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public AccountViewResponse accountView(SOAPMessage soapBody){
//        Node node=this.getSoapBody(soapBody);
//        AccountViewResponse accountView=new AccountViewResponse();
//        accountView.setStatus(node.getChildNodes().item(0).getChildNodes().item(0).getChildNodes().item(0).getNodeValue());
//
//        if(accountView.getStatus().equals("Success")){
//            try{
//                Node detailNode= (Node) node.getChildNodes().item(1).getChildNodes().item(0).getChildNodes().item(0).getChildNodes();
//                System.out.println(detailNode);
//                accountView.setFullName(detailNode.getChildNodes().item(1).getChildNodes().item(0).getNodeValue());
//                accountView.setErrorMessage("success");
//            }
//
//            catch (Exception ex){
//                accountView.setErrorMessage(node.getChildNodes().item(0).getChildNodes().item(1).getChildNodes().item(0).getNodeValue());
//
//            }
//        }
//        else{
//            accountView.setErrorMessage(node.getChildNodes().item(0).getChildNodes().item(0).getChildNodes().item(0).getNodeValue());
//
//        }
//        return accountView;
//
//    }
    public SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(),
                new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
        return message;
    }


    private Node getSoapBody(SOAPMessage message) {
        try {

            Node firstElement = this.getFirstElement(message);

            return firstElement;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private Node getFirstElement(SOAPMessage message) throws SOAPException {
        final NodeList childNodes = message.getSOAPBody().getChildNodes();
        Node firstElement = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i) instanceof Element) {
                firstElement =  childNodes.item(i);
                break;
            }
        }
        return firstElement;
    }
}
