package com.ssafyns.vo;

import java.util.Date;

public class User {

	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_nickname;
	private String user_phone;
	private String user_email;
	private Date user_birth;
	private String user_gender;
	private String user_address;
	private String user_school;
	private String user_edu_city;
	private int user_th;
	private String user_rank;
	private int user_point;
	private String user_photo;
	private int user_isleave;

	public User() {
		super();
	}

	public User(String user_id, String user_pw, String user_name, String user_nickname, String user_phone,
			String user_email, Date user_birth, String user_gender, String user_address, String user_school,
			String user_edu_city, int user_th, String user_rank, int user_point, String user_photo, int user_isleave) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_nickname = user_nickname;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_birth = user_birth;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.user_school = user_school;
		this.user_edu_city = user_edu_city;
		this.user_th = user_th;
		this.user_rank = user_rank;
		this.user_point = user_point;
		this.user_photo = user_photo;
		this.user_isleave = user_isleave;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}

	public String getGender() {
		return user_gender;
	}

	public void setGender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_school() {
		return user_school;
	}

	public void setUser_school(String user_school) {
		this.user_school = user_school;
	}

	public String getUser_edu_city() {
		return user_edu_city;
	}

	public void setUser_edu_city(String user_edu_city) {
		this.user_edu_city = user_edu_city;
	}

	public int getUser_th() {
		return user_th;
	}

	public void setUser_th(int user_th) {
		this.user_th = user_th;
	}

	public String getUser_rank() {
		return user_rank;
	}

	public void setUser_rank(String user_rank) {
		this.user_rank = user_rank;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public String getUser_photo() {
		return user_photo;
	}

	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}

	public int getUser_isleave() {
		return user_isleave;
	}

	public void setUser_isleave(int user_isleave) {
		this.user_isleave = user_isleave;
	}

}
