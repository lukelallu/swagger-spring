package io.swagger.model;

public class AlertElement {

        private String languageCode;
        private String userGroup;
        private String userName;
        private String phoneNumber;
        private String phoneNumberPrefix = null;
        private String phoneNumberExtension = null;
        private String phoneNumberPauseIndicator = null;
        private String messageBody;
        private String shortCode = null;
        private String priority;
        private String tenentId;
        private String billingBankCode;
        private String billingAccountNumber;
        private String billingACHCompanyId;
        private String billingACHCompanyName;
        private String billingReportId;


        // Getter Methods

        public String getLanguageCode() {
            return languageCode;
        }

        public String getUserGroup() {
            return userGroup;
        }

        public String getUserName() {
            return userName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getPhoneNumberPrefix() {
            return phoneNumberPrefix;
        }

        public String getPhoneNumberExtension() {
            return phoneNumberExtension;
        }

        public String getPhoneNumberPauseIndicator() {
            return phoneNumberPauseIndicator;
        }

        public String getMessageBody() {
            return messageBody;
        }

        public String getShortCode() {
            return shortCode;
        }

        public String getPriority() {
            return priority;
        }

        public String getTenentId() {
            return tenentId;
        }

        public String getBillingBankCode() {
            return billingBankCode;
        }

        public String getBillingAccountNumber() {
            return billingAccountNumber;
        }

        public String getBillingACHCompanyId() {
            return billingACHCompanyId;
        }

        public String getBillingACHCompanyName() {
            return billingACHCompanyName;
        }

        public String getBillingReportId() {
            return billingReportId;
        }

        // Setter Methods

        public void setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
        }

        public void setUserGroup(String userGroup) {
            this.userGroup = userGroup;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setPhoneNumberPrefix(String phoneNumberPrefix) {
            this.phoneNumberPrefix = phoneNumberPrefix;
        }

        public void setPhoneNumberExtension(String phoneNumberExtension) {
            this.phoneNumberExtension = phoneNumberExtension;
        }

        public void setPhoneNumberPauseIndicator(String phoneNumberPauseIndicator) {
            this.phoneNumberPauseIndicator = phoneNumberPauseIndicator;
        }

        public void setMessageBody(String messageBody) {
            this.messageBody = messageBody;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public void setTenentId(String tenentId) {
            this.tenentId = tenentId;
        }

        public void setBillingBankCode(String billingBankCode) {
            this.billingBankCode = billingBankCode;
        }

        public void setBillingAccountNumber(String billingAccountNumber) {
            this.billingAccountNumber = billingAccountNumber;
        }

        public void setBillingACHCompanyId(String billingACHCompanyId) {
            this.billingACHCompanyId = billingACHCompanyId;
        }

        public void setBillingACHCompanyName(String billingACHCompanyName) {
            this.billingACHCompanyName = billingACHCompanyName;
        }

        public void setBillingReportId(String billingReportId) {
            this.billingReportId = billingReportId;
        }

}
