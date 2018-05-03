package com.example.demo.models;

public class ResponseWrapper {

    private String statusMsg;
    private String complaintId;
    private String statusCode;

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statuCode) {
        this.statusCode = statuCode;
    }
}
