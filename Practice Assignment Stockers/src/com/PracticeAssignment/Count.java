package com.PracticeAssignment;

public class Count {
	public int Countup(boolean[] arr, boolean Key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				count++;}
			}return count;
		}
		public int Countdown(boolean[]arr, boolean key) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==false) {
			count++;
		}
	}
			return count;
		}

}
