package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@Test
	private void amazon() {
		System.out.println("Amazon");
	}
	
	@BeforeMethod
	private void signin() {
		System.out.println("Signing in");
		
	}
	
	@AfterMethod
	private void signout() {
		System.out.println("Sign out");
		
	}
	
	@Test
	private void dresses() {
		System.out.println("Choose dresses");
		
	}
	
	@Test
	private void shirts() {
		System.out.println("Choose Shirts");
		
	}
	
	@AfterClass
	private void homePage() {
		System.out.println("Homepage");
		
		}
	
	@AfterTest
	private void close() {
		System.out.println("Close");
		
			}
}
