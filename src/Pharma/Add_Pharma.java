package Pharma;
import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

//import org.apache.logging.log4j.LogManager;

//import org.apache.log4j.PropertyConfigurator;

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

import Patient.Add_Patient;
import Patient.MyScreenRecorder;

//import Provider.ScreenRecorderUtil;

//import org.openqa.selenium.JavascriptExecutor;

public class Add_Pharma {
	
		
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver;
	 MyScreenRecorder.startRecording("main");
		//String j;
		String url="http://3.136.200.185/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Add_Pharma.xlsx");
		
		Logger logger=LogManager.getLogger("Add_Pharma.class");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//PropertyConfigurator.configure("Log4j.properties");
		for(int i=1;i<2;i++) {
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
		String data16=sheet1.getRow(i).getCell(16).getStringCellValue();
		
		String data7=sheet1.getRow(i).getCell(7).getStringCellValue();
		String data9=sheet1.getRow(i).getCell(9).getStringCellValue();
		String data12=sheet1.getRow(i).getCell(12).getStringCellValue();
		String data15=sheet1.getRow(i).getCell(15).getStringCellValue();
		
		/*
		int data7=(int) sheet1.getRow(i).getCell(7).getNumericCellValue();
		String i7=String.valueOf(data7);
		
		int data9=(int) sheet1.getRow(i).getCell(9).getNumericCellValue();
		String i9=String.valueOf(data9);
		
		int data12=(int) sheet1.getRow(i).getCell(12).getNumericCellValue();
		String i12=String.valueOf(data12);
		
		int data15=(int) sheet1.getRow(i).getCell(15).getNumericCellValue();
		String i15=String.valueOf(data15);
		*/
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("super.admin@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);logger.info("Login Sucessful");
		
		logger.info("Login Sucessful");
		driver.findElement(By.id("add")).click();
		Thread.sleep(5000);
		logger.info("Add Pharma Page");
		
		driver.findElement(By.id("pharma-name")).sendKeys(data0);//Pharma Name
		driver.findElement(By.id("pharma-description")).sendKeys(data1);//Pharma Description
		logger.info("Pharma Details sucess");
		
		//Work-Information
		
		driver.findElement(By.id("pharmaaddresslane1")).sendKeys(data2);
		driver.findElement(By.id("pharmaaddresslane2")).sendKeys(data3);
		
		//Thread.sleep(2000);
		
		 driver.findElement(By.id("country")).click();//Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(data4)).click();Thread.sleep(1000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("state")).click();
	     driver.findElement(By.xpath(data5)).click();Thread.sleep(1000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("city")).click();
	     driver.findElement(By.xpath(data6)).click();Thread.sleep(1000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("pharmapostalcode")).sendKeys(data7);//Postal Code
	     
	     driver.findElement(By.id("pharma-pc-name")).sendKeys(data8);//Primary Contact Name
	     driver.findElement(By.id("pharma-pc-number")).sendKeys(data9);//Primary Contact Number
	     driver.findElement(By.id("pharma-pc-email")).sendKeys(data10);//Primary Contact Email
		
	     logger.info("Work Info Sucessful");
	     
	     //Billing Info
	     driver.findElement(By.id("pharma-bc-name")).sendKeys(data11);//Primary Contact Name
	     driver.findElement(By.id("pharma-bc-number")).sendKeys(data12);//Primary Contact Number
	     driver.findElement(By.id("pharma-bc-email")).sendKeys(data13);//Primary Contact Email
	     Thread.sleep(1000);
	     
	     
	     driver.findElement(By.xpath("//label[@for=\"No\"]")).click();//2FA
	     Thread.sleep(1000);
	    // driver.findElement(By.xpath("//td[@aria-label='October 18, 2021']")).click();
	     
	     logger.info("Billing Info Sucessful");
	     
	     //Pharma Admin1
	     driver.findElement(By.id("pharma-admin-name")).sendKeys(data14);//Primary Contact Name
	     driver.findElement(By.id("pharma-admin-contact")).sendKeys(data15);//Primary Contact Number
	     driver.findElement(By.id("pharma-admin-email")).sendKeys(data16);//Primary Contact Email
	   
	    
	     logger.info("Pharma Admin Sucessful");
	     
	     Thread.sleep(2000);
	    driver.findElement(By.id("add-pharma")).click();
	     Thread.sleep(5000);
	     logger.info("Added New Pharma Completed");
	     Thread.sleep(5000);
	     //driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	    MyScreenRecorder.stopRecording();
	     Thread.sleep(5000);
	     driver.close();
	}}
}