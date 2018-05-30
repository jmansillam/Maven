package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import app.Endpoints;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps{

	@Step
	public void gotoLogin(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().to(Endpoints.login);
	}
	
	@Step
	public void setusername(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 4 );
		WebElement userid =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("userid"))));	
		userid.sendKeys("edward");;
	}
	
	@Step
	public void setpass1(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 4 );
		WebElement passid =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("passid"))));	
		passid.sendKeys("1234567");;
	}
	
	@Step
	public void setpass2(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 4 );
		WebElement passid2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("repeatpassid"))));	
		passid2.sendKeys("1234567");;
	}
	
	@Step
	public void submit(WebDriver driver) {
		driver.findElement(By.name("submit")).sendKeys("1234567");;
	}
}
