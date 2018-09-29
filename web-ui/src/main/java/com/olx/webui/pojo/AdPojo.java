package com.olx.webui.pojo;

import java.util.Arrays;

public class AdPojo {
	
	private String title;
	private String category;
	private String description;
	private String name;
	private String phno;
	private String city;
	private byte[] photo;
	public AdPojo(String title, String category, String description,
			String name, String phno, String city, byte[] photo) {
		super();
		this.title = title;
		this.category = category;
		this.description = description;
		this.name = name;
		this.phno = phno;
		this.city = city;
		this.photo = photo;
	}
	public AdPojo() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] data) {
		this.photo = data;
	}
	@Override
	public String toString() {
		return "AdPojo [title=" + title + ", category=" + category
				+ ", description=" + description + ", name=" + name + ", phno="
				+ phno + ", city=" + city + ", data=" + Arrays.toString(photo)
				+ "]";
	}
}
