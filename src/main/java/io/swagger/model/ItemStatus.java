package io.swagger.model;

public class ItemStatus {
    private String alertItemId;
    private String type;
    private String address;
    private String status;
    private String statusDate;
    private String statusMessage = null;
    private float attemptCount;
    private String lastAttemptDate = null;

    public ItemStatus(String alertItemId, String status) {
        this.alertItemId = alertItemId;
        this.status = status;
    }
// Getter Methods

    public String getAlertItemId() {
        return alertItemId;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public float getAttemptCount() {
        return attemptCount;
    }

    public String getLastAttemptDate() {
        return lastAttemptDate;
    }

    // Setter Methods

    public void setAlertItemId(String alertItemId) {
        this.alertItemId = alertItemId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public void setAttemptCount(float attemptCount) {
        this.attemptCount = attemptCount;
    }

    public void setLastAttemptDate(String lastAttemptDate) {
        this.lastAttemptDate = lastAttemptDate;
    }
}
