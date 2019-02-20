package io.swagger.model;

/**
 * Created by cbridges on 12/7/15.
 */
public abstract class PhoneAlertRequestItem extends AlertRequestItem
{

	private String phoneNumber;
	private String phoneNumberPrefix;
	private String phoneNumberExtension;
	private String phoneNumberPauseIndicator;
	private String messageBody;

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getMessageBody()
	{
		return messageBody;
	}

	public void setMessageBody(final String messageBody)
	{
		this.messageBody = messageBody;
	}

	public String getPhoneNumberPrefix()
	{
		return phoneNumberPrefix;
	}

	public void setPhoneNumberPrefix(final String phoneNumberPrefix)
	{
		this.phoneNumberPrefix = phoneNumberPrefix;
	}

	public String getPhoneNumberExtension()
	{
		return phoneNumberExtension;
	}

	public void setPhoneNumberExtension(final String phoneNumberExtension)
	{
		this.phoneNumberExtension = phoneNumberExtension;
	}

	public String getPhoneNumberPauseIndicator()
	{
		return phoneNumberPauseIndicator;
	}

	public void setPhoneNumberPauseIndicator(final String phoneNumberPauseIndicator)
	{
		this.phoneNumberPauseIndicator = phoneNumberPauseIndicator;
	}
}
