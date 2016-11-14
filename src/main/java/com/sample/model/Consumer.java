package com.sample.model;

import java.io.Serializable;
import java.util.Date;

public class Consumer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 658760036889095089L;

	private int id;
	
	private String memberId;
	
	private String memberName;
	
	private String memberIp;

//	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date date =  new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getMemberIp() {
		return memberIp;
	}
	public void setMemberIp(String memberIp) {
		this.memberIp = memberIp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Consumer(int id, String memberId, String memberName, String memberIp) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberIp = memberIp;
	}
	public Consumer() {
		super();
	}
	
	

}
