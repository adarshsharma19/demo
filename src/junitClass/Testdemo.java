package junitClass;

public class Testdemo {

	public int add(int a, int b) {
		int result=a+b;
		return result;
	}
	
	public int addArray() {
		int sum=0;
		int arr[]= {10,20,30,40};
		for(int i=0;i<arr.length;i++) {
			sum=sum +arr[i];
		}
		return sum;
	}
	
	public int factorial(int n) {
		int fact=1;
		for(int i=n;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	public String greet(String name) {
		return "Hello "+name;
	}
}


