package com.cg.DemoFour.ui;



public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp=new Employee();
       com.cg.DemoTwo.dao.Product prod=new com.cg.DemoTwo.dao.Product();
       prod.setProductId1(4000);
       com.cg.DemoTwo.service.Product prod1=new com.cg.DemoTwo.service.Product();
       prod1.setProductId(5000);
       emp.setEmpId(100);
       emp.setEmpName("veens");
       emp.setEmpSal(10000.00);
       
       System.out.println(" "+emp.getEmpId()+"  "+emp.getEmpName()+" "+emp.getEmpSal()+" "+prod.getProductId1()+" "+prod1.getProductId());
	}

}
