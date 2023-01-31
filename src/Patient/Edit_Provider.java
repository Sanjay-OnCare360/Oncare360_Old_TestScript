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
public class Edit_Provider{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Update_Provider.xlsx");
		
		Logger logger=LogManager.getLogger(Edit_Provider.class);
		
		
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
		String data4=sheet1.getRow(1).getCell(4).getStringCellValue();
		String data5=sheet1.getRow(1).getCell(5).getStringCellValue();
		
		int data6=(int) sheet1.getRow(1).getCell(6).getNumericCellValue();
		String i6=String.valueOf(data6);
		
		int data7=(int) sheet1.getRow(1).getCell(7).getNumericCellValue();
		String i7=String.valueOf(data7);
		
		int data8=(int) sheet1.getRow(1).getCell(8).getNumericCellValue();
		String i8=String.valueOf(data8);
		
	
		
		logger.info("Login Sucess");
		
		//MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		logger.info("Login Sucess");
		
		
		driver.findElement(By.xpath("//a[@aria-controls=\"provider\"]")).click();Thread.sleep(3000);//Provider Tab
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(data2);
		//driver.findElement(By.id("searchprovider")).sendKeys(data2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href=\"/oncare/view-edit/PR0000025\"]")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[1]")).click();Thread.sleep(2000);//Edit Work Information

	    driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[1]")).click();
		driver.findElement(By.id("addprovider-type")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Doctor\"]")).click();//Type
		
		driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[2]")).click();
		driver.findElement(By.id("Qualification")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\" Master of Science in Medicine\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[3]")).click();
		driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Specification\"]")).click();
		driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Cardiologist\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[1]")).sendKeys(i6);Thread.sleep(1000);
		
		driver.findElement(By.id("save-personal-info")).click();
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[2]")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.id("cancel-btn")).click();Thread.sleep(2000);
		// driver.findElement(By.id("yes")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[2]")).clear();Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id=\"addprovider-mobile\"])[2]")).sendKeys(i7);
		
		driver.findElement(By.xpath("//span[.='Save Changes ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for=\"Both\"]")).click();	Thread.sleep(2000);
		driver.findElement(By.id("save-personal-info")).click();
	    Thread.sleep(5000);
	    MyScreenRecorder.stopRecording();
	    Thread.sleep(5000);
	    driver.close();
	}
}
