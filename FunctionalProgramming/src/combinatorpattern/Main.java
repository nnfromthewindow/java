package combinatorpattern;

import static combinatorpattern.CustomerRegistrationValidator.isAnAdult;
import static combinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer (
				"Alice", 
				"alice@gmail.com",
				"+0789654123",
				LocalDate.of(2000, 1, 31));

//		System.out.println(new CustomerValidatorService().isValid(customer));

		//if valid we can store customer in db

		//Using combinator pattern
		
		ValidationResult result = isEmailValid()
				.and(isPhoneNumberValid())
				.and(isAnAdult())
				.apply(customer);
	
		System.out.println(result);
		
		if(result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}
	
}
