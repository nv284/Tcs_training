package com.org.jav8a;

import java.util.List;
import java.util.Optional;

import com.org.oned.Product;

public class Optionaltest {

	public static String getDefaultString() {
	    System.out.println("getDefaultString invoked");
	    return "Default String";
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee emp = new Employee("Geeta", "1232435");
     
     Optional<Employee> optionalPerson1 = Optional.ofNullable(emp);//
   
     
     optionalPerson1.ifPresent(
    	      p -> System.out.println("The name is " + p.getName())
    	    );
     
     Optional<String> myString = Optional.of("My string");
     Optional<String> noString = Optional.empty();

     System.out.println("1 -- " + myString.orElse(getDefaultString()));
     System.out.println("2 -- " + noString.orElse(getDefaultString()));
     
     
     
     Optional<Optional<String>> an1 = Optional.of( Optional.of("My another string"));
    	    
    	    System.out.println(
    	      an1.map(
    	        anotherString -> anotherString.map(String::toUpperCase)
    	      )
    	    );

    	    System.out.println(
    	      an1.flatMap(
    	        anotherString -> anotherString.map(String::toLowerCase)
    	      )
    	    );
    	    
    	    String result = " Java ";
    	    Optional<String> Str = Optional.of(result);
            Str.filter(res -> res.contains("Java"))
                    .map(String::trim)
                    .ifPresent((res) -> System.out.println(res));
            
            
            //map and flatmap
            Optional<String> nonEmptyGender = Optional.of("male");
            Optional<String> emptyGender = Optional.empty();

            System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
            System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

            Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
            System.out.println("Optional value   :: " + nonEmptyOtionalGender);
            System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
            System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
            
	}

}
