package com.gyojincompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCalculator myCal = new MyCalculator();
//		
//		myCal.setNum1(20);
//		myCal.setNum2(10);		
//		
//		myCal.setCal(new Calculator());
//		
//		myCal.add();
//		myCal.sub();
//		myCal.mul();
//		myCal.div();	
		
		String config = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		MyCalculator cal1 = ctx.getBean("myCal2", MyCalculator.class);
		
		cal1.add();
		cal1.div();
		cal1.sub();
		cal1.mul();
		
		ctx.close();
		
		
	}

}
