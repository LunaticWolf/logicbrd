package bRD1;
import java.io.Serializable;

public class Customer implements Serializable
{
String code,name,address1,address2,pincode,
eMail,contactnumber,primaryContactPerson,recordStatus,
flag,createDate,createdBy,modifiedDate,modifiedBy,authorisedDate,
authorisedBy;

String status;
public Customer() {
	
	
}

public Customer(String code, String name, String address1, String address2,
		String pincode, String eMail, String contactnumber,
		String primaryContactPerson, String recordStatus, String flag,
		String createDate, String createdBy, String modifiedDate,
		String modifiedBy, String authorisedDate, String authorisedBy) {
	this();
	this.code = code;
	this.name = name;
	this.address1 = address1;
	this.address2 = address2;
	this.pincode = pincode;
	this.eMail = eMail;
	this.contactnumber = contactnumber;
	this.primaryContactPerson = primaryContactPerson;
	this.recordStatus = recordStatus;
	this.flag = flag;
	this.createDate = createDate;
	this.createdBy = createdBy;
	this.modifiedDate = modifiedDate;
	this.modifiedBy = modifiedBy;
	this.authorisedDate = authorisedDate;
	this.authorisedBy = authorisedBy;
}


public Customer(String code, String name, String address1, String address2,
		String pincode, String eMail, String contactnumber,
		String primaryContactPerson, String recordStatus, String flag,
		String createDate, String createdBy, String modifiedDate,
		String modifiedBy, String authorisedDate, String authorisedBy, String valid) {
	this();
	this.code = code;
	this.name = name;
	this.address1 = address1;
	this.address2 = address2;
	this.pincode = pincode;
	this.eMail = eMail;
	this.contactnumber = contactnumber;
	this.primaryContactPerson = primaryContactPerson;
	this.recordStatus = recordStatus;
	this.flag = flag;
	this.createDate = createDate;
	this.createdBy = createdBy;
	this.modifiedDate = modifiedDate;
	this.modifiedBy = modifiedBy;
	this.authorisedDate = authorisedDate;
	this.authorisedBy = authorisedBy;
	this.status=valid;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
public String getPrimaryContactPerson() {
	return primaryContactPerson;
}
public void setPrimaryContactPerson(String primaryContactPerson) {
	this.primaryContactPerson = primaryContactPerson;
}
public String getRecordStatus() {
	return recordStatus;
}
public void setRecordStatus(String recordStatus) {
	this.recordStatus = recordStatus;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public String getCreateDate() {
	return createDate;
}
public void setCreateDate(String createDate) {
	this.createDate = createDate;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(String modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public String getAuthorisedDate() {
	return authorisedDate;
}
public void setAuthorisedDate(String authorisedDate) {
	this.authorisedDate = authorisedDate;
}
public String getAuthorisedBy() {
	return authorisedBy;
}
public void setAuthorisedBy(String authorisedBy) {
	this.authorisedBy = authorisedBy;
}



@Override
public String toString() {
	return "Customer [code=" + code + ", name=" + name + ", address1="
			+ address1 + ", address2=" + address2 + ", pincode=" + pincode
			+ ", eMail=" + eMail + ", contactnumber=" + contactnumber
			+ ", primaryContactPerson=" + primaryContactPerson
			+ ", recordStatus=" + recordStatus + ", flag=" + flag
			+ ", createDate=" + createDate + ", createdBy=" + createdBy
			+ ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy
			+ ", authorisedDate=" + authorisedDate + ", authorisedBy="
			+ authorisedBy + "]"+ ", status=" + status + "\r\n";
}



}

