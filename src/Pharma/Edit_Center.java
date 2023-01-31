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

public class Edit_Center {
	
		
	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		//String j;
		String url="http://3.19.203.161/pharma/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Edit_Center.xlsx");
		
		Logger logger=LogManager.getLogger("Edit_Center.class");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//PropertyConfigurator.configure("Log4j.properties");
	
		
		for(int i=1;i<2;i++) {
		String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(1).getCell(1).getStringCellValue();
		String data2=sheet1.getRow(i).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(i).getCell(3).getStringCellValue();
		String data4=sheet1.getRow(i).getCell(4).getStringCellValue();
		String data5=sheet1.getRow(i).getCell(5).getStringCellValue();
		String data6=sheet1.getRow(i).getCell(6).getStringCellValue();
		
		String data8=sheet1.getRow(i).getCell(8).getStringCellValue();
		String data10=sheet1.getRow(i).getCell(10).getStringCellValue();
		String data12=sheet1.getRow(i).getCell(12).getStringCellValue();
		String data13=sheet1.getRow(i).getCell(13).getStringCellValue();
		String data7=sheet1.getRow(i).getCell(7).getStringCellValue();
		String data16=sheet1.getRow(i).getCell(16).getStringCellValue();
		String data17=sheet1.getRow(i).getCell(17).getStringCellValue();
		
		int data11=(int) sheet1.getRow(i).getCell(11).getNumericCellValue();
		String i11=String.valueOf(data11);
		
		int data9=(int) sheet1.getRow(i).getCell(9).getNumericCellValue();
		String i9=String.valueOf(data9);
		
		int data14=(int) sheet1.getRow(i).getCell(14).getNumericCellValue();
		String i14=String.valueOf(data14);
		
				
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);logger.info("Login Sucessful");
		
		driver.findElement(By.id("search-record")).sendKeys(data16);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"font-semibold\"])[3]")).click();
			
		driver.findElement(By.id("search-record")).sendKeys(data17);
		Thread.sleep(3000);
		driver.findElement(By.id("view-info")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-center")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("center-add-description")).clear();
		driver.findElement(By.id("center-add-description")).sendKeys(data3);//Pharma Description
		Thread.sleep(2000);
		
		driver.findElement(By.id("save-network")).click();Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@type=\"button\"]")).click();Thread.sleep(2000);
		
		logger.info("Add Netowrk Page");
		
		//Work-Information
		
		driver.findElement(By.id("edit-contact-info")).click();Thread.sleep(2000);
		
		driver.findElement(By.id("center-add-addresslane1")).clear();
		driver.findElement(By.id("center-add-addresslane2")).clear();
		
		driver.findElement(By.id("center-add-addresslane1")).sendKeys(data4);
		driver.findElement(By.id("center-add-addresslane2")).sendKeys(data5);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[1]")).click();
		 driver.findElement(By.id("country")).click();
		 driver.findElement(By.xpath(data6)).click();
	     //Thread.sleep(2000);
	    		
		 //driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[2]")).click();Thread.sleep(1000);
	     driver.findElement(By.id("state")).click();Thread.sleep(1000);
	     driver.findElement(By.xpath(data7)).click();
	     //Thread.sleep(2000);
	     
	     //driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[3]")).click();Thread.sleep(1000);
	     driver.findElement(By.id("city")).click();Thread.sleep(1000);
	     driver.findElement(By.xpath(data8)).click();
	    
	     driver.findElement(By.id("center-add-postalcode")).clear();
	     driver.findElement(By.id("center-add-postalcode")).sendKeys(i9);//Postal Code
	     
	     logger.info("Work Info Sucessful");
	     
	     driver.findElement(By.id("center-add-pc-name")).clear();//Primary Contact Name
	     driver.findElement(By.id("center-add-pc-number")).clear();//Primary Contact Number
	     driver.findElement(By.id("center-add-pc-email")).clear();//Primary Contact Email
	     
	     driver.findElement(By.id("center-add-pc-name")).sendKeys(data10);//Primary Contact Name
	     driver.findElement(By.id("center-add-pc-number")).sendKeys(i11);//Primary Contact Number
	     driver.findElement(By.id("center-add-pc-email")).sendKeys(data12);//Primary Contact Email
		
		driver.findElement(By.id("save-contact-info")).click();Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@type=\"button\"]")).click();Thread.sleep(2000);
	     
	    logger.info("Primary Contact Details Sucessful");
	     
	     //Program Coordinators	     
	     driver.findElement(By.id("edit-admins")).click();Thread.sleep(2000);
	     
	     driver.findElement(By.id("pc-admin-name")).clear();//Primary Contact Name
	     driver.findElement(By.id("pc-admin-contact")).clear();//Primary Contact Number
	    // driver.findElement(By.id("pc-admin-email")).clear();//Primary Contact Email
	     
	     driver.findElement(By.id("pc-admin-name")).sendKeys(data13);//Primary Contact Name
	     driver.findElement(By.id("pc-admin-contact")).sendKeys(i14);//Primary Contact Number
	    // driver.findElement(By.id("pc-admin-email")).sendKeys(data15);//Primary Contact Email
	     
	     driver.findElement(By.id("save-admins")).click();Thread.sleep(2000);
	   //  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();Thread.sleep(2000);
	     
	     //Thread.sleep(5000);
	     
	     logger.info("Center updated Sucessfully");
	     
//	     MyScreenRecorder.stopRecording();
	     Thread.sleep(2000);
	     driver.close();
	     
			}
}
}