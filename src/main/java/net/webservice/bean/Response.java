package net.webservice.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class Response {

	private Integer respId;
	private String respType;
	private String respContent;
	private Integer respCode;
	public Integer getRespId() {
		return respId;
	}
	public void setRespId(Integer respId) {
		this.respId = respId;
	}
	public String getRespType() {
		return respType;
	}
	public void setRespType(String respType) {
		this.respType = respType;
	}
	public String getRespContent() {
		return respContent;
	}
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}
	public Integer getRespCode() {
		return respCode;
	}
	public void setRespCode(Integer respCode) {
		this.respCode = respCode;
	}
	@Override
	public String toString() {
		return "Response [respId=" + respId + ", respType=" + respType + ", respContent=" + respContent + ", respCode="
				+ respCode + "]";
	}
	
	
}
