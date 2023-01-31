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
public class Edit_Patient{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver;
		//MyScreenRecorder.startRecording("main");
		String url="http://3.136.200.185/oncare/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purnak\\eclipse-workspace\\lib\\chromedriver.exe");
		File src=new File("C:\\Users\\purnak\\eclipse-workspace\\lib\\Excel_Data\\Edit_Patient.xlsx");
		
		
		Logger logger=LogManager.getLogger(Edit_Patient.class);
		
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		for(int i=1;i<=3;i++) {
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
		
		//String data2=sheet1.getRow(i).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(i).getCell(3).getStringCellValue();
		String data4=sheet1.getRow(i).getCell(4).getStringCellValue();
		
		//String data7=sheet1.getRow(i).getCell(7).getStringCellValue();
		String data8=sheet1.getRow(i).getCell(8).getStringCellValue();
		String data9=sheet1.getRow(i).getCell(9).getStringCellValue();
		String data10=sheet1.getRow(i).getCell(10).getStringCellValue();
		
		String data15=sheet1.getRow(i).getCell(15).getStringCellValue();
		String data16=sheet1.getRow(i).getCell(16).getStringCellValue();
		String data19=sheet1.getRow(i).getCell(19).getStringCellValue();
		//String data20=sheet1.getRow(i).getCell(20).getStringCellValue();
		
		//String data21=sheet1.getRow(i).getCell(21).getStringCellValue();
		//String data22=sheet1.getRow(i).getCell(22).getStringCellValue();
		//String data23=sheet1.getRow(i).getCell(23).getStringCellValue();
		String data24=sheet1.getRow(i).getCell(24).getStringCellValue();
		//String data25=sheet1.getRow(i).getCell(25).getStringCellValue();
		
		//String data26=sheet1.getRow(i).getCell(26).getStringCellValue();
		String data27=sheet1.getRow(i).getCell(27).getStringCellValue();
		String data28=sheet1.getRow(i).getCell(28).getStringCellValue();
		String data29=sheet1.getRow(i).getCell(29).getStringCellValue();
		String data30=sheet1.getRow(i).getCell(30).getStringCellValue();
		
		String data31=sheet1.getRow(i).getCell(31).getStringCellValue();
		String data32=sheet1.getRow(i).getCell(32).getStringCellValue();
		//String data33=sheet1.getRow(i).getCell(33).getStringCellValue();
		String data34=sheet1.getRow(i).getCell(34).getStringCellValue();
		String data35=sheet1.getRow(i).getCell(35).getStringCellValue();
		
		String data36=sheet1.getRow(i).getCell(36).getStringCellValue();
		String data37=sheet1.getRow(i).getCell(37).getStringCellValue();
		String data38=sheet1.getRow(i).getCell(38).getStringCellValue();
		//String data39=sheet1.getRow(i).getCell(39).getStringCellValue();
		String data40=sheet1.getRow(i).getCell(40).getStringCellValue();
		
		String data41=sheet1.getRow(i).getCell(41).getStringCellValue();
		String data42=sheet1.getRow(i).getCell(42).getStringCellValue();
		String data43=sheet1.getRow(i).getCell(43).getStringCellValue();
		//String data44=sheet1.getRow(i).getCell(44).getStringCellValue();
		//String data45=sheet1.getRow(i).getCell(45).getStringCellValue();
		
		//String data46=sheet1.getRow(i).getCell(46).getStringCellValue();
		//String data47=sheet1.getRow(i).getCell(47).getStringCellValue();
		//String data52=sheet1.getRow(i).getCell(52).getStringCellValue();
		String data53=sheet1.getRow(i).getCell(53).getStringCellValue();
		String data54=sheet1.getRow(i).getCell(54).getStringCellValue();
		String data55=sheet1.getRow(i).getCell(55).getStringCellValue();
		
		String data56=sheet1.getRow(i).getCell(56).getStringCellValue();
		String data57=sheet1.getRow(i).getCell(57).getStringCellValue();
		String data58=sheet1.getRow(i).getCell(58).getStringCellValue();
		String data59=sheet1.getRow(i).getCell(59).getStringCellValue();
		String data60=sheet1.getRow(i).getCell(60).getStringCellValue();
		
		String data61=sheet1.getRow(i).getCell(61).getStringCellValue();
		String data83=sheet1.getRow(i).getCell(83).getStringCellValue();
		
		logger.info("App open Sucess");
		
		//MyScreenRecorder.stopRecording();
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("novartispc1@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Novartis@123");
		driver.findElement(By.xpath("//span[@class=\"checkmark\"]")).click();
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(3000);
		logger.info("Login Sucess");
		
		driver.findElement(By.xpath("(//input[@name=\"search-key\"])[1]")).sendKeys("PT0000059");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title=\"View Details\"])[1]")).click();Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[1]")).click();
		Thread.sleep(2000);

	       
		driver.findElement(By.id("patient-name")).clear();
	       driver.findElement(By.id("patient-name")).sendKeys(data0);;// Patient Name
	       /*  
	       driver.findElement(By.id("p-dob")).click();
	       
	       Thread.sleep(5000);
	      
	       driver.findElement(By.xpath("//button[@aria-label=\"Choose month and year\"]")).click();//DOB
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/button[1]/span")).click();
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//td[@aria-label=\"2002\"]")).click();
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//td[@aria-label=\"June 2002\"]")).click();
	       
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath(data1)).click();
	      */ 
	      Thread.sleep(3000);
	       
	      // driver.findElement(By.xpath(data3)).click();
	       
	      driver.findElement(By.xpath("//ng-select[@ng-reflect-name=\"LanguagesKnown\"]")).click();
	      driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label='Hindi']")).click();Thread.sleep(1000);
	      driver.findElement(By.xpath("//ng-select[@ng-reflect-name=\"LanguagesKnown\"]")).click();
	      driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label='Telugu']")).click();
	      
	       int data2=(int) sheet1.getRow(i).getCell(2).getNumericCellValue();
			String i2=String.valueOf(data2);
			
			int data5=(int) sheet1.getRow(i).getCell(5).getNumericCellValue();
			String i5=String.valueOf(data5);
			
			int data6=(int) sheet1.getRow(i).getCell(6).getNumericCellValue();
			String i6=String.valueOf(data6);
	       
			//driver.findElement(By.id("patient-ssn")).clear();
	      // driver.findElement(By.id("patient-ssn")).sendKeys(i2);
	       
	       //driver.findElement(By.xpath(data4)).click();
	       
	       driver.findElement(By.id("patient-height")).clear();//Height
		      
	       driver.findElement(By.id("patient-height")).clear();//Weight
	       
	       driver.findElement(By.id("patient-weight")).sendKeys(i5);//Height
	      
	       driver.findElement(By.id("patient-weight")).sendKeys(i6);//Weight
	       
	       driver.findElement(By.xpath("(//*[@id=\"save-personal-info\"])[1]")).click();Thread.sleep(1000);
	       
	       int data7=(int) sheet1.getRow(i).getCell(2).getNumericCellValue();
			String i7=String.valueOf(data7);
	       
//	       driver.findElement(By.id("p-line")).sendKeys(i7);//Line
	     /*  
	       Select s = new Select(driver.findElement(By.id("p-country")));//Country
	       s.selectByVisibleText(data8);//
	       
	       Thread.sleep(3000);
	       
	       Select s1 = new Select(driver.findElement(By.id("p-state")));//State
	       s1.selectByVisibleText(data9);//data3
	       
	       Thread.sleep(3000);
	       
	       Select s2 = new Select(driver.findElement(By.id("p-city")));//City
	       s2.selectByVisibleText(data10);//data4
	   */    
	       

			 JavascriptExecutor jse = (JavascriptExecutor)driver;

//			 jse.executeScript("window.scrollBy(0,450)");
			 jse.executeScript("window.scrollBy(0,250)");
			 
			 Thread.sleep(3000);
			 
			driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[2]")).click();
			Thread.sleep(2000);
			
	       int data11=(int) sheet1.getRow(i).getCell(11).getNumericCellValue();
			String i11=String.valueOf(data11);
			
			int data12=(int) sheet1.getRow(i).getCell(12).getNumericCellValue();
			String i12=String.valueOf(data12);
			
			int data13=(int) sheet1.getRow(i).getCell(13).getNumericCellValue();
			String i13=String.valueOf(data13);
			
			int data14=(int) sheet1.getRow(i).getCell(14).getNumericCellValue();
			String i14=String.valueOf(data14);
			
			int data17=(int) sheet1.getRow(i).getCell(17).getNumericCellValue();
			String i17=String.valueOf(data17);
			
			int data18=(int) sheet1.getRow(i).getCell(18).getNumericCellValue();
			String i18=String.valueOf(data18);
	       
			 driver.findElement(By.id("patient-postalcode")).clear();//Postal Code
		       
		       driver.findElement(By.id("p-homenumber")).clear();//Home
		       
		       driver.findElement(By.id("tel")).clear();//Work
		       
		       driver.findElement(By.id("patient-postalcode")).sendKeys(i11);//Postal Code
	       
	       driver.findElement(By.id("p-homenumber")).sendKeys(i12);//Home
	       
	       driver.findElement(By.id("tel")).sendKeys(i13);//Work
	       
	       driver.findElement(By.id("p-line")).clear();
	       driver.findElement(By.id("p-line")).sendKeys("Lane4, 2nd Street");
	       
	       driver.findElement(By.xpath("(//*[@id=\"save-personal-info\"])[1]")).click();Thread.sleep(1000);
	       
//	       driver.findElement(By.id("p-mobilenumber")).clear();//Mobile
//	       driver.findElement(By.id("p-mobilenumber")).sendKeys(i14);//Mobile
	       
	     //  driver.findElement(By.id("p-email")).sendKeys(data15);//Email//
	       
	       driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[3]")).click();Thread.sleep(1000);
	       
	       driver.findElement(By.id("patient-pcname")).clear();//Primary Contact Name
	       
	       driver.findElement(By.id("patient-pcnumber")).clear();//Primary Contact Number
	       driver.findElement(By.id("patient-pcnumber")).sendKeys(i17);
	     //  driver.findElement(By.id("p-pcmobile")).clear();//Primary Contact Mobile Number
	       
	       driver.findElement(By.id("patient-pcname")).sendKeys(data16);//Primary Contact Name
	       
	       driver.findElement(By.id("patient-pcemail")).clear();//Primary Contact Email
	       driver.findElement(By.id("patient-pcemail")).sendKeys(data19);//Primary Contact Email
	       
	       driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[1]")).click();
	       driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Relation\"])[1]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Sibling\"]")).click();
	      
	       
	       
	       //driver.findElement(By.id("patient-pcnumber")).sendKeys(i17);//Primary Contact Number
	       
	       //driver.findElement(By.id("p-pcmobile")).sendKeys(i18);//Primary Contact Mobile Number
	       
	       
	     /*  
	       driver.findElement(By.id("p-scname")).sendKeys(data20);//Secondary Contact Name
	       
	       driver.findElement(By.id("p-scnumber")).sendKeys(data21);//Secondary Contact Number
	       
	       driver.findElement(By.id("p-scmobile")).sendKeys(data22);//Secondary Contact Mobile Number
	       
	       driver.findElement(By.id("p-scemail")).sendKeys(data23);//Secondary Contact Email
	       */
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[1]")).click();Thread.sleep(2000);
	       
	       logger.info("Patient Info Sucess");
	              
	      driver.findElement(By.xpath("//button[@class=\"btn btn-primary ml-2\"]")).click();
	       
	     //  driver.findElement(By.id("provider-tab")).click();
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4\"])[4]")).click();
	       Thread.sleep(1000);
	       
	       int data25=(int) sheet1.getRow(i).getCell(25).getNumericCellValue();
			String i25=String.valueOf(data25);
			
			int data26=(int) sheet1.getRow(i).getCell(26).getNumericCellValue();
			String i26=String.valueOf(data26);
	       
			
			driver.findElement(By.id("pcp-name")).clear();
		       
		       driver.findElement(By.id("pcp-npi")).clear();
		       
		      // driver.findElement(By.id("pcp-phone")).clear();
		       
		      // driver.findElement(By.id("pcp-location")).clear();
			
			
	       driver.findElement(By.id("pcp-name")).sendKeys(data24);
	       
	       driver.findElement(By.id("pcp-npi")).sendKeys(i25);
	       
	    //   driver.findElement(By.id("pcp-phone")).sendKeys(i26);
	       
	       driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[3]")).click();
	       driver.findElement(By.xpath("//ng-select[@placeholder=\"Select Qualification\"]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Doctor of Medicine (MD, Dr.MuD\"]")).click();
	       	       
	       driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[4]")).click();
	       driver.findElement(By.xpath("//ng-select[@placeholder=\"Select Specialization\"]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Other\"]")).click();
	       
	       driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[2]")).click();
	     //  driver.findElement(By.id("pcp-location")).sendKeys(data27);
	       
	       Thread.sleep(2000);
	       
	    //   Select s4 = new Select(driver.findElement(By.id("pcp-qualification")));
	      // s4.selectByVisibleText(data28);
	       
	      // Thread.sleep(2000);
	       
	      // driver.findElement(By.id("presc-medicine")).sendKeys(data29);
	       
	      // Thread.sleep(2000);
	       
	      //driver.findElement(By.id("searchoncologist")).click();
	      
	      logger.info("Provider Info Sucess");
	      
	      driver.findElement(By.xpath("(//button[@class=\"btn btn-primary ml-2\"])[2]")).click();
	    //driver.findElement(By.id("diagnosis-tab")).click();//Diagnosis&Treatment
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[1]")).click();
		  Thread.sleep(2000);
		  
		  int data33=(int) sheet1.getRow(i).getCell(33).getNumericCellValue();
			String i33=String.valueOf(data33);
	   
	      //Diagnosis
		/*	
			 driver.findElement(By.xpath("//*[@id=\"diag-condition1\"]")).clear();// Condition
			  driver.findElement(By.xpath("//*[@id=\"diag-severity1\"]")).clear();// Severity
			
	      driver.findElement(By.xpath("//*[@id=\"diag-condition1\"]")).sendKeys(data30);// Condition
		  driver.findElement(By.xpath("//*[@id=\"diag-severity1\"]")).sendKeys(data31);// Severity
		  //driver.findElement(By.xpath("//*[@id=\"diag-date1\"]")).click();Thread.sleep(2000);
		 // driver.findElement(By.xpath(data32)).click();Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"diag-tnm1\"]")).clear();//TNM Score
		  driver.findElement(By.xpath("//*[@id=\"diag-tnm1\"]")).sendKeys(i33);//TNM Score
		 // Select s14=new Select(driver.findElement(By.id("diag-status1")));//Status
		 // s14.selectByVisibleText(data34);
		  driver.findElement(By.xpath("//*[@id=\"diag-notes1\"]")).clear();
		  driver.findElement(By.xpath("//*[@id=\"diag-notes1\"]")).sendKeys(data35);//Notes
		  //driver.findElement(By.xpath("//*[@id=\"diagnosis\"]/form/div[1]/div[2]/div/div/button/span")).click();//Add New
		
		  jse.executeScript("window.scrollBy(0,250)");
		  jse.executeScript("window.scrollBy(0,250)");
		  
		*/	
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[5]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Disease\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Leukemia\"]")).click();
			
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[6]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"DiseaseStage\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Stage 0\"]")).click();
			
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[7]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"DiagnosisCondition\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Good\"]")).click();
			
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[8]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"DiagnosisSeverity\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Minor\"]")).click();
			
			driver.findElement(By.id("diag-date")).click();Thread.sleep(2000);
			driver.findElement(By.xpath(data32)).click(); Thread.sleep(2000);
			
			driver.findElement(By.id("diag-tnm")).clear();Thread.sleep(1000);
			driver.findElement(By.id("diag-tnm")).sendKeys("T3 N1 M0");
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[9]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"DiagnosisStatus\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"In Progress\"]")).click();
			
			driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[3]")).click();
			Thread.sleep(2000);
			
			
			//Prescription
		
			
			jse.executeScript("window.scrollBy(0,250)");
			
			driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[2]")).click();Thread.sleep(2000);
			/*	
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[5]")).click();
			driver.findElement(By.xpath("//ng-select[@placeholder=\"Search Prescriber\"]")).click();Thread.sleep(5000);
			driver.findElement(By.xpath(data36)).click();
		
			driver.findElement(By.id("button-addon2")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ng-select[@placeholder=\"Search Medicine\"]")).click();Thread.sleep(5000);
			driver.findElement(By.xpath(data37)).click();
			driver.findElement(By.xpath("(//button[@type=\"button\"])[8]")).click();
			
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[6]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"PrescriptionType\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@ng-reflect-ng-item-label=\"Capsule\"])")).click();Thread.sleep(1000);
			
			
			
			//driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[5]")).click();
			
*/
			
			
//			driver.findElement(By.xpath("//button[@data-target=\"#addmedicine\"]")).click();
//			driver.findElement(By.id("medicine-name")).sendKeys("Lopamide");
//			driver.findElement(By.xpath("(//button[@type=\"button\"])[7]")).click();
//			
			
//			
		/*	driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[7]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"PrescriptionDose\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Micrograms (mcg)\"]")).click();Thread.sleep(1000);
			
			driver.findElement(By.id("patient-qty")).clear();
			driver.findElement(By.id("patient-qty")).sendKeys("200");Thread.sleep(1000);
		*/
		/*	
			driver.findElement(By.id("presc-duration")).click(); Thread.sleep(1000);
			driver.findElement(By.xpath("(//td[@class=\"active available start-date ng-star-inserted\"])[1]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"diagnosis\"]/div[2]/form/div/div[1]/div[2]/div/div[6]/div/span/ngx-daterangepicker-material/div/div[3]/div/table/tbody/tr[1]/td[4]")).click();Thread.sleep(2000);
		*/	
		/*	driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[8]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"PrescriptionPeriod\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Daily\"]")).click();Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[9]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"PrescriptionFrequency\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"3\"]")).click();Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[10]")).click();
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"WhenToTakePill\"]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Before Meal\"]")).click();Thread.sleep(1000);
			
			//Daily
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).sendKeys("0900AM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).sendKeys("0200PM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).sendKeys("1000PM");
		*/	
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).clear();
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).sendKeys("0200AM");
//			
	/*		
			//Weekly
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Day\"])[1]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Monday\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Day\"])[2]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Wednesday\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Day\"])[3]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Thursday\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Day\"])[4]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Saturday\"]")).click();
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).sendKeys("0900AM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).sendKeys("0200PM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).sendKeys("1000PM");
			
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).clear();
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).sendKeys("0200AM");
//			
				
		*/
	
			/*
			//Monthly
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Date\"])[1]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"2\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Date\"])[2]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"16\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Date\"])[3]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"18\"]")).click();
			
			driver.findElement(By.xpath("(//ng-select[@placeholder=\"Select Date\"])[4]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"25\"]")).click();
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[1]")).sendKeys("0900AM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[2]")).sendKeys("0200PM");
			
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).clear();
			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).sendKeys("1000PM");
			
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).clear();
//			driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[4]")).sendKeys("0200AM");
			
			*/
			driver.findElement(By.id("presc-notes")).clear();
			driver.findElement(By.id("presc-notes")).sendKeys("Take the medications on time");
			
			driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[3]")).click();Thread.sleep(2000);
			
						
		/* 
		  //Prescription
		  driver.findElement(By.xpath("//*[@id=\"presc-prescriber1\"]")).sendKeys(data36);//Prescriber
		  driver.findElement(By.id("button-addon2")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("medicine-search")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("medicine-search")).sendKeys(data37);//Search
		  Thread.sleep(3000);
		  driver.findElement(By.id("selectmedicine")).click();
	      
	      Select s6 = new Select(driver.findElement(By.id("presc-period1")));
	      s6.selectByVisibleText(data38);//frequency
	      
	      int data39=(int) sheet1.getRow(i).getCell(39).getNumericCellValue();
			String i39=String.valueOf(data39);
	      
	      Select s7 = new Select(driver.findElement(By.id("presc-frequency1")));//Medicine Search Button
	      s7.selectByVisibleText(i39);
	      
	      driver.findElement(By.id("presc-time1")).sendKeys(data40);//Timing1
	      driver.findElement(By.id("presc-time2")).sendKeys(data41);//Timing1
	      driver.findElement(By.id("presc-time3")).sendKeys(data42);//Timing1
	      //driver.findElement(By.id("presc-time4")).sendKeys(data43);//Timing1
	    /*  
	      driver.findElement(By.id("presc-day1")).sendKeys(data44);//Timing1
	      driver.findElement(By.id("weektime1")).sendKeys(data40);//Timing1
	      driver.findElement(By.id("presc-day2")).sendKeys(data45);//Timing1
	      driver.findElement(By.id("weektime2")).sendKeys(data41);//Timing1
	      driver.findElement(By.id("presc-day3")).sendKeys(data46);//Timing1
	      driver.findElement(By.id("weektime3")).sendKeys(data42);//Timing1
	      driver.findElement(By.id("presc-day4")).sendKeys(data47);//Timing1
	      driver.findElement(By.id("weektime4")).sendKeys(data43);//Timing1
	      
	      int data48=(int) sheet1.getRow(i).getCell(48).getNumericCellValue();
			String i48=String.valueOf(data48);
			
	      Select s48 = new Select(driver.findElement(By.id("presc-frequency1")));//Medicine Search Button
	      s7.selectByVisibleText(i48);
	      
	      int data49=(int) sheet1.getRow(i).getCell(49).getNumericCellValue();
			String i49=String.valueOf(data49);
	      
	      Select s49 = new Select(driver.findElement(By.id("presc-frequency1")));//Medicine Search Button
	      s7.selectByVisibleText(i49);
	      
	      int data50=(int) sheet1.getRow(i).getCell(50).getNumericCellValue();
			String i50=String.valueOf(data50);
			
	      Select s50 = new Select(driver.findElement(By.id("presc-frequency1")));//Medicine Search Button
	      s7.selectByVisibleText(i50);
	      
	      int data51=(int) sheet1.getRow(i).getCell(51).getNumericCellValue();
			String i51=String.valueOf(data51);
	      
	      Select s51 = new Select(driver.findElement(By.id("presc-frequency1")));//Medicine Search Button
	      s7.selectByVisibleText(i51);
	      
	      //driver.findElement(By.id("monthly1")).sendKeys(s48);//Timing1
	      driver.findElement(By.id("monthtime1")).sendKeys(data40);//Timing1
	      //driver.findElement(By.id("monthly2")).sendKeys(i49);//Timing1
	      driver.findElement(By.id("monthtime2")).sendKeys(data41);//Timing1
	      //driver.findElement(By.id("monthly3")).sendKeys(i50);//Timing1
	      driver.findElement(By.id("monthtime3")).sendKeys(data42);//Timing1
	      //driver.findElement(By.id("monthly4")).sendKeys(i51);//Timing1
	      driver.findElement(By.id("monthtime4")).sendKeys(data43);//Timing1
	      //////////////////////////////////////////////////
	      
	      int data52=(int) sheet1.getRow(i).getCell(52).getNumericCellValue();
			String i52=String.valueOf(data52);
	      
	      Select s8 = new Select(driver.findElement(By.id("presc-dose1")));//Medicine Search Button
	      s8.selectByVisibleText(i52);
	      Select s9 = new Select(driver.findElement(By.id("presc-unit1")));//Medicine Search Button
	      s9.selectByVisibleText(data53);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"presc-start1\"]")).click();
	      Thread.sleep(3000);
	     // driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-3\"]/div[2]/owl-date-time-calendar/div[1]/button[2]/span")).click();Thread.sleep(3000);
          driver.findElement(By.xpath(data54)).click();//Start Date
	      Thread.sleep(3000);
	      driver.findElement(By.id("presc-end1")).click();
	      Thread.sleep(3000);
	     // driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-4\"]/div[2]/owl-date-time-calendar/div[1]/button[2]/span")).click();Thread.sleep(3000);
	      driver.findElement(By.xpath(data55)).click();//End Date
	      Thread.sleep(3000);
	      
	      
		  driver.findElement(By.id("presc-notes1")).sendKeys(data56);//Instructions
		//  driver.findElement(By.xpath("")).click();//Add New
*/
		  Thread.sleep(2000);
//		  jse1.executeScript("window.scrollBy(0,450)");Thread.sleep(2000);
//		  jse1.executeScript("window.scrollBy(0,250)");Thread.sleep(2000);
		  //Allergies
		  //Thread.sleep(3000);
		//  Select s10 = new Select(driver.findElement(By.id("allergy-name1")));//Allergy Name
	    //  s10.selectByVisibleText(data57);
	    //  Select s11 = new Select(driver.findElement(By.id("allergy-category1")));//Category
	    //  s11.selectByVisibleText(data58);
	     // Thread.sleep(3000);
		 // driver.findElement(By.xpath("//*[@id=\"allergy-date1\"]")).click();//Date Recorded
		 // Thread.sleep(3000);
		  //driver.findElement(By.xpath(data59)).click();//Start Date
		 // Thread.sleep(3000);
		//  Select s12 = new Select(driver.findElement(By.id("allergy-status1")));//Status
	     // s12.selectByVisibleText(data60); 
		  
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[3]")).click();
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[2]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Allergy\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Latex Allergy\"]")).click();
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[3]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"AllergySeverity\"]")).click();
			driver.findElement(By.xpath("(//span[@ng-reflect-ng-item-label=\"Minor\"])[2]")).click();
			
			driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[4]")).click();Thread.sleep(1000);
			driver.findElement(By.xpath("//ng-select[@formcontrolname=\"AllergyStatus\"]")).click();
			driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Open\"]")).click();
			
			driver.findElement(By.id("allergy-notes")).click();Thread.sleep(1000);
			driver.findElement(By.id("allergy-notes")).sendKeys("Allergy Notes");
			driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[@class=\"btn btn-primary ml-2\"])[3]")).click();Thread.sleep(3000);
			
			
			
			
			
	     /* 
		 // driver.findElement(By.id("allergy-notes1")).sendKeys(data61);//Notes
		  
		  logger.info("Daignosis & Treatment Sucess");
		  
	       JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	       
	       jse2.executeScript("window.scrollBy(0,-450)");
	       
	       JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	       
	       jse3.executeScript("window.scrollBy(0,-450)");
	       */
	    //   Thread.sleep(3000);
	       
//	       driver.findElement(By.xpath("//*[@id=\"targets-tab\"]")).click();
//	       Thread.sleep(3000);
			
			//Targets & Notes
	       
	       int data62=(int) sheet1.getRow(i).getCell(62).getNumericCellValue();
			String i62=String.valueOf(data62);
			
			int data63=(int) sheet1.getRow(i).getCell(63).getNumericCellValue();
			String i63=String.valueOf(data63);
			
			int data64=(int) sheet1.getRow(i).getCell(64).getNumericCellValue();
			String i64=String.valueOf(data64);
			
			int data65=(int) sheet1.getRow(i).getCell(65).getNumericCellValue();
			String i65=String.valueOf(data65);
			
			int data66=(int) sheet1.getRow(i).getCell(66).getNumericCellValue();
			String i66=String.valueOf(data66);
			
			int data67=(int) sheet1.getRow(i).getCell(67).getNumericCellValue();
			String i67=String.valueOf(data67);
			
			int data68=(int) sheet1.getRow(i).getCell(68).getNumericCellValue();
			String i68=String.valueOf(data68);
			
			int data69=(int) sheet1.getRow(i).getCell(69).getNumericCellValue();
			String i69=String.valueOf(data69);
			
			int data70=(int) sheet1.getRow(i).getCell(70).getNumericCellValue();
			String i70=String.valueOf(data70);
			
			int data71=(int) sheet1.getRow(i).getCell(71).getNumericCellValue();
			String i71=String.valueOf(data71);
			
			int data72=(int) sheet1.getRow(i).getCell(72).getNumericCellValue();
			String i72=String.valueOf(data72);
			
			int data73=(int) sheet1.getRow(i).getCell(73).getNumericCellValue();
			String i73=String.valueOf(data73);
			
			int data74=(int) sheet1.getRow(i).getCell(74).getNumericCellValue();
			String i74=String.valueOf(data74);
			
			int data75=(int) sheet1.getRow(i).getCell(75).getNumericCellValue();
			String i75=String.valueOf(data75);
			
			int data76=(int) sheet1.getRow(i).getCell(76).getNumericCellValue();
			String i76=String.valueOf(data76);
			
			int data77=(int) sheet1.getRow(i).getCell(77).getNumericCellValue();
			String i77=String.valueOf(data77);
			
			int data78=(int) sheet1.getRow(i).getCell(78).getNumericCellValue();
			String i78=String.valueOf(data78);
			
			int data79=(int) sheet1.getRow(i).getCell(79).getNumericCellValue();
			String i79=String.valueOf(data79);
			
			int data80=(int) sheet1.getRow(i).getCell(80).getNumericCellValue();
			String i80=String.valueOf(data80);
			
			int data81=(int) sheet1.getRow(i).getCell(81).getNumericCellValue();
			String i81=String.valueOf(data81);
			
			int data82=(int) sheet1.getRow(i).getCell(82).getNumericCellValue();
			String i82=String.valueOf(data82);
	
			
			driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[4]")).click();
			Thread.sleep(2000);
			
		       driver.findElement(By.id("target-steps")).clear();
		       driver.findElement(By.id("target-exercise")).clear();
		       driver.findElement(By.id("target-sleep")).clear();
		       
		       
		       driver.findElement(By.id("target-steps")).sendKeys(i62);
		       driver.findElement(By.id("target-exercise")).sendKeys(i63);
		       driver.findElement(By.id("target-sleep")).sendKeys(i64);
		       
		       driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[4]")).click(); Thread.sleep(2000);
		       
		       driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[5]")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.id("p-heartrate")).clear();
	       driver.findElement(By.id("p-heartrate")).sendKeys(i65);
	       
	       driver.findElement(By.xpath("//input[@formcontrolname=\"HeartRateMin\"]")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"HeartRateMax\"]")).clear();
	       driver.findElement(By.id("p-systolic")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"SystolicBPMin\"]")).clear();
	       
	       
	       driver.findElement(By.xpath("//input[@formcontrolname=\"HeartRateMin\"]")).sendKeys(i66);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"HeartRateMax\"]")).sendKeys(i67);
	       driver.findElement(By.id("p-systolic")).sendKeys(i68);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"SystolicBPMin\"]")).sendKeys(i69);
	      
	       
	       driver.findElement(By.xpath("//input[@formcontrolname=\"SystolicBPMax\"]")).clear();
	       driver.findElement(By.id("p-diastolic")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"DiastolicBPMin\"]")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"DiastolicBPMax\"]")).clear();
	       

	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"SystolicBPMax\"]")).sendKeys(i70);
	       driver.findElement(By.id("p-diastolic")).sendKeys(i71);Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"DiastolicBPMin\"]")).sendKeys(i72);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"DiastolicBPMax\"]")).sendKeys(i73);
	       
	       
	       
	       driver.findElement(By.id("p-temperature")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"TemperatureMin\"]")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"TemperatureMax\"]")).clear();
	       driver.findElement(By.id("p-spo2")).clear();
	       
	       
	       driver.findElement(By.id("p-temperature")).sendKeys(i74);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"TemperatureMin\"]")).sendKeys(i75);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"TemperatureMax\"]")).sendKeys(i76);
	       driver.findElement(By.id("p-spo2")).sendKeys(i77);
	       
	       driver.findElement(By.xpath("//input[@formcontrolname=\"Spo2Min\"]")).clear();
	       driver.findElement(By.xpath("//input[@formcontrolname=\"Spo2Max\"]")).clear();
	       driver.findElement(By.id("p-weight")).clear();
	       driver.findElement(By.id("weight-min")).clear();
	       
	       
	       driver.findElement(By.xpath("//input[@formcontrolname=\"Spo2Min\"]")).sendKeys(i78);
	       driver.findElement(By.xpath("//input[@formcontrolname=\"Spo2Max\"]")).sendKeys(i79);
	       driver.findElement(By.id("p-weight")).sendKeys(i80);
	       driver.findElement(By.id("weight-min")).sendKeys(i81);
	       
	       
	       driver.findElement(By.id("weight-max")).clear();
	       driver.findElement(By.id("patienttarget-notes")).clear();	       
	       
	       driver.findElement(By.id("weight-max")).sendKeys(i82);
	       driver.findElement(By.id("patienttarget-notes")).sendKeys(data83);
	       
	       logger.info("Target & Notes Success");
	       
	       driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[4]")).click();Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("(//button[@class=\"btn btn-primary-outline btn-sm mr-4 ng-star-inserted\"])[6]")).click();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[5]")).click();
	       driver.findElement(By.xpath("//ng-select[@formcontrolname=\"SelectQtn\"]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Novartis Survey\"]")).click();
	       /*
	       driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[6]")).click();
	       driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Frequency\"]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Weekly\"]")).click();
	      
	       driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).clear();
	       driver.findElement(By.xpath("(//input[@id=\"question-duration\"])[3]")).sendKeys("0300PM");
	    
	      // driver.findElement(By.xpath("(//span[@title=\"Clear all\"])[8]")).click();
	       driver.findElement(By.xpath("//ng-select[@formcontrolname=\"Day\"]")).click();
	       driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label=\"Thursday\"]")).click();
	       */
	       driver.findElement(By.xpath("(//button[@id=\"save-personal-info\"])[3]")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.id("btn-update-patient")).click();//ADD PATIENT
	       MyScreenRecorder.stopRecording();
	       
	       driver.close();
	}
}
}
