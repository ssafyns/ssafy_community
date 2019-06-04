package com.ssafyns.vo;

public class FreeBoard {

	private int freeboard_no;
	private int freeboard_user_uid;
	private String freeboard_title;
	private String freeboard_content;
	private String freeboard_date;
	private int freeboard_hits;
	private int freeboard_likes;
	private int freeboard_hates;

	public FreeBoard() {
	}

	public FreeBoard(int freeboard_user_uid, String freeboard_title, String freeboard_content, String freeboard_date,
			int freeboard_hits, int freeboard_likes, int freeboard_hates) {
		super();
		this.freeboard_user_uid = freeboard_user_uid;
		this.freeboard_title = freeboard_title;
		this.freeboard_content = freeboard_content;
		this.freeboard_date = freeboard_date;
		this.freeboard_hits = freeboard_hits;
		this.freeboard_likes = freeboard_likes;
		this.freeboard_hates = freeboard_hates;
	}

	public int getFreeboard_no() {
		return freeboard_no;
	}

	public void setFreeboard_no(int freeboard_no) {
		this.freeboard_no = freeboard_no;
	}

	public int getFreeboard_user_uid() {
		return freeboard_user_uid;
	}

	public void setFreeboard_user_uid(int freeboard_user_uid) {
		this.freeboard_user_uid = freeboard_user_uid;
	}

	public String getFreeboard_title() {
		return freeboard_title;
	}

	public void setFreeboard_title(String freeboard_title) {
		this.freeboard_title = freeboard_title;
	}

	public String getFreeboard_content() {
		return freeboard_content;
	}

	public void setFreeboard_content(String freeboard_content) {
		this.freeboard_content = freeboard_content;
	}

	public String getFreeboard_date() {
		return freeboard_date;
	}

	public void setFreeboard_date(String freeboard_date) {
		this.freeboard_date = freeboard_date;
	}

	public int getFreeboard_hits() {
		return freeboard_hits;
	}

	public void setFreeboard_hits(int freeboard_hits) {
		this.freeboard_hits = freeboard_hits;
	}

	public int getFreeboard_likes() {
		return freeboard_likes;
	}

	public void setFreeboard_likes(int freeboard_likes) {
		this.freeboard_likes = freeboard_likes;
	}

	public int getFreeboard_hates() {
		return freeboard_hates;
	}

	public void setFreeboard_hates(int freeboard_hates) {
		this.freeboard_hates = freeboard_hates;
	}

	@Override
	public String toString() {
		return "FreeBoard [freeboard_user_uid=" + freeboard_user_uid + ", freeboard_title=" + freeboard_title
				+ ", freeboard_content=" + freeboard_content + ", freeboard_date=" + freeboard_date
				+ ", freeboard_hits=" + freeboard_hits + ", freeboard_likes=" + freeboard_likes + ", freeboard_hates="
				+ freeboard_hates + "]";
	}

}
