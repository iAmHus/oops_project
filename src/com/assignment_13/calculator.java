package com.assignment_13;
/*
 * 6.Convert an existing JUnit test set to JUnit Theories. If you wish to construct JUnit from scratch for this, that's fine too.
 * 
 * We have implemented a simple calculator class which has basic operations as its functions
 * and also defined several junit test cases to validate the output.
 * We have also implemented one Junit Theory test case which will replace many small individual Junit test cases
 * This implementation is found to be very efficient as we are cutting down a lot number of Junit test cases to one Junit Theory
 * 
 * Contributions
 * 
 * Shubham Pudi(G01087664) - Written Junit Theory to replace invidual Junit test cases
 * Murtuza Hussain(G01024452) - Written individual 8 Junit test cases 
 * Harisha Swaminathan(G01085509) - Written the main Calculator class which will be the base of test cases
 * 
 * 
 */
public class calculator {

	private int a;
	private int b;
	
	public int add(int x, int y)
	{
		this.a =x;
		this.b=y;
		return a+b;
	}
	public int multiply(int x, int y)
	{
		this.a = x;
		this.b = y;
		return a*b;
	}
	public int substract(int x, int y)
	{
		this.a=x;
		this.b=y;
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	public int divide(int x, int y)
	{
		this.a=x;
		this.b=y;
		return a/b;
	}
}
