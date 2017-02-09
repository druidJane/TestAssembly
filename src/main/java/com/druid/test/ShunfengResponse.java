package com.druid.test;


import org.xmlbean.annotation.ElementTag;

public class ShunfengResponse {
	@ElementTag(attribute=true)
	private String orderid;
	@ElementTag(attribute=true)
	private String mailno;
	@ElementTag(attribute=true)
	private String filter_result;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getMailno() {
		return mailno;
	}
	public void setMailno(String mailno) {
		this.mailno = mailno;
	}
	public String getFilter_result() {
		return filter_result;
	}
	public void setFilter_result(String filter_result) {
		this.filter_result = filter_result;
	}
	
}
