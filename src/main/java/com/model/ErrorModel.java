package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Error")
public class ErrorModel {

	public ErrorModel(String errCode, String errMessage) {
		super();
		this.errCode = errCode;
		this.errMessage = errMessage;
	}

	private String errCode;
	
	private String errMessage;

	@XmlElement
	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	@XmlElement
	public String getErrMessage() {
		return errMessage;
	}

	public ErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
}
