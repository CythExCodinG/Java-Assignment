package com.pipeline.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Rahul", "IT", 60000),
	            new Employee(2, "Priya", "HR", 45000),
	            new Employee(3, "Amit", "Finance", 55000),
	            new Employee(4, "Sneha", "IT", 75000),
	            new Employee(5, "Vikram", "HR", 40000),
	            new Employee(6, "Neha", "Finance", 65000)
	        );
		
		Predicate<Employee> hremp=emp->{
			if(emp.getDepartment().equals("IT")) return true;
			return false;
		};
		
		List<Employee> res=employees.stream().filter(hremp).collect(Collectors.toList());
		System.out.println(res);
	}

}
