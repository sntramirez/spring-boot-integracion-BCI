package com.integracion.crud.dto;

import java.io.Serializable;

public class TelefonoRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String number;
	private String citycode;
	private String contrycode;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getContrycode() {
		return contrycode;
	}

	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}

}
