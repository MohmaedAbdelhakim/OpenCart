package BO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString

public class Register_BO {

	@Setter
	@Getter
	String FirstName;

	@Setter
	@Getter
	String LastName;

	@Setter
	@Getter
	String Email;

	@Setter
	@Getter
	String Telephone;
	
	@Setter
	@Getter
	String Password;
	
	@Setter
	@Getter
	String ConfirmPassword;

}
