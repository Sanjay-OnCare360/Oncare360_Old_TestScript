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

public class Add_Provider{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
//		MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Add_Provider.xlsx");
		
		
		Logger logger=LogManager.getLogger(Add_Provider.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		for(int i=1;i<=1;i++) {
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
		//String data2=sheet1.getRow(1).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(i).getCell(3).getStringCellValue();
		String data4=sheet1.getRow(i).getCell(4).getStringCellValue();
		
		String data8=sheet1.getRow(i).getCell(8).getStringCellValue();
		
		
		 int data2=(int) sheet1.getRow(i).getCell(2).getNumericCellValue();
			String i2=String.valueOf(data2);
		
			int data5=(int) sheet1.getRow(i).getCell(5).getNumericCellValue();
			String i5=String.valueOf(data5);
			
			int data6=(int) sheet1.getRow(i).getCell(6).getNumericCellValue();
			String i6=String.valueOf(data6);
			
			int data7=(int) sheet1.getRow(i).getCell(7).getNumericCellValue();
			String i7=String.valueOf(data7);
			
			
	//	MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(3000);
		logger.info("Login Sucess");
		
		driver.findElement(By.xpath("//a[@aria-controls=\"provider\"]")).click();Thread.sleep(3000);//Provider Tab
		
		driver.findElement(By.xpath("//button[@ng-reflect-router-link=\"/add-doctor\"]")).click();Thread.sleep(3000);//Add Provider Button
		
		driver.findElement(By.xpath("(//button[@data-toggle=\"modal\"])[1]")).click();//Search NPI Number
		Thread.sleep(2000);
		
		driver.findElement(By.id("npi-search")).sendKeys(i2);Thread.sleep(2000);
		driver.findElement(By.id("npigo")).click();//Select button
		
		driver.findElement(By.xpath("//ng-select[@ng-reflect-label-for-id=\"addprovider-type\"]")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Doctor\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Qualification")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\" Doctor of Clinical Medicine (\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Specification\"]")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Cardiologist\"]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname=\"MobileNumber\"]")).sendKeys(i6);Thread.sleep(1000);
		
		logger.info("Basic Information Sucess");
		
		//driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[2]")).clear();Thread.sleep(1000);
		//driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[2]")).sendKeys(i7);
				
		driver.findElement(By.id("addprovider-email")).sendKeys(data8);
		
		logger.info("Work Information Sucess");
		
		driver.findElement(By.xpath("//label[@for=\"Email\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary ml-2\"]")).click();
		
		logger.info("Add Provider Sucess");
		
		//Thread.sleep(2000);
		
//		MyScreenRecorder.stopRecording();
		}
	}
}