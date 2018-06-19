package com.dc.rest.model;

import java.util.Date;

public class CustomerDnr {
   private Integer dnrId;
   private Integer customerId;
   private String  roomNbr;
   private Date    markingDate;
   private String  dnrInfo;
   private String  userId;
   private boolean dnrFlag;
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public boolean isDnrFlag() {
	return dnrFlag;
}
public void setDnrFlag(boolean dnrFlag) {
	this.dnrFlag = dnrFlag;
}
public Integer getDnrId() {
	return dnrId;
}
public void setDnrId(Integer dnrId) {
	this.dnrId = dnrId;
}
public String getDnrInfo() {
	return dnrInfo;
}
public void setDnrInfo(String dnrInfo) {
	this.dnrInfo = dnrInfo;
}
public Date getMarkingDate() {
	return markingDate;
}
public void setMarkingDate(Date markingDate) {
	this.markingDate = markingDate;
}
public String getRoomNbr() {
	return roomNbr;
}
public void setRoomNbr(String roomNbr) {
	this.roomNbr = roomNbr;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
   
}
