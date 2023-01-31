package Patient;
import java.io.File;
import java.io.FileInputStream;
//import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import Patient.MyScreenRecorder;

import org.openqa.selenium.JavascriptExecutor;
public class Provider_Analytics{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Patient_Dashboard.xlsx");
		
		
		Logger logger=LogManager.getLogger(Provider_Analytics.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		logger.info("Chrome Open Sucess");
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("sanofipc@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Sanofi@123");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		logger.info("Login Sucess");
		
		driver.findElement(By.xpath("//a[.=' Analytics']")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(5000);
	    jse.executeScript("window.scrollBy(0,-450)");
		driver.findElement(By.xpath("//a[@href=\"#adherance_stats\"]")).click();
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");Thread.sleep(5000);
		
		//driver.findElement(By.id("filter-provider")).click();
		//driver.findElement(By.xpath("//span[.='ABATE PAULA']")).click();
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(3000);
		
		driver.findElement(By.id("filter-date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[@class=\"prev available ng-star-inserted\"][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=28])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ng-select[@labelforid=\"disease-filter\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Leukemia'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ng-select[@placeholder=\"Choose Drug\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Dosage\"]")).click();
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#journal-adherance\"]")).click();
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#survey-adherance\"]")).click();
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-450)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#ae_stats\"]")).click();	
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		
		MyScreenRecorder.stopRecording();Thread.sleep(2000);
		driver.close();
	}
	
}