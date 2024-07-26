package com.org;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.org.model.PromoCodes;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	PromoCodes  promoCodes = new PromoCodes();;
	
	@TempDir
	Path tempPath;
	
	@BeforeAll
	static void initAll() {
		System.out.println("MyTestAnnotation :beforeAll");
	}
	@Test
	public void testwrite() throws IOException {
		final Path tempfile = Files.createFile(tempPath.resolve("myfile.txt"));
		Files.writeString(tempfile, "hello world");
		final String  s = Files.readString(tempfile);
		assertEquals("hello", s);
	}
	
	@BeforeEach
	 public void checkAmout() {
		 System.out.println("Please check Amount ");
	 }
   

	
	
	/*
    @Test
    public void testPromoCode() {
    	assertEquals(true, promoCodes.checkPromoCode("bingo"));
    	//assertTrue(promoCodes.checkPromoCode("xingo"));
    }
     
     @Test
      public void testDiscount() {
    	  String pcode = "JUMBO";
    	  double expectedDiscount = 0.40;
    	  assertEquals(expectedDiscount, promoCodes.getDiscount(pcode));
      }
     
     @Test
     @Disabled
     public void testAmountDiscount() {
    	 String pcode = "TRYNEW90";
    	 double amount = 1000;   double expectedAmount = 950.0;
    	 assertEquals(expectedAmount, promoCodes.getAmountAfterDiscount(pcode, amount));
     }//fail
     
     @Test
     public void testAmountDiscountTaxes() {
    	 String pcode = "SUNDAY";
    	 double amount = 1000 ; double expectedAmount = 850.0;
    	 assertEquals(expectedAmount, promoCodes.getAmountAfterDiscountwithTaxes(pcode, amount));
    			 
     }
     
     @AfterEach
     public void aftertest() {
    	 System.out.println(" I am After each annotation ");
     }
   
     @RepeatedTest(5)
     public void myTest() {
    	 System.out.println("checking test method ");
    	 fail("test case failed");
     }
     */
     
     
     
     
     
     
     
     
    public void testApp()
    {
    	
       assertTrue( true );
    }
}
