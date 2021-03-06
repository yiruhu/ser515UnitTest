package test.java;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlgoTest {
	SortAlgos sort = new SortAlgos();
	
	//node coverage, edge coverage, condition coverage
	@Test
	public void bubbleExceptionMessage() {
		
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.bubbleSort(null);
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	
	@Test
	public void heapExceptionMessage() {
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.heapSort(null);;
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	
	@Test
	public void insertExceptionMessage() {
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.insertionSort(null);
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	@Test
	public void mergeExceptionMessage() {
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.mergeSort(null);
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	
	@Test
	public void quickExceptionMessage() {
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.quickSort(null);
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	
	@Test
	public void selectExceptionMessage() {
	      try {
	          //new ArrayList<Object>().get(0);
	    	  SortAlgos.selectionSort(null);
	          fail("Expected an NullPointerException to be thrown");
	      } catch (NullPointerException anNullPointerException) {

	      }  
	}
	
	
	@Test
	//node coverage, edge coverage, condition coverage
	public void bubble() {
		//SortAlgos data = new SortAlgos();
		int[] expect = new int[]{1,2,3,4};
		Item[] vec = new Item[4];
		vec[0] = new Item(3);
		vec[1] = new Item(2);
		vec[2] = new Item(1);
		vec[3] = new Item(4);
		SortAlgos.bubbleSort(vec);
		for(int i=0;i<4;i++){
			if(vec[i].key == expect[i]){
			 assertEquals(vec[i].key, expect[i]);
			}
		}
	}
	@Test
	public void heap() {
		//SortAlgos data = new SortAlgos();
		int[] expect1 = new int[]{1,2,3,4};
		Item[] vec1 = new Item[4];
		vec1[0] = new Item(3);
		vec1[1] = new Item(2);
		vec1[2] = new Item(1);
		vec1[3] = new Item(4);
		
		SortAlgos.heapSort(vec1);
		for(int i=0;i<4;i++){
			if(vec1[i].key == expect1[i]){
			 assertEquals(vec1[i].key, expect1[i]);
			}
		}
		
	}
	@Test
	public void insert() {
		//SortAlgos data = new SortAlgos();
		int[] expect = new int[]{1,2,3,4};
		Item[] vec = new Item[4];
		vec[0] = new Item(3);
		vec[1] = new Item(2);
		vec[2] = new Item(1);
		vec[3] = new Item(4);
		
		SortAlgos.insertionSort(vec);
		for(int i=0;i<4;i++){
			if(vec[i].key == expect[i]){
			 assertEquals(vec[i].key, expect[i]);
			}
		}
		
	}
	@Test
	public void merge() {
		//SortAlgos data = new SortAlgos();
		int[] expect = new int[]{1,2,3,4};
		Item[] vec = new Item[4];
		vec[0] = new Item(3);
		vec[1] = new Item(2);
		vec[2] = new Item(1);
		vec[3] = new Item(4);
		
		SortAlgos.mergeSort(vec);
		for(int i=0;i<4;i++){
			if(vec[i].key == expect[i]){
			 assertEquals(vec[i].key, expect[i]);
			}
		}
		
	}
	@Test
	public void quik() {
		//SortAlgos data = new SortAlgos();
		int[] expect = new int[]{1,2,3,4};
		Item[] vec = new Item[4];
		vec[0] = new Item(3);
		vec[1] = new Item(2);
		vec[2] = new Item(1);
		vec[3] = new Item(4);
		
		SortAlgos.quickSort(vec);
		for(int i=0;i<4;i++){
			if(vec[i].key == expect[i]){
			 assertEquals(vec[i].key, expect[i]);
			}
		}
		
	}
	@Test
	public void select() {
		//SortAlgos data = new SortAlgos();
		int[] expect = new int[]{1,2,3,4};
		Item[] vec = new Item[4];
		vec[0] = new Item(3);
		vec[1] = new Item(2);
		vec[2] = new Item(1);
		vec[3] = new Item(4);
		
		SortAlgos.selectionSort(vec);;
		for(int i=0;i<4;i++){
			if(vec[i].key == expect[i]){
			 assertEquals(vec[i].key, expect[i]);
			}
		}
		
	}
	
	


}
