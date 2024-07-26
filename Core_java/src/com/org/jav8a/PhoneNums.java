package com.org.jav8a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PhoneNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Employee> emp = new ArrayList<Employee>();
      emp.add(new Employee("abc", Arrays.asList("123455667","23435566")));
      emp.add(new Employee("abc", Arrays.asList("123455667","234565676")));
      emp.add(new Employee("abc", Arrays.asList("123889967","239999966")));
      emp.add(new Employee("abc", Arrays.asList("123555557","21111566")));
      System.out.println(emp.stream().map(emp1->emp1.getPhones()).collect(Collectors.toList()));
      
      System.out.println(emp.stream().map(emp2->emp2.getPhones())
    		  .flatMap(phones->phones.stream()
    		  .map(phone->"+92- "+phone)).collect(Collectors.toList()));
      
	}

}
