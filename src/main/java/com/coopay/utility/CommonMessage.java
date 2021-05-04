package com.coopay.utility;

public class CommonMessage {
    private String status;
    private String messageBody;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    public CommonMessage successMessage(String message){
        this.status="Success";
        this.messageBody=message;
        return this;
    }
    public CommonMessage errorMessage(String message){
        this.status="Error";
        this.messageBody=message;
        return this;
    }
}
