package com.example.linklist;

public class DemoLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustLinkedList linkList = new CustLinkedList();
		
		System.out.println("output >");
		linkList.insert(5);
		
		linkList.insert(20);
		linkList.insert(30);
		linkList.show();
	}

}
