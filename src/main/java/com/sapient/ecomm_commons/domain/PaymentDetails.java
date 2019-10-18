package com.sapient.ecomm_commons.domain;

public class PaymentDetails {

	private PaymentMode mode;
	private Long number;

	public PaymentMode getMode() {
		return mode;
	}

	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PaymentDetails [mode=" + mode + ", number=" + number + "]";
	}

}
