package week1.Assigment1;

public class Fibonacci {

	 public static void main(String[] args) {
	       
	        int count = 8;
	        int num1 = 0, num2 = 1;

	        System.out.print("First " + count + " Fibonacci numbers: ");

	        for (int i = 1; i <= count; i++) {
	            System.out.print(num1 + " ");

	            // Calculate the next number
	            int nextNum = num1 + num2;
	            num1 = num2;
	            num2 = nextNum;
	        }
	    }
	}
