package arrayTest;

import static org.junit.Assert.*;

import java.io.DataInputStream;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ArrayDeletion.ArrayDeletion;
import ArrayInsert.ArrayInsertion;

public class TestArrayInsertion {

	static ArrayInsertion ins;
	static ArrayDeletion del;
	
	static int[] arr;	
	static int[] arr2;

	
	
	@BeforeClass
	public static void Start() {

		ins = new ArrayInsertion();
		del = new ArrayDeletion();

		arr = new int[11];		
		for(int i=0;i<10;i++)
			ins.insert(arr, i, i);
		
		
		arr2 = new int[11];		
		for(int i=0;i<11;i++)
			arr2[i]=i;
		
	}

	@Test
	public void testInsertion() {
		Assert.assertArrayEquals(ins.insert(arr,10,10),arr2 ); //Adding Values
		Assert.assertArrayEquals(arr2,ins.insert(arr,11,11));	// Not Adding values due to Array full
		
	}
	
	@Test
	public void testDeletion() {
		Assert.assertArrayEquals(arr2,del.delete(arr,11) ); //Not deleted Values
		Assert.assertArrayEquals(del.delete(arr2,5),del.delete(arr,5));	// deleted values
		
	}
	
	

}
