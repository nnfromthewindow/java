package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	private boolean isEmailValid (String email) {
		return email.contains("@");	
		}
	private boolean isPhonenumberValid (String phoneNumber) {
		return phoneNumber.startsWith("+0");	
		}
	private boolean isAdult (LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears()>16;	
		}
	
	public boolean isValid (Customer customer) {
		return isEmailValid(customer.getEmail()) &&
				isPhonenumberValid(customer.getPhoneNumber()) &&
				isAdult(customer.getDob());
	}
}
