package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaPage {
	
	
	@FindBy(how = How.ID, using = "tab-hotel-tab-hp")
	WebElement btnHotel;

	@FindBy(how = How.ID, using = "hotel-destination-hp-hotel")
	WebElement goingto;
	
	@FindBy(how = How.ID, using = "hotel-checkin-hp-hotel")
	WebElement checkIN;
	
	@FindBy(how = How.ID, using = "hotel-checkout-hp-hotel")
	WebElement checkOUT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[4]/div[3]/div/ul/li/button")
	WebElement travelers;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[4]/div[3]/div/ul/li/div/div/div/div[2]/div[4]/button")
	WebElement adults;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[4]/div[3]/div/ul/li/div/div/div/div[3]/div[1]/div[4]/button")
	WebElement children;

	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[4]/div[3]/div/ul/li/div/div/div/div[3]/div[2]/label[1]/select")
	WebElement ChildAge;

	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[4]/div[3]/div/ul/li/div/footer/div/button")
	WebElement close;
	
	@FindBy(how = How.ID, using = "hotel-add-car-checkbox-hp-hotel")
	WebElement addCar;  

	@FindBy(how = How.XPATH, using = "//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[9]/label/button")
	WebElement btnSearch;
	
	WebDriver driver;
	
	public ExpediaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void hotelReservation() 
	{
		this.btnHotel.click();
		WebDriverWait wait = new WebDriverWait(this.driver, 25 );
		wait.until(ExpectedConditions.visibilityOf(goingto)); 	
		this.goingto.clear();
		this.goingto.sendKeys("Guatemala City, Guatemala");

		this.checkIN.clear();
		this.checkIN.sendKeys("10/02/2018");

		this.checkOUT.clear();
		this.checkOUT.sendKeys("10/03/2018");

		this.travelers.click();
		wait.until(ExpectedConditions.visibilityOf(this.adults));
		this.adults.click();
		this.adults.click();
		
		this.children.click();
		
		new Select(this.ChildAge).selectByVisibleText("5");
		app.Utilities.TakeScreenshot(this.driver, "hotelReservation");
		this.close.click();	
		wait.until(ExpectedConditions.visibilityOf(this.addCar));
		this.addCar.click();
		app.Utilities.TakeScreenshot(this.driver, "hotelReservation");
		this.btnSearch.click();
	
	}
}
