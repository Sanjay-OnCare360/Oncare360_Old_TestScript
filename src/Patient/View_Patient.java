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
public class View_Patient{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\View_Patient.xlsx");
		
		
		Logger logger=LogManager.getLogger(View_Patient.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		for(int i=1;i<=1;i++) {
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
		
		String data2=sheet1.getRow(i).getCell(2).getStringCellValue();
		//String data3=sheet1.getRow(i).getCell(3).getStringCellValue();
		
		logger.info("Login Sucess");
		
		//MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		logger.info("Login Sucess");

		driver.findElement(By.xpath("(//input[@name=\"search-key\"])[1]")).sendKeys(data2);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title=\"View Details\"])[1]")).click();

		logger.info("Patient Info Sucess");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary ml-2\"])[1]")).click();
		
		Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary ml-2\"])[2]")).click();Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary ml-2\"])[3]")).click();Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		MyScreenRecorder.stopRecording();Thread.sleep(5000);
		}
		driver.close();
	}
}