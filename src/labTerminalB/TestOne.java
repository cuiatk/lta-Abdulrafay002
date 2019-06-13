package labTerminalB;

import org.junit.jupiter.api.Test;

class TestOne {

	@Test
	void test() {
		Movie m1 = new Movie("LUCK", 0);
		Movie m2 = new Movie("FAST8", 1);
		Customer me = new Customer("ABDUL");
	
		Rental r1 = new Rental(m1, 20);
		Rental r2 = new Rental(m2,20);
		
		me.addRental(r1);
		me.addRental(r2);
	
		String output1 = "Rental Record for RAFAY\r\n" + 
				"	LUCK	29.0\r\n" + 
				"	FAST8	60.0";
		if(output1.equals(me.data.statement(me)))
		{
			assert true;
		}
		

	}

}
