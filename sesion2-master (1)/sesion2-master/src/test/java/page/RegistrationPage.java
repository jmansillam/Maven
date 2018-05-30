package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	@FindBy(how = How.NAME, using = "userid")
	WebElement user;
	
	@FindBy(how = How.NAME, using = "passid")
	WebElement password;
	
	@FindBy(how = How.NAME, using = "username")
	WebElement name;
	
	@FindBy(how = How.NAME, using = "address")
	WebElement address;
	
	@FindBy(how = How.NAME, using = "country")
	WebElement selectCountry;
	
	@FindBy(how = How.NAME, using = "zip")
	WebElement zipCode;
	
	@FindBy(how = How.NAME, using = "email")
	WebElement email;
	
	@FindBy(how = How.CSS, using = "#post-70 > div > form > ul > li:nth-child(16) > input[type=\"radio\"]")
	WebElement radioMale;
	
	@FindBy(how = How.CSS, using = "#post-70 > div > form > ul > li:nth-child(17) > input[type=\"radio\"]")
	WebElement radioFemale;
	
	@FindBy(how = How.NAME, using = "languageQuestion")
	WebElement checkEnglish;
	
	@FindBy(how = How.NAME, using = "desc")
	WebElement about;
	
	@FindBy(how = How.NAME, using = "submit")
	WebElement btnRegister;
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public boolean registration()
	{
		WebDriverWait wait = new WebDriverWait(this.driver, 10 );
		wait.withMessage("Se acabo el tiempo en registration");
		
		wait.until(ExpectedConditions.visibilityOf(user));
		this.user.sendKeys("Edward25nov");
		wait.until(ExpectedConditions.visibilityOf(password));
		this.password.sendKeys("12345678");
		wait.until(ExpectedConditions.visibilityOf(name));
		this.name.sendKeys("edwardgomez");
		wait.until(ExpectedConditions.visibilityOf(address));
		this.address.sendKeys("Zona13");
		wait.until(ExpectedConditions.visibilityOf(selectCountry));
		Select select=new Select(this.selectCountry);
		select.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOf(zipCode));
		this.zipCode.sendKeys("0502");
		wait.until(ExpectedConditions.visibilityOf(email));
		this.email.sendKeys("edward25nov@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(this.radioFemale));
		wait.until(ExpectedConditions.visibilityOf(this.radioMale));
		if(this.radioMale.isSelected()) { this.radioFemale.click(); }
		else { this.radioMale.click(); }

		wait.until(ExpectedConditions.visibilityOf(this.checkEnglish));
		if(this.checkEnglish.getAttribute("checked").equals("true")) 
		{
			this.checkEnglish.click();
		}
		
		wait.until(ExpectedConditions.visibilityOf(this.about));
		this.about.sendKeys("Curso BDG");
		
		app.Utilities.TakeScreenshot(this.driver, "registration");
		wait.until(ExpectedConditions.visibilityOf(this.btnRegister));
		this.btnRegister.click();
		
		return true;
	}
	
}
