package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
	
		Customer maria = new Customer("Maria","99999");
	
	//Normal Java function
		greetCostumer(maria);
		greetCostumerV2(maria, false);
	//Consumer Functional interface
		greetCustomerConsumer.accept(maria);
		greetCustomerConsumerV2.accept(maria, false);
	
	}
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer , showPhoneNumber) -> 
			System.out.println("Hello " + customer.customerName + 
					", thanks for registering your number "+
					(showPhoneNumber ? customer.customerPhone : "*********")); 

	
	
	static Consumer<Customer> greetCustomerConsumer = customer -> 
			System.out.println("Hello " + customer.customerName + 
					", thanks for registering your number "+
					customer.customerPhone); 
	
	
			static void greetCostumerV2(Customer customer, boolean showPhoneNumber) {
				
				System.out.println("Hello " + customer.customerName + ", thanks for registering your number "
									+ (showPhoneNumber ? customer.customerPhone : "*********") );
					
				}		
			
			static void greetCostumer(Customer customer) {
		
				System.out.println("Hello " + customer.customerName + ", thanks for registering your number "+ customer.customerPhone);
		
	}
	static class Customer{
		
		private final String customerName;
		private final String customerPhone;
		
		Customer(String customerName, String customerPhone ){
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}
	}
}
