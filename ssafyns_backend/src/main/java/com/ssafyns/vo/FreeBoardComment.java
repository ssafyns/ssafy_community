package com.ssafyns.vo;

public class FreeBoardComment {
	private int fbcomment_no;
	private String fbcomment_user_uid;
	private String fbcomment_freeboard_no;
	private String fbcomment_content;
	private String fbcomment_date;
	private String fbcomment_likes;
	private String fbcomment_hates;
	
	public FreeBoardComment() {
	}

	public FreeBoardComment(String fbcomment_user_uid, String fbcomment_freeboard_no, String fbcomment_content,
			String fbcomment_date, String fbcomment_likes, String fbcomment_hates) {
		super();
		this.fbcomment_user_uid = fbcomment_user_uid;
		this.fbcomment_freeboard_no = fbcomment_freeboard_no;
		this.fbcomment_content = fbcomment_content;
		this.fbcomment_date = fbcomment_date;
		this.fbcomment_likes = fbcomment_likes;
		this.fbcomment_hates = fbcomment_hates;
	}

	public int getFbcomment_no() {
		return fbcomment_no;
	}

	public void setFbcomment_no(int fbcomment_no) {
		this.fbcomment_no = fbcomment_no;
	}

	public String getFbcomment_user_uid() {
		return fbcomment_user_uid;
	}

	public void setFbcomment_user_uid(String fbcomment_user_uid) {
		this.fbcomment_user_uid = fbcomment_user_uid;
	}

	public String getFbcomment_freeboard_no() {
		return fbcomment_freeboard_no;
	}

	public void setFbcomment_freeboard_no(String fbcomment_freeboard_no) {
		this.fbcomment_freeboard_no = fbcomment_freeboard_no;
	}

	public String getFbcomment_content() {
		return fbcomment_content;
	}

	public void setFbcomment_content(String fbcomment_content) {
		this.fbcomment_content = fbcomment_content;
	}

	public String getFbcomment_date() {
		return fbcomment_date;
	}

	public void setFbcomment_date(String fbcomment_date) {
		this.fbcomment_date = fbcomment_date;
	}

	public String getFbcomment_likes() {
		return fbcomment_likes;
	}

	public void setFbcomment_likes(String fbcomment_likes) {
		this.fbcomment_likes = fbcomment_likes;
	}

	public String getFbcomment_hates() {
		return fbcomment_hates;
	}

	public void setFbcomment_hates(String fbcomment_hates) {
		this.fbcomment_hates = fbcomment_hates;
	}

	@Override
	public String toString() {
		return "FreeBoardComment [fbcomment_no=" + fbcomment_no + ", fbcomment_user_uid=" + fbcomment_user_uid
				+ ", fbcomment_freeboard_no=" + fbcomment_freeboard_no + ", fbcomment_content=" + fbcomment_content
				+ ", fbcomment_date=" + fbcomment_date + ", fbcomment_likes=" + fbcomment_likes + ", fbcomment_hates="
				+ fbcomment_hates + "]";
	}
	
}
