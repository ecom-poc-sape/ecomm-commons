package com.sapient.ecomm_commons.domain;

public class Payment {

	private String customerId;
	private String orderId;
	private PaymentDetails details;
	private PaymentStatus status;

	public Payment() {
		super();
	}

	public Payment(String orderId, String customerId, PaymentStatus status) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.status = status;
	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public PaymentDetails getDetails() {
		return details;
	}

	public void setDetails(PaymentDetails details) {
		this.details = details;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Payment [customerId=" + customerId + ", orderId=" + orderId + ", details=" + details
				+ ", status=" + status + "]";
	}

}
