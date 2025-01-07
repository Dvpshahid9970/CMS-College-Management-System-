package main;

import university.*;
import Exception.*;

import java.util.Scanner;

public class University {
	public static void main(String[] args) throws Exception {
		
		try {
			    Scanner sc = new Scanner(System.in);
				System.out.println("\nWelcome To IES University\n");
				System.out.println("What's Your Profession\n");
				System.out.println("Teacher | Student | Librarian | Sport Teacher | Security Guard |");
				System.out.println("   1    |    2    |     3     |       4       |        5       |");
				System.out.print("\nChoose Any Number From Above\n" + "Please Type Here.....   ");
				int acpt = sc.nextInt();
				
				if (acpt == 1) {
					Teacher.teacherDetails();
				} else if (acpt == 2) {
					Student_Dashboard.studentDsb();
				} else if (acpt == 3) {
					Library.libDetails();
				} else if (acpt == 4) {
				    Sport.sportDetails();
				} else if (acpt == 5) {
			        Security.securityDetails();
				} else {
					AllException.throwInvalidChoiceException();
				}
		     System.out.println("\nThanks for Visitng\nIES University");
			sc.close();
		} catch (Exception e) {	
		   e.getMessage();
		}
	}
}
