package com.collection.frame.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 	we are trying to create s simple application to collect a list of employees
//  and store in ArrayList and perform some operation like add, remove, search.	

public class ArrayListSample {

	ArrayList <Employee> employees;
//	List <Employee> employess;

	Scanner scan1 = new Scanner (System.in) ;
	public void populateArrayList ()
	{
	
 	employees = new ArrayList <Employee> ();
	Employee e1 = new Employee ("E001", "Harsha", "RTNagar",3000);
	employees.add(e1) ;
employees.add (new Employee ("E001", "Harsha", "RTNagar",2000));
employees.add (new Employee ("E002", "RAmu", "Patna",4000));
employees.add (new Employee ("E003", "Kallu", "Singapore",3000));
employees.add (new Employee ("E004", "Azim", "Rohtas",5000));
employees.add (new Employee ("E005", "Sudheer", "kolkota",6000));	

}
	public void fetchArrayListElements ()
{
	Iterator<Employee> empIter = employees.iterator ();
	while (empIter.hasNext())
		{
			Employee e = empIter.next();
			System.out.println(e);
	}
}	
public void searchEmployee ()
{
System.out.println("Enter the indes of the record you wish to see");
		int myIndex = scan1.nextInt();
		int mySize = employees.size () ;
		System.out.println ("The size of Array is sie " +mySize);
		if (myIndex < (mySize-1))
{
Employee e = employees.get(myIndex) ;
System.out.println("the employee in the index" +myIndex+" is " +e);			
}
	else
{
System.out.println("Sorry index out of range");
}
	
}
public void deleteEmployee ()
{
	System.out.println("Enter the Index of the record you wish to delete ");
	int myIndex = scan1.nextInt ();
	int mySize = employees.size();
	if (myIndex < (mySize-1)) 
	{
	employees.remove(myIndex) ;
}
	else
	{		
		System.out.println("Sorry index out of range");
	}		
}

public static void main(String[]args) {
ArrayListSample als = new ArrayListSample ();
als.populateArrayList();
als.fetchArrayListElements();
System.out.println("---------------------------");
als.searchEmployee();
System.out.println("---------------------------");
als.deleteEmployee();
System.out.println("---------------------------");

	}
}
