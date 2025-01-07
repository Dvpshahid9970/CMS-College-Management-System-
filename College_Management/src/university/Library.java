package university;

import person.IesUniversity;

public class Library extends IesUniversity {
	
	public static void libDetails() {
		
		Display dp = new Display();
		
	    System.out.println("\nHello Dear Librarian");
	    
		dp.Name("Rajesh Kumar");
	    dp.Profession("Librarian");
	    dp.Address("Bhopal,MP");
	    dp.MoblieNumber("35521-62432");
	    dp.Email("rajesh@gmail.com");
	}

}
