package com.hamcrest;




import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import org.testng.annotations.Test;

public class HamcrestTesting {
  /* 
   * http://www.vogella.com/tutorials/Hamcrest/article.html
   * https://www.javacodegeeks.com/2015/11/hamcrest-matchers-tutorial.html
   * 
   * 
   * */
	@Test
	
	    public void test_failed() throws Exception {
	
	        // Given
	
	        Integer number = 20;
	
	 
	
	        // Then
	assertThat(number,greaterThan(10));
	       
	    }

	}

