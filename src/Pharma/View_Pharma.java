package Pharma;
import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

import org.apache.log4j.PropertyConfigurator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Patient.MyScreenRecorder;

//import Provider.ScreenRecorderUtil;

//import org.openqa.selenium.JavascriptExecutor;

public class View_Pharma {
	
		
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver;
//		MyScreenRecorder.startRecording("main");
		//String j;
		String url="http://3.136.200.185/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		//File src=new File("C:\\Users\\purnachander\\eclipse-workspace\\lib\\Excel_Data\\Edit_Pharma.xlsx");
		
		//Logger logger=LogManager.getLogger("Edit_Pharma.class");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//FileInputStream fis=new FileInputStream(src);
		
		//XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//XSSFSheet sheet1=wb.getSheetAt(0);
		
		//PropertyConfigurator.configure("Log4j.properties");
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("super.admin@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login-submit")).click();
		//logger.info("Login Successful");
		Thread.sleep(5000);
		
		driver.findElement(By.id("search-record")).sendKeys("PH000013");
		Thread.sleep(3000);
		driver.findElement(By.id("view-info")).click();
		Thread.sleep(5000);
		
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	       
	       jse.executeScript("window.scrollBy(0,450)");
	       
	       Thread.sleep(5000);
	      	       
	       jse.executeScript("window.scrollBy(0,450)");
	       
	       Thread.sleep(5000);
	       
	       jse.executeScript("window.scrollBy(0,450)");
//	        MyScreenRecorder.stopRecording();
	       Thread.sleep(5000);
	       
	       driver.close();
		
	}
}