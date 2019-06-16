package com.ssafyns.vo;

public class NoticeComment {
	private int ncomment_no;
	private int ncomment_user_uid;
	private int ncomment_notice_no;
	private String ncomment_content;
	private String ncomment_date;

	public NoticeComment() {
		super();
	}

	public NoticeComment(int ncomment_no, int ncomment_user_uid, int ncomment_notice_no, String ncomment_content,
			String ncomment_date) {
		super();
		this.ncomment_no = ncomment_no;
		this.ncomment_user_uid = ncomment_user_uid;
		this.ncomment_notice_no = ncomment_notice_no;
		this.ncomment_content = ncomment_content;
		this.ncomment_date = ncomment_date;
	}

	public int getNcomment_no() {
		return ncomment_no;
	}

	public void setNcomment_no(int ncomment_no) {
		this.ncomment_no = ncomment_no;
	}

	public int getNcomment_user_uid() {
		return ncomment_user_uid;
	}

	public void setNcomment_user_uid(int ncomment_user_uid) {
		this.ncomment_user_uid = ncomment_user_uid;
	}

	public int getNcomment_notice_no() {
		return ncomment_notice_no;
	}

	public void setNcomment_notice_no(int ncomment_notice_no) {
		this.ncomment_notice_no = ncomment_notice_no;
	}

	public String getNcomment_content() {
		return ncomment_content;
	}

	public void setNcomment_content(String ncomment_content) {
		this.ncomment_content = ncomment_content;
	}

	public String getNcomment_date() {
		return ncomment_date;
	}

	public void setNcomment_date(String ncomment_date) {
		this.ncomment_date = ncomment_date;
	}

	@Override
	public String toString() {
		return "NoticeComment [ncomment_no=" + ncomment_no + ", ncomment_user_uid=" + ncomment_user_uid
				+ ", ncomment_notice_no=" + ncomment_notice_no + ", ncomment_content=" + ncomment_content
				+ ", ncomment_date=" + ncomment_date + "]";
	}

}
