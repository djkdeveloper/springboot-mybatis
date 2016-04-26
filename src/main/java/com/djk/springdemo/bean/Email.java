package com.djk.springdemo.bean;

public class Email {
	
	private String sendmail;

	private String sendName;

	
	public String getSendmail() {
		return sendmail;
	}


	public void setSendmail(String sendmail) {
		this.sendmail = sendmail;
	}


	public String getSendName() {
		return sendName;
	}


	public void setSendName(String sendName) {
		this.sendName = sendName;
	}


	@Override
	public String toString() {
		return "Email [sendmail=" + sendmail + ", sendName=" + sendName + "]";
	}
	
	
}
