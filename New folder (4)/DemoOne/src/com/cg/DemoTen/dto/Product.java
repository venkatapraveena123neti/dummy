package com.cg.DemoTen.dto;

public class Product implements Comparable<Product>{
  public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodprice=" + prodprice + "]";
	}
	public Product(int prodid, String prodname, double prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
private int prodid;
  private String prodname;
  private double prodprice;
  public Product()
  {
	  
  }
@Override
public int compareTo(Product o) {
	// TODO Auto-generated method stub
	return 0;
}
}
