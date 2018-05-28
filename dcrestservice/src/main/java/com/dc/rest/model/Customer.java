/**
 * 
 */
package com.dc.rest.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author admin
 *
 */
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;

	Integer id;
    String firstName;
    String lastName;
    String company;
    String addr1;
    String addr2;
    String city;
    String state;
    String zip;
    String country;
    String email;
    Date createDt;
    String createdByUser;
    String idNumber;
    String idType;
    String note;
    String swipeData;
    Integer dnr = 0;
    String fax;
    String phone;
    String imageFileLoc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSwipeData() {
		return swipeData;
	}
	public void setSwipeData(String swipeData) {
		this.swipeData = swipeData;
	}
	public Integer getDnr() {
		return dnr;
	}
	public void setDnr(Integer dnr) {
		this.dnr = dnr;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageFileLoc() {
		return imageFileLoc;
	}
	public void setImageFileLoc(String imageFileLoc) {
		this.imageFileLoc = imageFileLoc;
	}   
    
    
}
