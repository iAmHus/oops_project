package com.assignment_13;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
@RunWith(Theories.class)
public class sampleTheories {
@DataPoints
public static int[][] values = {{1,2}};
@Theory
public void checkAddAnswers(int[] a)
{
	assertEquals(a[0] + a[1], new calculator().add(a[0], a[1]));
}
@Theory
public void checkMultiplyAnswers(int[] a)
{
	assertEquals(a[0] * a[1], new calculator().multiply(a[0], a[1]));
}	
@Theory
public void checkSubstractAnswers(int[] a)
{
	assertEquals(a[1] - a[0], new calculator().substract(a[0], a[1]));
}	
@Theory
public void checkDivideAnswers(int[] a)
{
	assertEquals(a[0] / a[1], new calculator().divide(a[0], a[1]));
}	
}
