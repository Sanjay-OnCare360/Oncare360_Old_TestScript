package Patient;
import java.io.File;
import java.io.FileInputStream;
//import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

import Patient.MyScreenRecorder;


public class Delete_Provider{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Delete_Provider.xlsx");
		
		
		Logger logger=LogManager.getLogger(Delete_Provider.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(1).getCell(1).getStringCellValue();
		
		String data2=sheet1.getRow(1).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(1).getCell(3).getStringCellValue();
		
		logger.info("Login Sucess");
		
		//MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		logger.info("Login Sucess");
		
		
		driver.findElement(By.id("provider-listtab")).click();Thread.sleep(3000);//Provider Tab
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(data2);
		//driver.findElement(By.id("searchprovider")).sendKeys(data2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-target=\"#delete\"]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//button[@id='yes'])[2]")).click();Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//ng-select[@placeholder=\"Search Prescriber\"]")).click();Thread.sleep(5000);
	    
	    driver.findElement(By.xpath(data3)).click();
	    
	    driver.findElement(By.xpath("(//button[@id='yes'])[2]")).click();Thread.sleep(2000);
	    
	   // driver.findElement(By.xpath("(//button[@id='yes'])[2]")).click();Thread.sleep(2000);
	       
	    Thread.sleep(3000);
	}
}


