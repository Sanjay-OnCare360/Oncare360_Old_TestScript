package Pharma;
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
public class Network_Dashboard{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Edit_Patient.xlsx");
		
		
		Logger logger=LogManager.getLogger(Network_Dashboard.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		logger.info("Driver Open Sucess");
		
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("novartis@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Novartis@123");
		driver.findElement(By.xpath("//span[@class=\"checkmark\"]")).click();
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(3000);
		logger.info("Login Sucess");
		
		driver.findElement(By.id("search-record")).sendKeys("NT000016");
		Thread.sleep(3000);
		driver.findElement(By.id("view-dashboard")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,450)");
	    Thread.sleep(5000);
	    jse.executeScript("window.scrollBy(0,-450)");
		driver.findElement(By.xpath("//a[@href=\"#adherance_stats\"]")).click();
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		driver.findElement(By.xpath("//ng-select[@labelforid=\"center-filter\"]")).click();
		driver.findElement(By.xpath("//span[.='Novartis Center']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ng-select[@labelforid=\"disease-filter\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Leukemia'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"filter-date\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard-layout/app-dashboard/div/div[2]/div/div/div[3]/div/span/ngx-daterangepicker-material/div/div[2]/div/table/thead/tr[1]/th[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=29])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=3])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ng-select[@labelforid=\"drug-filter\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Happi\"]")).click();
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
		driver.findElement(By.xpath("//a[@href=\"#analytics_stats\"]")).click();	
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		//MyScreenRecorder.stopRecording();
		Thread.sleep(5000);
		driver.close();
}}
