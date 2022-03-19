package week1.day1.assignments;



public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		
		int f=0,s=1,t,i,range=8;
		System.out.println(f);
		System.out.println(s);
		for(i=2;i<range;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		

	}
}
// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		
