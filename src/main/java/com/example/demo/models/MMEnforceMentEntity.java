package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domain")
public class MMEnforceMentEntity {
    @Id
    private long id;

    private String aladdinUserId;
    private String listingUrl;
    private String reasonCode;
    private String description;
    private String complaintId;
    private String statuCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAladdinUserId() {
        return aladdinUserId;
    }

    public void setAladdinUserId(String aladdinUserId) {
        this.aladdinUserId = aladdinUserId;
    }

    public String getListingUrl() {
        return listingUrl;
    }

    public void setListingUrl(String listingUrl) {
        this.listingUrl = listingUrl;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getStatuCode() {
        return statuCode;
    }

    public void setStatuCode(String statuCode) {
        this.statuCode = statuCode;
    }

}
