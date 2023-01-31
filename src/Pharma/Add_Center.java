package Pharma;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

//import org.apache.logging.log4j.LogManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
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

public class Add_Center {
		
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		//String j;
		String url="http://3.19.203.161/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Add_Center.xlsx");
		
		Logger logger=LogManager.getLogger("Add_Center.class");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//PropertyConfigurator.configure("Log4j.properties");
		
		String dataa=sheet1.getRow(1).getCell(15).getStringCellValue();
		String datab=sheet1.getRow(1).getCell(16).getStringCellValue();
		for(int i=1;i<=1;i++) {
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
		String data2=sheet1.getRow(i).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(i).getCell(3).getStringCellValue();
		String data4=sheet1.getRow(i).getCell(4).getStringCellValue();
		String data5=sheet1.getRow(i).getCell(5).getStringCellValue();
		String data6=sheet1.getRow(i).getCell(6).getStringCellValue();
		
		String data8=sheet1.getRow(i).getCell(8).getStringCellValue();
		String data10=sheet1.getRow(i).getCell(10).getStringCellValue();
		String data11=sheet1.getRow(i).getCell(11).getStringCellValue();
		String data13=sheet1.getRow(i).getCell(13).getStringCellValue();
		String data14=sheet1.getRow(i).getCell(14).getStringCellValue();
		
		String data7=sheet1.getRow(i).getCell(7).getStringCellValue();
		String data9=sheet1.getRow(i).getCell(9).getStringCellValue();
		String data12=sheet1.getRow(i).getCell(12).getStringCellValue();
		
		String datac=sheet1.getRow(i).getCell(17).getStringCellValue();
		
		/*		
		data7=(int) sheet1.getRow(i).getCell(7).getNumericCellValue();
		String i7=String.valueOf(data7);
		
		int data9=(int) sheet1.getRow(i).getCell(9).getNumericCellValue();
		String i9=String.valueOf(data9);
		
		int data12=(int) sheet1.getRow(i).getCell(12).getNumericCellValue();
		String i12=String.valueOf(data12);
		*/
				
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(dataa);
		driver.findElement(By.id("password")).sendKeys(datab);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);logger.info("Login Sucessful");
		
		driver.findElement(By.id("search-record")).sendKeys(datac);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"font-semibold\"])[3]")).click();
				
		Thread.sleep(2000);
		
		driver.findElement(By.id("add")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("select-network")).click();Thread.sleep(1000);
		driver.findElement(By.xpath(data14)).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-center-name")).sendKeys(data0);//Pharma Name
		Thread.sleep(5000);
		driver.findElement(By.id("center-add-description")).sendKeys(data1);//Pharma Description
		Thread.sleep(2000);
		
		logger.info("Add Netowrk Page");
		
		//Work-Information
				
		driver.findElement(By.id("center-add-addresslane1")).sendKeys(data2);
		driver.findElement(By.id("center-add-addresslane2")).sendKeys(data3);
		
		Thread.sleep(2000);
		
		 driver.findElement(By.id("country")).click();Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(data4)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("state")).click();Thread.sleep(2000);
	     driver.findElement(By.xpath(data5)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("city")).click();Thread.sleep(2000);
	     driver.findElement(By.xpath(data6)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	    
	     driver.findElement(By.id("center-add-postalcode")).sendKeys(data7);//Postal Code
	     
	     logger.info("Work Info Sucessful");
	     
	     driver.findElement(By.id("center-add-pc-name")).sendKeys(data8);//Primary Contact Name
	     driver.findElement(By.id("center-add-pc-number")).sendKeys(data9);//Primary Contact Number
	     driver.findElement(By.id("center-add-pc-email")).sendKeys(data10);//Primary Contact Email
		 
	     logger.info("Primary Contact Details Sucessful");
	     
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//label[@for=\"No\"]")).click();//2FA
	     Thread.sleep(1000);
	     
	     //Program Coordinators
	     
	     driver.findElement(By.id("pc-admin-name")).sendKeys(data11);//Primary Contact Name
	     driver.findElement(By.id("pc-admin-contact")).sendKeys(data12);//Primary Contact Number
	     driver.findElement(By.id("pc-admin-email")).sendKeys(data13);//Primary Contact Email
	     
	     driver.findElement(By.id("add-center")).click();
	     Thread.sleep(5000);
	     
	     logger.info("Center Sucessfully Added");
	     
//	     MyScreenRecorder.stopRecording();
	     driver.findElement(By.xpath("//button[@type='button']")).click();
	     
	    
	     Thread.sleep(2000);
	     driver.close();
	     
	}
}
}