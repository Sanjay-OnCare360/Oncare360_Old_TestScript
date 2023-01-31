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
public class Patient_Dashboard{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Patient_Dashboard.xlsx");
		
		
		Logger logger=LogManager.getLogger(Patient_Dashboard.class);
		
		
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
		
		logger.info("Chrome Open Sucess");
		
		//MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys(data0);
		driver.findElement(By.id("password")).sendKeys(data1);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		logger.info("Login Sucess");

		driver.findElement(By.xpath("(//input[@name=\"search-key\"])[1]")).sendKeys(data2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title=\"Patient Dashboard\"]")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		logger.info("Patient Dashboard Sucess");
		
		//Meds
		driver.findElement(By.id("presc-duration")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[1]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=6])[1]")).click();Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-250)");Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Summary']")).click();
		jse.executeScript("window.scrollBy(0,-250)");Thread.sleep(5000);
		logger.info("Meds Sucess");
		//AE
		driver.findElement(By.id("patient-ae")).click();Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();Thread.sleep(5000);//Draft
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();Thread.sleep(5000);//Active
		driver.findElement(By.xpath("(//button[@type=\"button\"])[6]")).click();Thread.sleep(5000);//Closed
		logger.info("AE Sucess");
		
		//Add AE
		driver.findElement(By.xpath("//button[.=' + Add AE ']")).click();Thread.sleep(2000); //Addd AE
		driver.findElement(By.xpath("(//input[@id=\"addae-date\"])[1]")).click();Thread.sleep(2000);//Date
		//driver.findElement(By.xpath("//button[@aria-label=\"Previous month\"]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label=\"May 5, 2022\"]")).click();//Date selection
		driver.findElement(By.xpath("//button[.='Set']")).click();
		driver.findElement(By.id("Category")).click();//Category
		driver.findElement(By.xpath("//div[.='Ear and labyrinth disorders']")).click();Thread.sleep(2000);
		driver.findElement(By.id("Symptom")).click();//Symptom
		driver.findElement(By.xpath("//div[.='Ear pain']")).click();Thread.sleep(2000);
		driver.findElement(By.id("Grade")).click();//Grade
		driver.findElement(By.xpath("//div[.=1]")).click();Thread.sleep(2000);
		driver.findElement(By.id("addae-note")).sendKeys("Automation Testing");//AE Note
		driver.findElement(By.xpath("//button[.='Add']")).click();Thread.sleep(5000);//Add AE - AE button
		logger.info("Add AE Sucess");
		
		//AE Action
		driver.findElement(By.xpath("//tr[@data-target='#expand_actions0']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' + Add Action ']")).click();Thread.sleep(2000);
		driver.findElement(By.id("actionitem-date")).click();
		driver.findElement(By.xpath("//td[@aria-label=\"May 6, 2022\"]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Set']")).click();
		driver.findElement(By.xpath("//ng-select[@placeholder=\"Select Action\"]")).click();
		driver.findElement(By.xpath("//div[.='Phone call']")).click(); Thread.sleep(2000);
		driver.findElement(By.id("actionitem-note")).sendKeys("Action Test");
		driver.findElement(By.xpath("//td[.='Adverse Event Details']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add Action']")).click();
		Thread.sleep(5000);
		logger.info("Add AE Action Sucess");
		
		//Close AE
		driver.findElement(By.xpath("//tr[@data-target='#expand_actions3']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.=' Close AE '])[4]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"clsaeDatetime\"]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label=\"May 6, 2022\"]")).click();
		driver.findElement(By.xpath("//button[.='Set']")).click();
		driver.findElement(By.xpath("//ng-select[@labelforid=\"closeae-outcome\"]")).click();
		driver.findElement(By.xpath("//div[.='Prescription Added']")).click(); Thread.sleep(2000);
		driver.findElement(By.id("closeae-note")).sendKeys("Close Test"); Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Adverse Event Details']")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Close AE']")).click();Thread.sleep(5000);
		logger.info("Close AE Sucess");
		
		
		//Vitals		
		jse.executeScript("window.scrollBy(0,-100)");Thread.sleep(5000);
		driver.findElement(By.id("patient-vitals")).click();Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#oxygen_status\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#temperature_status\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#bp_status\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.id("presc-duration")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[1]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=6])[1]")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#heart_rate\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#oxygen_status\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#temperature_status\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#bp_status\"]")).click(); Thread.sleep(3000);
		logger.info("Vitals Sucess");
		
		
		//Activity
		//jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		driver.findElement(By.id("patient-activity")).click();Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#exercise_stats\"]")).click();Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(7000);
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href=\"#sleep_status\"]")).click();Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(7000);
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(7000);
		driver.findElement(By.id("presc-duration")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[1]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=6])[1]")).click();Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href=\"#steps_stats\"]")).click(); Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(7000);
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href=\"#exercise_stats\"]")).click(); Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(7000);
		jse.executeScript("window.scrollBy(0,-150)");Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href=\"#sleep_status\"]")).click(); Thread.sleep(3000);
		logger.info("Vitals Sucess");
		jse.executeScript("window.scrollBy(0,250)");Thread.sleep(7000);
		jse.executeScript("window.scrollBy(0,-250)");Thread.sleep(7000);
		
		//Journal
		driver.findElement(By.id("patient-journal")).click();Thread.sleep(3000);
		driver.findElement(By.id("journal-duration")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[1]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=6])[1]")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href=\"#daily-notes\"]")).click();Thread.sleep(5000);
		logger.info("Journal Sucess");
		
		//Survey
		driver.findElement(By.id("patient-questionnaire")).click();Thread.sleep(3000);
		driver.findElement(By.id("presc-duration")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=1])[1]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[.=6])[1]")).click();Thread.sleep(5000);
		logger.info("Survey Sucess");
		
		//Message
		driver.findElement(By.id("patient-message")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label=\"Type a message\"]")).sendKeys("Message");Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"d-flex send-mic align-self-center\"]")).click();
		logger.info("Message Sucess");
		
		MyScreenRecorder.stopRecording();Thread.sleep(5000);
		}
		driver.close();
	}
}