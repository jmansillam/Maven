package tests;

import org.openqa.selenium.WebDriver;

import app.WebDriverCreator;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	private String url;
	private WebDriver _driver;
	private String browserType;
	
    public BaseTest(String url, String browserType) 
    {
    	this.url = url;
    	this.browserType = browserType;
    }	
    
    // Este metodo siempre se va ejecutar antes de cualquier test
    @Before
    public void inicializar() 
    {
    	if(this.browserType.equals("chrome")) 
    	{
    		this._driver = WebDriverCreator.getChromeDriver();
    	}else 
    	{
    		this._driver = WebDriverCreator.getFirefoxDriver();
    	}
    	
    	this._driver.navigate().to(this.url);
    }
    
    // Este metoddo siempre se va a ejecutar despues de cualquier test
    @After
    public void finalizar() 
    {
    	this._driver.close(); // cerrar las ventanas abiertas
    	this._driver.quit(); // cerrar el driver
    }
    
    public WebDriver getDriver() 
    {
    	return this._driver;
    }
    

}
