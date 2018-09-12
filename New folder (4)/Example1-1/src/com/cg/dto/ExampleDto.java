package com.cg.dto;

import java.time.LocalDate;

public class ExampleDto {

	private String pname;
	private int page;
	private double pweight;
	private char pgender;
	private String pdisease;
	private String doct = "not assigned";
	private LocalDate doc ;
    private int pid ;
    
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getPweight() {
		return pweight;
	}

	public void setPweight(double pweight) {
		this.pweight = pweight;
	}

	public char getPgender() {
		return pgender;
	}

	public void setPgender(char pgender) {
		this.pgender = pgender;
	}

	public String getPdisease() {
		return pdisease;
	}

	public void setPdisease(String pdisease) {
		this.pdisease = pdisease;
	}

	

	

	public LocalDate getDoc() {
		return doc;
	}

	public void setDoc(LocalDate string) {
		this.doc = string;
	}

	

	public String getDoct() {
		return doct;
	}

	public void setDoct(String doct) {
		this.doct = doct;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "ExampleDto [pname=" + pname + ", page=" + page + ", pweight=" + pweight + ", pgender=" + pgender
				+ ", pdisease=" + pdisease + ", doct=" + doct + ", doc=" + doc + ", pid=" + pid + "]";
	}

}
