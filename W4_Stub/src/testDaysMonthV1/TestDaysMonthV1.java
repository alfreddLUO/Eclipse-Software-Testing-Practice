package testDaysMonthV1;

import static org.junit.Assert.*;
import org.junit.Test;

import daysmonthV1.*;

public class TestDaysMonthV1 {

	// Add your answer to the four test cases for Q1
	@Test
	public void testQ1_1() {
		LeapYearV1 leapYear=new LeapYearV1();
		DaysNuminMonthV1 dm=new DaysNuminMonthV1(leapYear);
		int res=dm.getDaysNuminMonth(9, 2022);
		assertEquals(res,30);
				

	}

	@Test
	public void testQ1_2() {

	}

	@Test
	public void testQ1_3() {

	}

	@Test
	public void testQ1_4() {

	}

	// Add your answer to the two test cases for Q2
	@Test
	public void testQ2_1() {

	}

	@Test
	public void testQ2_2() {

	}

	// Add your answer to the two test cases for Q3
	@Test
	public void testQ3_1() {

	}

	@Test
	public void testQ3_2() {

	}
}