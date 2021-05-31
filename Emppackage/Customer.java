package Emppackage;

import java.sql.Date;

public class Customer {
 private int custId;
 private String custName;
 private int age;
private String emailId;
 private String mobileNo;
 public Customer() {
	super();
}

public Customer(int custId, String custName, int age, String emailId, String mobileNo) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.age = age;
	this.emailId = emailId;
	this.mobileNo = mobileNo;
}

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}


 
 
}
