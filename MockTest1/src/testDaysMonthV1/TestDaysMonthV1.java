package testDaysMonthV1;

import static org.junit.Assert.*;
import org.junit.Test;

import daysmonthV1.*;

public class TestDaysMonthV1 {
	
	private DaysNuminMonthV1 daysNuminMonthV1;

	// Add your answer to the four test cases for Q1
	@Test
	public void testQ1_1() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(7, 2022);
		assertEquals(result,31);

	}

	@Test
	public void testQ1_2() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(8, 2021);
		assertEquals(result,31);
	}

	@Test
	public void testQ1_3() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(6, 2019);
		assertEquals(result,30);
	}

	@Test
	public void testQ1_4() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(9, 2019);
		assertEquals(result,30);
	}

	// Add your answer to the two test cases for Q2
	@Test
	public void testQ2_1() {
		class StubLeapYear extends LeapYearV1{
			public boolean isLeapYear(int year) {
				if((year%4==0&&year%100!=0)||year%400==0) {
					return true;
				}
				return false;
			}
		}
		StubLeapYear leapYear=new StubLeapYear();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(2, 2020);
		assertEquals(result,29);
		
	}

	@Test
	public void testQ2_2() {
		class StubLeapYear extends LeapYearV1{
			public boolean isLeapYear(int year) {
				if((year%4==0&&year%100!=0)||year%400==0) {
					return true;
				}
				return false;
			}
		}
		StubLeapYear leapYear=new StubLeapYear();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(2, 2000);
		assertEquals(result,29);
	}

	// Add your answer to the two test cases for Q3
	@Test
	public void testQ3_1() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(2, 1900);
		assertEquals(result,28);

	}

	@Test
	public void testQ3_2() {
		LeapYearV1 leapYear=new LeapYearV1();
		daysNuminMonthV1=new DaysNuminMonthV1(leapYear);
		int result=daysNuminMonthV1.getDaysNuminMonth(2, 2000);
		assertEquals(result,29);
	}
}
