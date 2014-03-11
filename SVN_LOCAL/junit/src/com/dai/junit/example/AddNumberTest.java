/*
 * @author Jude Kikuyu
 * Created on Feb 10, 2014
 */
package com.dai.junit.example;

import static org.junit.Assert.*;

import org.junit.Test;


public class AddNumberTest {
    
	private AddNumber addNum;
	@Test
    public void testdoAdd() {
        
        int expectedResponse = 15;
        int actualResponse = addNum.doAdd();
        
        assertEquals( "a = b",expectedResponse, actualResponse ); 
    }
    
    
}
