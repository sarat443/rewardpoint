package com.demo;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class ObjectSerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///Users/sharatmeitei/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/demo/src/main/java/com/demo/emp.txt
		Employee emp = new Employee(200, "Meitei");
		Address add = new Address("Prairie Point, USA");
		emp.setAdd(add);
		
		ObjectOutputStream buffOut = new ObjectOutputStream(new FileOutputStream("/Users/sharatmeitei/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/demo/src/main/java/com/demo/emp.txt"));
		buffOut.writeObject(emp);
		
		System.out.println("Obj written");
		buffOut.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/sharatmeitei/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/demo/src/main/java/com/demo/emp.txt"));
		 Employee empObj = (Employee)in.readObject();
		 System.out.println("Object Output : "+empObj.empId);
		 System.out.println("Object address : "+empObj.getAdd().getAdd());
		 
	}

}
