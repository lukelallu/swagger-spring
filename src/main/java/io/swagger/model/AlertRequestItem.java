package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by cbridges on 12/7/15.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes.Type(value = SMSAlertRequestItem.class, name = "sms")
abstract public class AlertRequestItem
{

	private String languageCode;
	private String userGroup;
	private String userName;
	private String priority;
	private String tenentId;
	private String billingBankCode;
	private String billingAccountNumber;
	private String billingACHCompanyId;
	private String billingACHCompanyName;
	private String billingReportId;
	private String billingReportType;

	public String getLanguageCode()
	{
		return languageCode;
	}

	public void setLanguageCode(final String languageCode)
	{
		this.languageCode = languageCode;
	}

	public String getUserGroup()
	{
		return userGroup;
	}

	public void setUserGroup(final String userGroup)
	{
		this.userGroup = userGroup;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(final String userName)
	{
		this.userName = userName;
	}

	public String getBillingBankCode()
	{
		return billingBankCode;
	}

	public void setBillingBankCode(final String billingBankCode)
	{
		this.billingBankCode = billingBankCode;
	}

	public String getBillingAccountNumber()
	{
		return billingAccountNumber;
	}

	public void setBillingAccountNumber(final String billingAccountNumber)
	{
		this.billingAccountNumber = billingAccountNumber;
	}

	public String getBillingACHCompanyId()
	{
		return billingACHCompanyId;
	}

	public void setBillingACHCompanyId(final String billingACHCompanyId)
	{
		this.billingACHCompanyId = billingACHCompanyId;
	}

	public String getBillingACHCompanyName()
	{
		return billingACHCompanyName;
	}

	public void setBillingACHCompanyName(final String billingACHCompanyName)
	{
		this.billingACHCompanyName = billingACHCompanyName;
	}

	public String getBillingReportId()
	{
		return billingReportId;
	}

	public void setBillingReportId(final String billingReportId)
	{
		this.billingReportId = billingReportId;
	}

	public String getBillingReportType()
	{
		return billingReportType;
	}

	public void setBillingReportType(final String billingReportType)
	{
		this.billingReportType = billingReportType;
	}

	public String getPriority()
	{
		return priority;
	}

	public void setPriority(final String priority)
	{
		this.priority = priority;
	}

	public String getTenentId()
	{
		return tenentId;
	}

	public void setTenentId(final String tenentId)
	{
		this.tenentId = tenentId;
	}

}
