package university;

import person.IesUniversity;

  public class Security extends IesUniversity {
	
	  public static void securityDetails() {
		  
		  Display dp = new Display();
		  
		  System.out.println("\nHello Dear Security Guard");
		  
		  dp.Name("Pankaj Tiwari");
		  dp.Profession("Security Guard");
		  dp.Address("Bhopal,MP");
		  dp.MoblieNumber("35521-62432");
		  dp.Email("pankaj@gmail.com");
	  }
}
