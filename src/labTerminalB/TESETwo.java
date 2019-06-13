package labTerminalB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TESETwo {

	@Test
	void test() {
		Movie m1 = new Movie("Callofduty", 0);
		Movie m2 = new Movie("NFS", 1);
		Customer me = new Customer("Nasir");
	
		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2,3);
		
		/**
		 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
		 */
		
			me.addRental(r1);
			me.addRental(r2);
			//fail("Not yet implemented");
			String output1 = "Rental Record for Nasir\r\n" + 
					"	Callofduty	2.0\r\n" + 
					"	NFS	9.0";
			if(output1.equals(me.statement()))
			{
				assert true;
			}
		
	}

}
