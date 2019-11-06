package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> nameList=Arrays.asList("Ramesh","Suresh","Mahesh");
		
		nameList.forEach(System.out::println);
		for(String eachItem:nameList) {
			System.out.println(eachItem);
		}
		
		Book book=new Book(1, "Java for dummies");
		System.out.println(book.getBookName());

	}

}
