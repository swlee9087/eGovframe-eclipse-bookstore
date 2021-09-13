package shop.cofin.oracle.publishers.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDTO {
	private int pubId;
	private String pubName;
	private String mgrName;
	private String phone;
	
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("출판사ID: %d, 출판사명: %s, 매니저: %s, 연락처: %s", pubId, pubName, mgrName, phone);
	}
	
	
}
