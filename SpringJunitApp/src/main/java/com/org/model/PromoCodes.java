package com.org.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {
List<String> promoCodes;
TreeMap<String, Double> promoCodeswithDiscounts ;

public PromoCodes() {
	super();
	promoCodes = Arrays.asList("JUMBO" , "BINGO","HAPPY50" , "TRYNEW90" , "SUNDAY");
	promoCodeswithDiscounts = new TreeMap<String, Double>();
	promoCodeswithDiscounts.put(promoCodes.get(0), 0.40);
	promoCodeswithDiscounts.put(promoCodes.get(1), 0.20);
	promoCodeswithDiscounts.put(promoCodes.get(2), 0.50);
	promoCodeswithDiscounts.put(promoCodes.get(3), 0.90);
	promoCodeswithDiscounts.put(promoCodes.get(4), 0.25);
	
	
	}
   public  Double getDiscount(String promoCodes) {
	  return promoCodeswithDiscounts.containsKey(promoCodes)? promoCodeswithDiscounts.get(promoCodes):0.05;
	}

   public Double  getAmountAfterDiscount(String promoCodes , double amount) {
    	return promoCodeswithDiscounts.containsKey(promoCodes)?(amount -amount*promoCodeswithDiscounts.get(promoCodes)):
    		(amount-amount*0.05);
    }
  public   Double  getAmountAfterDiscountwithTaxes(String promoCodes , double amount) {
    	double amountAfterDiscount = getAmountAfterDiscount(promoCodes, amount); 
    	return (amountAfterDiscount +(0.18*amountAfterDiscount));
    }
   public  boolean checkPromoCode(String promoCodes1) {
    	 return promoCodes.contains(promoCodes1.toUpperCase());
     }
    

}
