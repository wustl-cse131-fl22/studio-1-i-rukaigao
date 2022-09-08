package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		boolean a = (year%4 == 0);
		boolean b = (year%100 != 0);
		boolean c = (year%400 == 0);
		boolean isLeapYear = (a && b )||(c);
		System.out.println(isLeapYear);
		
		

	}

}
