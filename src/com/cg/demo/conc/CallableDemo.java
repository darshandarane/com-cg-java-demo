package com.cg.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.col.Employee;

//public class CallableDemo implements Callable<Integer> {
public class CallableDemo implements Callable<Employee> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo obj = new CallableDemo();

		ExecutorService service = Executors.newSingleThreadExecutor();

		// Future<Integer> future = service.submit(obj);
		Future<Employee> future = service.submit(obj); // A Future represents the result of an asynchronous computation.
		Employee employee = future.get();
		System.out.println(employee);
		service.shutdown();

	}

	@Override
//	public Integer call() throws Exception {
	public  Employee call() throws Exception {	

	    
//	        int num = 0;
//	        for (int i = 0; i <= 10; i++) {
//	            num += i;
//	        }
//	        
//	        return num;
	        Employee obj = new Employee(121, "Darshan", 45.99);
	       
	        return obj;
	        
	    }
	}


