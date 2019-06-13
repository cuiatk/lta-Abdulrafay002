package labTerminalB;

import java.util.Vector;

public class Customer {
		CustomerData data = new CustomerData(new Vector<Rental>());
		public Customer (String name){
			data._name = name;
		};
		public void addRental(Rental arg) {
			data._rentals.addElement(arg);
		}
		public String getName (){
			return data._name;
		}
}
