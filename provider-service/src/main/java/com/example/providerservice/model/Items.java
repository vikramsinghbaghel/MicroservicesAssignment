package com.example.providerservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int itemId;
	private String itemType;
	private String itemName;
	private String description;
	private String address;
	private String contactDetails;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Items(int itemId, String itemType, String itemName, String description, String address,
			String contactDetails) {
		super();
		this.itemId = itemId;
		this.itemType = itemType;
		this.itemName = itemName;
		this.description = description;
		this.address = address;
		this.contactDetails = contactDetails;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemType=" + itemType + ", itemName=" + itemName + ", description="
				+ description + ", address=" + address + ", contactDetails=" + contactDetails + "]";
	}
	
	
	
	
	

}
