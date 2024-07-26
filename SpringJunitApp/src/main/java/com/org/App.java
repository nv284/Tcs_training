package com.org;

import com.org.model.PromoCodes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PromoCodes pref = new PromoCodes();
        System.out.println(pref.getDiscount("JUMBO"));
        System.out.println(pref.getAmountAfterDiscount("TRYNEW90", 1000));
        System.out.println(pref.getAmountAfterDiscountwithTaxes("SUNDAY", 1000));
    }
}
