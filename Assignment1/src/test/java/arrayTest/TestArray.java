package arrayTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import FullArray.Array;
import junit.framework.Assert;

public class TestArray {

	static Array arr;
	@BeforeClass
	public static void setUp() throws Exception {
		arr= new Array();
	}

	@Test
	public void test() {
		arr.insert(100, 0);
		arr.insert(5, 1);
		arr.bubbleSort();
		Assert.assertEquals(arr.linearSearch(5),true);
	}

	@Test
	public void test1() {
	arr.delete(100);
	Assert.assertEquals(arr.linearSearch(100),false);
	}

	@Test
	public void test2() {
	Assert.assertEquals(arr.binarySearch(100, 1,5 ),false);
	}
	
	@Test
	public void test3() {
		arr.getValues();
	}
}
