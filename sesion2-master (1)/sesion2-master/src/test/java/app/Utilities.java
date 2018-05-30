package app;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public  static void TakeScreenshot(WebDriver _driver, String name) 
	{
		File scrFile = ((TakesScreenshot)_driver).getScreenshotAs(OutputType.FILE);
		try {
			String fecha = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
			FileUtils.copyFile(scrFile, new File("C:\\screenshot\\"+name+fecha+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
