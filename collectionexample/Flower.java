package com.capgemini.collectionexample;

public class Flower {
private int fid;
private String fname;
private float priceperkg;
private int qty;
public Flower() {
	super();
}

public Flower(int fid, String fname, float priceperkg, int qty) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.priceperkg = priceperkg;
	this.qty = qty;
}

public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public float getPriceperkg() {
	return priceperkg;
}
public void setPriceperkg(float priceperkg) {
	this.priceperkg = priceperkg;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}


}
