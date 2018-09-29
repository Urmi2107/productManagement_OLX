package com.olx.productManagement.pojo;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "users")
public class ProductPojo {
	    @Id
	    private String productId;
	    private String title;
	    private String category;
	    private String description;
	    private byte[] photo;
	    private String name;
	    private String phoneNo;
	    private String city;
		public ProductPojo() {
			super();
		}
		public ProductPojo(String productId, String title, String category,
				String description, byte[] photo, String name, String phoneNo,
				String city) {
			super();
			this.productId = productId;
			this.title = title;
			this.category = category;
			this.description = description;
			this.photo = photo;
			this.name = name;
			this.phoneNo = phoneNo;
			this.city = city;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
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
		public byte[] getPhoto() {
			return photo;
		}
		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "ProductPojo [productId=" + productId + ", title=" + title
					+ ", category=" + category + ", description=" + description
					+ ", photo=" + Arrays.toString(photo) + ", name=" + name
					+ ", phoneNo=" + phoneNo + ", city=" + city + "]";
		}
	    
		
	    

}
