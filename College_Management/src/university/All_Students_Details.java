package university;

public class All_Students_Details {
	
	static Display dp = new Display();
	
	public static void shahid() {
		
		Semester.Btech_Semester();
		System.out.println("\nHello Dear MOHAMMAD SHAHID\n");
		 dp.Name("Mohammad Shahid");
         dp.Profession("Student");
         dp.Address("Siwan,Bihar");
         dp.MoblieNumber("35521-62432");
         dp.Email("Shahid@gmail.com");
	}
	public static void sikandar() {
		
		Semester.Btech_Semester();
		
		 System.out.println("\nHello Dear SIKANDAR ALI");
		 dp.Name("Sikandar Ali");
         dp.Profession("Student");
         dp.Address("Raxaul,Bihar");
         dp.MoblieNumber("75521-62432");
         dp.Email("Sikandar@gmail.com");
	}
	
	public static void sajid() {
		
		Semester.Btech_Semester();
		
		System.out.println("\nHello Dear SAJID HUSSAIN");
		dp.Name("Sajid Ali");
        dp.Profession("Student");
        dp.Address("Siwan,Bihar");
        dp.MoblieNumber("97821-62432");
        dp.Email("Sajid@gmail.com");
	}
	
	public static void wajid() {
		
		Semester.nursing_year();
		
		 System.out.println("\nHello Dear WAJID ALI");
		dp.Name("Wajid Ali");
        dp.Profession("Student");
        dp.Address("Bettiah,Bihar");
        dp.MoblieNumber("11234-62432");
        dp.Email("wajid@gmail.com");
	}
	
	public static void neyab() {
		
		Semester.Bpharm_Semester();
		
		 System.out.println("\nHello Dear NEYAB ANSARI");
		dp.Name("Neyab Ansari");
        dp.Profession("Student");
        dp.Address("Raxaul,Bihar");
        dp.MoblieNumber("76553-62432");
        dp.Email("Neyab@gmail.com");
	}
	public static void adil() {
		
		Semester.Btech_Semester();
		
		 System.out.println("\nHello Dear AADIL HUSSAIN");  
		dp.Name("Aadil Hussain");
        dp.Profession("Student");
        dp.Address("Raxaul,Bihar");
        dp.MoblieNumber("63221-62432");
        dp.Email("aadil@gmail.com");
	}
	
	public static void pass() {
		System.out.println(" Result : PASS");
	}
	
	public static void fail() {
		System.out.println(" Result : FAIL");
	}
 
	public static void attendence() {
		System.out.println(" Today  :  Present✔ ");
		System.out.println("Total Attendence  :  40/50 days");
	}
	
}
