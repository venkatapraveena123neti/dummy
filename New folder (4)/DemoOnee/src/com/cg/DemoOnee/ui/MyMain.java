package com.cg.DemoOnee.ui;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Calculator calc=new Calculator();
          int  inputone=Integer.parseInt(args[0]);
           int  inputtwo=Integer.parseInt(args[1]);
           System.out.println("added value:   "+calc.addition(inputone, inputtwo)+"sub value:   "+calc.subtraction(inputone, inputtwo)+"mul value   "+calc.multiplication(inputone, inputtwo)+"divided value:   "+calc.division(inputone, inputtwo));
            
         
	}

}
