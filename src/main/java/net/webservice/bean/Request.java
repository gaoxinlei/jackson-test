package net.webservice.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="request")
public class Request {
	private String from;
	private String want;
	private Integer reqId;
	private String reqContent;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getWant() {
		return want;
	}
	public void setWant(String want) {
		this.want = want;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getReqContent() {
		return reqContent;
	}
	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}
	@Override
	public String toString() {
		return "Request [from=" + from + ", want=" + want + ", reqId=" + reqId + ", reqContent=" + reqContent + "]";
	}
	

}
