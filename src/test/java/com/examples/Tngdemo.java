package com.examples;

import org.testng.annotations.Test;

public class Tngdemo {

	@Test(priority = 2)
	public void t1(){
		System.out.println("From T1");
	}	
	@Test(priority = 1)
	public void t2(){
		System.out.println("From T2");
	}
	public void t3(){
	System.out.println("From T3");
	}

}
