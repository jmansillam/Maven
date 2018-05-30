package entities;

public class Account {
	String name;
	String email;
	String phone;
	String gender;
	String password;
	String verifyPassword;
	String country;
	boolean weeklyEmail;
	boolean monthlyEmail;
	boolean occasionalEmail;
	
	public Account()
	{
		
	}
	
	public Account(String name, String email, String phone, String gender, String password, String verifyPassword,
			String country, boolean weeklyEmail, boolean monthlyEmail, boolean occasionalEmail) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.country = country;
		this.weeklyEmail = weeklyEmail;
		this.monthlyEmail = monthlyEmail;
		this.occasionalEmail = occasionalEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isWeeklyEmail() {
		return weeklyEmail;
	}

	public void setWeeklyEmail(boolean weeklyEmail) {
		this.weeklyEmail = weeklyEmail;
	}

	public boolean isMonthlyEmail() {
		return monthlyEmail;
	}

	public void setMonthlyEmail(boolean monthlyEmail) {
		this.monthlyEmail = monthlyEmail;
	}

	public boolean isOccasionalEmail() {
		return occasionalEmail;
	}

	public void setOccasionalEmail(boolean occasionalEmail) {
		this.occasionalEmail = occasionalEmail;
	}
	
	public String print()
	{
		return "ACCOUNT --" + 
				" name: "  + this.getName()    					+
				" email: " + this.getEmail()   					+
				" phone: " + this.getPhone()   					+
				" gender: " + this.getGender() 					+
				" password: " + this.getPassword() 				+
				" verifyPassword: "+ this.getVerifyPassword()	+
				" country: "+ this.getCountry() 				+
				" weeklyEmail: "+ this.isWeeklyEmail()			+
				" monthlyEmail: "+ this.isMonthlyEmail()		+
				" occasionalEmail: "+ this.isOccasionalEmail();
	}
}
