package com.PracticeAssignment;

public class Search {
	 void binarysearch(double [] set, int first, int last, double key) {
		int mid= (first+last)/2;
		while(first<=last) {
			if(set[mid]<key) {
				first=mid+1;
			}
			else if(set[mid]==key) {
				System.out.print("The Stock value"+" "+ key+" "+"is present.");
				break;
			}
			
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Stock Price not found");
		}
}
}