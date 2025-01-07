package university;

import java.util.Scanner;

import Exception.AllException;

public class Student_Dashboard {
	
	public static void studentDsb() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ->  RESULT   |   2 ->  ATTENDENCE   | 3 ->  DETAILS");
		int inp = sc.nextInt();
		 System.out.print("\nEnter Your Roll Number : ");
		String strinp = sc.next();
		if(inp == 1){
			All_Students_Details.pass();
		}else if(inp == 2) {
			All_Students_Details.attendence();
		}else if(inp == 3 ) {
			if(strinp.equalsIgnoreCase("2ies23csed01")) {
            	All_Students_Details.shahid();
			}else if(strinp.equalsIgnoreCase("2ies22cse043")) {
				All_Students_Details.sikandar();
			}else if(strinp.equalsIgnoreCase("2ies22cse110")) {
				All_Students_Details.sajid();
			}else if(strinp.equalsIgnoreCase("2ies21nur211")) {
				All_Students_Details.wajid();
			}else if(strinp.equalsIgnoreCase("2ies22phy069")) {
				All_Students_Details.neyab();
			}else if(strinp.equalsIgnoreCase("0177ad231005")) {
				All_Students_Details.adil();
			}else {
				AllException.throwStudentNotFoundException();
			}
		}
		sc.close();
	}

	
}
