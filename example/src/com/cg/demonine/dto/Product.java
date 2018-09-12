package com.cg.demonine.dto;

public class Product implements Comparable<Product>{
private int prodid;
private String prodName;
private double prodPrice;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
}
@Override
public int compareTo(Product o) {
	if(this.getProdid()>o.getProdid())
		return +1;
	if(this.getProdid()<o.getProdid())
		return -1;
	else	
	return 0;
}
}
