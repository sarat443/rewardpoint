package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class EmployeeController 
{
	@Value("${emp.name}")
    private String name;
    @Value("${emp.id}")
    private String id;
   @RequestMapping("/")
    public List<Employee> getEmployees() 
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
      
      System.out.println("hello >>>> "+name+" : "+id);
      return employeesList;
    }
}