package br.com.codenation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatisticUtilTest {

	@Test
	public void testAverage() {
		assertEquals(3, StatisticUtil.average(new int[] {1,2,3,4,5}));
	}

	@Test
	public void testAverage1Element() {
		assertEquals(10, StatisticUtil.average(new int[] {10}));
	}

	@Test
	public void testAverage2Elements() {
		assertEquals(10, StatisticUtil.average(new int[] {10, 10}));
	}

	@Test
	public void testAverage2000Elements() {
		int[] array = new int[2000];
		for (int i = 0; i < array.length; i++) {
			array[i] = 10000;
		}
		assertEquals(10000, StatisticUtil.average(array));
	}

	@Test
	public void testAverageUnorderedArray() {
		int[] array = new int[]{5,6,3,10,5000,399,2,0,0,0,10};
		assertEquals(494, StatisticUtil.average(array));
	}

	@Test
	public void testAverageWithNegativeNumbers() {
		int[] array = new int[] {-10,-20,-10,-20};
		assertEquals(-15, StatisticUtil.average(array));
	}

	@Test
	public void testAverageWithNegativeAndPositiveNumbers() {
		int[] array = new int[] {-10,-20,-10,-20,10,20,30, 10};
		assertEquals(1, StatisticUtil.average(array));
	}

	@Test
	public void testMode() {
		assertEquals(3, StatisticUtil.mode(new int[] {1,2,3,3}));
	}

	@Test
	public void testModeWithOnly1Number() {
		assertEquals(0, StatisticUtil.mode(new int[] {0,0,0,0,0}));
	}

	@Test
	public void testModeWithModeInArrayBegin() {
		assertEquals(0, StatisticUtil.mode(new int[] {0,0,0,0,0,1,1,1,2,2}));
	}

	@Test
	public void testModeWithModeInArrayEnd() {
		assertEquals(2, StatisticUtil.mode(new int[] {0,0,0,0,0,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}));
	}

	@Test
	public void testModeWithNegativeMode() {
		assertEquals(-1, StatisticUtil.mode(new int[] {0,0,0,0,0,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,2,2}));
	}

	@Test
	public void testModeWithModeInArrayMiddle() {
		assertEquals(0, StatisticUtil.mode(new int[] {0,2,0,3,4,0,5,10,5,3,3,0,1,3,5,0,10,22,0,32,0,0}));
	}

	@Test
	public void testMedianWithOddArray() {
		assertEquals(3, StatisticUtil.median(new int[] {1,2,3,4,5}));
	}

	@Test
	public void testMedianWithOddUnorderedArray() {
		assertEquals(3, StatisticUtil.median(new int[] {5,2,1,4,3}));
	}

	@Test
	public void testMedianWithEvenArray() {
		assertEquals(3, StatisticUtil.median(new int[] {1,2,3,4,5,6}));
	}

	@Test
	public void testMedianWithEvenArrayUnOrdered() {
		assertEquals(3, StatisticUtil.median(new int[] {6,5,1,3,4,2}));
	}

	@Test
	public void testMedianWithEvenArrayUnOrderedAndNegativeNumbers() {
		assertEquals(-3, StatisticUtil.median(new int[] {-6,-5,-1,-3,-4,-2}));
	}

	@Test
	public void testMedianWithOddUnorderedNegativeArray() {
		assertEquals(-3, StatisticUtil.median(new int[] {-5,-2,-1,-4,-3}));
	}

	@Test
	public void testMedianWithOddArrayUnOrderedAndNegativeAndPositiveNumbers() {
		assertEquals(0, StatisticUtil.median(new int[] {0, -1, -2,1,2}));
	}

	@Test
	public void testMedianWithEvenArrayUnOrderedAndNegativeAndPositiveNumbers() {
		assertEquals(0, StatisticUtil.median(new int[] {0, -1, -2,1,2, -3}));
	}
}
