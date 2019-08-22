package test.sortTest; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sortTest.SortMethod;

/** 
* SortMethod Tester. 
* 
* @author <Authors name> 
* @since <pre>°ËÔÂ 22, 2019</pre> 
* @version 1.0 
*/ 
public class SortMethodTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectSort(int arr[]) 
* 
*/ 
@Test
public void testSelectSort() throws Exception { 
//TODO: Test goes here...
    int arr[] = {8,1,5,6,7,9,4,2,0,3};
    SortMethod.selectSort(arr);
} 


} 
