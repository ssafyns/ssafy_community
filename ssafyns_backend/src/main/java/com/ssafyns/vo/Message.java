package com.ssafyns.vo;

public class Message {

	private int message_no;
	private int message_suid;
	private int message_ruid;
	private String message_title;
	private String message_content;
	private String message_date;
	private int message_isread;
	private int message_rdel;
	private int message_sdel;

	public Message() {
	}

	public Message(int message_suid, int message_ruid, String message_title, String message_content,
			String message_date, int message_isread, int message_rdel, int message_sdel) {
		super();
		this.message_suid = message_suid;
		this.message_ruid = message_ruid;
		this.message_title = message_title;
		this.message_content = message_content;
		this.message_date = message_date;
		this.message_isread = message_isread;
		this.message_rdel = message_rdel;
		this.message_sdel = message_sdel;
	}

	public int getMessage_no() {
		return message_no;
	}

	public void setMessage_no(int message_no) {
		this.message_no = message_no;
	}

	public int getMessage_suid() {
		return message_suid;
	}

	public void setMessage_suid(int message_suid) {
		this.message_suid = message_suid;
	}

	public int getMessage_ruid() {
		return message_ruid;
	}

	public void setMessage_ruid(int message_ruid) {
		this.message_ruid = message_ruid;
	}

	public String getMessage_title() {
		return message_title;
	}

	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getMessage_date() {
		return message_date;
	}

	public void setMessage_date(String message_date) {
		this.message_date = message_date;
	}

	public int getMessage_isread() {
		return message_isread;
	}

	public void setMessage_isread(int message_isread) {
		this.message_isread = message_isread;
	}

	public int getMessage_rdel() {
		return message_rdel;
	}

	public void setMessage_rdel(int message_rdel) {
		this.message_rdel = message_rdel;
	}

	public int getMessage_sdel() {
		return message_sdel;
	}

	public void setMessage_sdel(int message_sdel) {
		this.message_sdel = message_sdel;
	}

	@Override
	public String toString() {
		return "Message [message_no=" + message_no + ", message_suid=" + message_suid + ", message_ruid=" + message_ruid
				+ ", message_title=" + message_title + ", message_content=" + message_content + ", message_date="
				+ message_date + ", message_isread=" + message_isread + ", message_rdel=" + message_rdel
				+ ", message_sdel=" + message_sdel + "]";
	}

}
