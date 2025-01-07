package university;

import java.util.Scanner;

import Exception.AllException;

public class Teacher {
  
	public static void teacherDetails() throws Exception {
		
		 Scanner sct = new Scanner(System.in);
         System.out.println("\nHello Dear Teachers\n");
         System.out.print("Enter Teacher id : ");
         String tin = sct.nextLine();
         System.out.println("\n");
         if(tin.equalsIgnoreCase("kms321")){
             All_Teachers_Details.kuldeep();
         }else if(tin.equalsIgnoreCase("vd322")){
        	 All_Teachers_Details.vijay();
         }else if(tin.equalsIgnoreCase("sg323")){
        	 All_Teachers_Details.sugandha();
         }else if(tin.equalsIgnoreCase("ng324")){
        	 All_Teachers_Details.nigam();
         }else {
         	AllException.throwTeacherNotFoundException();
         }
         sct.close();
         
	}
}
