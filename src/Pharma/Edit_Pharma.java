package Pharma;
import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

//import org.apache.logging.log4j.LogManager;

import org.apache.log4j.PropertyConfigurator;

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

public class Edit_Pharma {
	
		
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		//String j;
		String url="http://3.136.200.185/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Edit_Pharma.xlsx");
		
		Logger logger=LogManager.getLogger("Edit_Pharma.class");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//PropertyConfigurator.configure("Log4j.properties");
		for(int i=1;i<=2;i++) {
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
		//String data16=sheet1.getRow(i).getCell(16).getStringCellValue();
		String dataa=sheet1.getRow(i).getCell(16).getStringCellValue();
		
		int data7=(int) sheet1.getRow(i).getCell(7).getNumericCellValue();
		String i7=String.valueOf(data7);
		
		int data9=(int) sheet1.getRow(i).getCell(9).getNumericCellValue();
		String i9=String.valueOf(data9);
		
		int data12=(int) sheet1.getRow(i).getCell(12).getNumericCellValue();
		String i12=String.valueOf(data12);
		
		int data15=(int) sheet1.getRow(i).getCell(15).getNumericCellValue();
		String i15=String.valueOf(data15);
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("super.admin@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);logger.info("Login Sucessful");
		
		driver.findElement(By.id("search-record")).sendKeys(dataa);
		Thread.sleep(2000);
		driver.findElement(By.id("view-info")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("edit-details")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("pharma-name")).sendKeys(data0);//Pharma Name
		
		driver.findElement(By.id("pharma-description")).clear();
		driver.findElement(By.id("pharma-description")).sendKeys(data1);//Pharma Description
		logger.info("Added Pharma Sucessful");
		
		
		driver.findElement(By.id("save-details")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();Thread.sleep(2000);
		Thread.sleep(3000);
		//Work-Information
		
		driver.findElement(By.id("edit-work-info")).click();
		
		driver.findElement(By.id("pharmaaddresslane1")).clear();
		driver.findElement(By.id("pharmaaddresslane2")).clear();
		
		driver.findElement(By.id("pharmaaddresslane1")).sendKeys(data2);
		driver.findElement(By.id("pharmaaddresslane2")).sendKeys(data3);
		
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[1]")).click();Thread.sleep(1000);
		 driver.findElement(By.id("country")).click();
		 driver.findElement(By.xpath(data4)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	    		
	    // driver.findElement(By.xpath("(//span[@title=\\\"Clear all\\\"])[2]")).click();Thread.sleep(2000);
	     driver.findElement(By.id("state")).click();
	     driver.findElement(By.xpath(data5)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	     
	    // driver.findElement(By.xpath("(//span[@title=\\\"Clear all\\\"])[3]")).click();Thread.sleep(2000);
	     driver.findElement(By.id("city")).click();
	     driver.findElement(By.xpath(data6)).click();Thread.sleep(2000);
	     //Thread.sleep(2000);
	     
	     driver.findElement(By.id("pharmapostalcode")).clear();Thread.sleep(1000);
	     driver.findElement(By.id("pharmapostalcode")).sendKeys(i7);//Postal Code
	     
	     driver.findElement(By.id("pharma-pc-name")).clear();Thread.sleep(1000);//Primary Contact Name
	     driver.findElement(By.id("pharma-pc-number")).clear();Thread.sleep(1000);//Primary Contact Number
	    // driver.findElement(By.id("pharma-pc-email")).clear();//Primary Contact Email
	     
	     driver.findElement(By.id("pharma-pc-name")).sendKeys(data8);//Primary Contact Name
	     driver.findElement(By.id("pharma-pc-number")).sendKeys(i9);//Primary Contact Number
	    // driver.findElement(By.id("pharma-pc-email")).sendKeys(data10);//Primary Contact Email
		
	     logger.info("Work Info Sucessful");
	     
	     driver.findElement(By.id("save-work-info")).click();Thread.sleep(4000);
	    // driver.findElement(By.xpath("//button[@type='button']")).click();Thread.sleep(2000);
	     
	     //Billing Info
		 driver.findElement(By.id("edit-billing-info")).click();
		 	
		 driver.findElement(By.id("pharma-bc-name")).clear();Thread.sleep(1000);//Primary Contact Name
	     driver.findElement(By.id("pharma-bc-number")).clear();Thread.sleep(1000);//Primary Contact Number
	     driver.findElement(By.id("pharma-bc-email")).clear();Thread.sleep(1000);//Primary Contact Email
		 
	     driver.findElement(By.id("pharma-bc-name")).sendKeys(data11);//Primary Contact Name
	     driver.findElement(By.id("pharma-bc-number")).sendKeys(i12);//Primary Contact Number
	     driver.findElement(By.id("pharma-bc-email")).sendKeys(data13);//Primary Contact Email
	     
	     
	     driver.findElement(By.id("save-billing-info")).click();Thread.sleep(4000);
	    // driver.findElement(By.xpath("//button[@type='button']")).click();Thread.sleep(2000);
		 
		 logger.info("Billing Info Sucessful");
	     
	     //Pharma Admin1
		 driver.findElement(By.id("edit-coords-info")).click();Thread.sleep(2000);
		 
		 driver.findElement(By.id("pharma-admin-name")).clear();Thread.sleep(1000);//Primary Contact Name
	     driver.findElement(By.id("pharma-admin-contact")).clear();Thread.sleep(1000);//Primary Contact Number
		 
	     driver.findElement(By.id("pharma-admin-name")).sendKeys(data14);//Primary Contact Name
	     driver.findElement(By.id("pharma-admin-contact")).sendKeys(i15);//Primary Contact Number
	     //driver.findElement(By.id("pharma-admin-email")).sendKeys(data16);//Primary Contact Email
	     
	     driver.findElement(By.id("save-coords")).click(); Thread.sleep(2000);
	    // driver.findElement(By.xpath("//button[@type='button']")).click();Thread.sleep(2000);
	     
	     logger.info("Pharma Admin Sucessful");
	     
	     Thread.sleep(2000);
	    // driver.findElement(By.id("add-pharma")).click();
	     logger.info("Edit Pharma Completed");
	     Thread.sleep(5000);
	     MyScreenRecorder.stopRecording();
	     Thread.sleep(5000);
	     driver.close();
	}
}}