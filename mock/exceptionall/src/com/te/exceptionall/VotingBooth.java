package com.te.exceptionall;

import java.util.Scanner;

public class VotingBooth {
	public static void main(String[] args) throws BelowAge {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the name of the voter ");
		String b = a.nextLine();
		System.out.println("Enter the age");
		int c = a.nextInt();
		VoterID voterID = new VoterID(b, c);
	}
}