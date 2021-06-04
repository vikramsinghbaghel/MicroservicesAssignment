package com.nagarro.helpapp.demoentity;


public class RequestedItems {
	private int requestedItemId;
	private String requestedItemType;
	private String requestedItemName;
	private String description;
	private String receiverAddress;
	private String receiverContactDetails;

	public RequestedItems() {
	
	}

	public RequestedItems(int requestedItemId, String requestedItemType, String requestedItemName, String description,
			String receiverAddress, String receiverContactDetails) {
		super();
		this.requestedItemId = requestedItemId;
		this.requestedItemType = requestedItemType;
		this.requestedItemName = requestedItemName;
		this.description = description;
		this.receiverAddress = receiverAddress;
		this.receiverContactDetails = receiverContactDetails;
	}

	public int getRequestedItemId() {
		return requestedItemId;
	}

	public void setRequestedItemId(int requestedItemId) {
		this.requestedItemId = requestedItemId;
	}

	public String getRequestedItemType() {
		return requestedItemType;
	}

	public void setRequestedItemType(String requestedItemType) {
		this.requestedItemType = requestedItemType;
	}

	public String getRequestedItemName() {
		return requestedItemName;
	}

	public void setRequestedItemName(String requestedItemName) {
		this.requestedItemName = requestedItemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverContactDetails() {
		return receiverContactDetails;
	}

	public void setReceiverContactDetails(String receiverContactDetails) {
		this.receiverContactDetails = receiverContactDetails;
	}

	@Override
	public String toString() {
		return "RequestedItems [requestedItemId=" + requestedItemId + ", requestedItemType=" + requestedItemType
				+ ", requestedItemName=" + requestedItemName + ", description=" + description + ", receiverAddress="
				+ receiverAddress + ", receiverContactDetails=" + receiverContactDetails + "]";
	}

}
