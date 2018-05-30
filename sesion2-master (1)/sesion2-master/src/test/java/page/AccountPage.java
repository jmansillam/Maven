package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import entities.Account;

public class AccountPage {

	@FindBy(how = How.NAME, using = "ctl00$MainContent$txtFirstName")
	WebElement name;

	@FindBy(how = How.NAME, using = "ctl00$MainContent$txtEmail")
	WebElement email;
	
	@FindBy(how = How.NAME, using = "ctl00$MainContent$txtHomePhone")
	WebElement phone;
	
	@FindBy(how = How.ID, using = "MainContent_Male")
	WebElement genderMale;
	
	@FindBy(how = How.ID, using = "MainContent_Female")
	WebElement genderFemale;
	
	@FindBy(how = How.NAME, using = "ctl00$MainContent$txtPassword")
	WebElement password;
	
	@FindBy(how = How.NAME, using = "ctl00$MainContent$txtVerifyPassword")
	WebElement verifyPassword;
	
	@FindBy(how = How.NAME, using = "ctl00$MainContent$menuCountry")
	WebElement country;
	
	@FindBy(how = How.ID, using = "MainContent_checkWeeklyEmail")
	WebElement weeklyEmail;
	
	@FindBy(how = How.ID, using = "MainContent_checkMonthlyEmail")
	WebElement monthlyEmail;
	
	@FindBy(how = How.ID, using = "MainContent_checkUpdates")
	WebElement occasionalEmail;
	
	@FindBy(how = How.ID, using = "MainContent_btnSubmit")
	WebElement btnSubmit;
	
	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void newAccount(Account cuenta)
	{
		this.name.sendKeys(cuenta.getName());
		this.email.sendKeys(cuenta.getEmail());
		this.phone.sendKeys(cuenta.getPhone());
		
		//Radio button Algoritmo
		if(cuenta.getGender().equalsIgnoreCase("Male")){
			this.genderMale.click(); 
		} else {
			this.genderFemale.click();
		}
		
		this.password.sendKeys(cuenta.getPassword());
		this.verifyPassword.sendKeys(cuenta.getVerifyPassword());	
		new Select(this.country).selectByVisibleText(cuenta.getCountry());
		
		//Check box Algoritmo
		if(cuenta.isWeeklyEmail()) {
			if(!this.weeklyEmail.isSelected()) {this.weeklyEmail.click(); }
		}else {
			if(this.weeklyEmail.isSelected()) {this.weeklyEmail.click(); }
		}
		
		if(cuenta.isMonthlyEmail()) {
			if(!this.monthlyEmail.isSelected()) {this.monthlyEmail.click(); }
		}else {
			if(this.monthlyEmail.isSelected()) {this.monthlyEmail.click(); }
		}
		
		if(cuenta.isOccasionalEmail()) {
			if(!this.occasionalEmail.isSelected()) {this.occasionalEmail.click(); }
		}else {
			if(this.occasionalEmail.isSelected()) {this.occasionalEmail.click(); }
		}
		
		app.Utilities.TakeScreenshot(this.driver, "newAccount");
		this.btnSubmit.submit();	
	}
	
}
