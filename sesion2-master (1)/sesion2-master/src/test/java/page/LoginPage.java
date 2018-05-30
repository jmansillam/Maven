package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/// objetivo: hacer login , simulando a un usuario
public class LoginPage {

	@FindBy(how = How.NAME, using = "userid")
	WebElement userName;
	
	@FindBy(how = How.NAME, using = "passid")
	WebElement Password;
	
	@FindBy(how = How.NAME, using = "repeatpassid")
	WebElement Password2;
	
	@FindBy(how = How.NAME, using = "submit")
	WebElement btn;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public boolean login(String username, String pass, String pass2) 
	{
		boolean rtn = false;
		// seccin para ingresar valores
		this.userName.sendKeys(username);
		this.Password.sendKeys(pass);
		this.Password2.sendKeys(pass2);
		this.btn.click();
		// Sincronizamos
		/// Wait explicito
		/// parametros driver , timeout -> tiempo mximo de espera 10 seg
		WebDriverWait wait = new WebDriverWait(this.driver, 10 );
		wait.withMessage("Se acabo el tiempo y nunca aparecio el alert");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 	
		if(alert.getText().equals("Succesful login!")) 
		{
			rtn = true;
		}
		alert.accept();		
		return rtn;
	} 
	
}
