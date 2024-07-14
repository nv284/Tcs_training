package com.org.exception;


 class ServiceA {

    public void performOperation() throws ServiceExceptionA {
        // Some operation that might throw ServiceExceptionA
        throw new ServiceExceptionA("Error in ServiceA operation");
    }
}

 class ServiceB {

    private ServiceA serviceA = new ServiceA();
    public void processData() throws ServiceExceptionB {
        try {
            serviceA.performOperation();
        } catch (ServiceExceptionA e) {
            // Log exception and re-throw as ServiceExceptionB
            throw new ServiceExceptionB("Error processing data in ServiceB", e);
        }
    }
}


public class ExceptionPrpogation {

	 private ServiceB serviceB = new ServiceB();

	    public void runApplication() {
	        try {
	            serviceB.processData();
	        } catch (ServiceExceptionB e) {
	            // Handle the top-level exception
	            System.out.println("Application error: " + e.getMessage());
	        }
	    }
}