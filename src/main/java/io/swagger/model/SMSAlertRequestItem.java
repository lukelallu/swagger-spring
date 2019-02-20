package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Created by cbridges on 12/12/15.
 */
@JsonTypeName("sms")
public class SMSAlertRequestItem extends PhoneAlertRequestItem
{

	private String shortCode;

	public String getShortCode()
	{
		return shortCode;
	}

	public void setShortCode(String shortCode)
	{
		this.shortCode = shortCode;
	}

}
