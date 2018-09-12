package com.cg.libraryproject.dto;

public class MemberDetails {
	
	private String memberId;
	private String memberName;
	private Double amount;
	
	public MemberDetails() {
		
	}
	public MemberDetails(String memberId, String memberName, Double amount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.amount = amount;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "MemberDetails [memberId=" + memberId + ", memberName=" + memberName + ", amount=" + amount + "]";
	}
	
	

}
