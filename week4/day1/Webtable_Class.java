package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Class {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	
	//selecting train from search bar
	WebElement trainFrom = driver.findElement(By.id("txtStationFrom"));
	trainFrom.clear(); //clearing existing data
	trainFrom.sendKeys("MS",Keys.TAB); //typing MS- Chennai Egmore and pressing tab key from key board
	
	//selecting train from search bar
	WebElement trainTo = driver.findElement(By.id("txtStationTo"));
	trainTo.clear();
	trainTo.sendKeys("MDU",Keys.TAB);  //typing MDU- Madurai and pressing tab key from key board
	
	//uncheck the SOtr On Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
	//find table
	WebElement elementTable = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]"));
	
	//fine lit of rows inside the table using table
	List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
	System.out.println("Total No of Rows:"+elementRows.size());
	System.out.println("Total No of cols:"+elementRows.get(1).getSize());//wrong
	
	//using list of rows we can fetch one by one column
//	for(int i=1;i<elementRows.size();i++) {
//		//one row
//		WebElement elementRow = elementRows.get(i);
//		//get list of column using 1 row
//		List<WebElement> elementColumns = elementRow.findElements(By.tagName("td"));
//		
//		for(int j=0;j<elementColumns.size();j++) {
//			//one column
//			WebElement elementColumn = elementColumns.get(j);
//			System.out.print(elementColumn.getText()+" | ");
//		}
//		System.out.println("\n"+"-------------------------------------------------------------------------------------------------------------------------------------");
//	}
//	
	//div[@id='divTrainsList']/table[1]/tbody/tr 
	
	List<String> list1 = new ArrayList<String>();
	for(int i=1;i<elementRows.size();i++) {
		//one row
		WebElement elementRow = elementRows.get(i);
		//get list of column using 1 row
		List<WebElement> elementColumns = elementRow.findElements(By.tagName("td"));
		String trainName = elementColumns.get(1).getText();
		System.out.println(trainName);
		list1.add(trainName);
		
	}
	System.out.println("-------------------------------------------------------");
//	//we can sort by clicking on the train name
//	 WebElement elementTrain = driver.findElement(By.xpath("//b[text()='Train Name']"));  //not working 
//	 elementTrain.click();
//	 

	driver.findElement(By.linkText("Train Name")).click();
	
	
	List<String> list2= new ArrayList<String>();
	//fetching train names alone
	for(int i=1;i<elementRows.size();i++) {
		//one row
		WebElement elementRow = elementRows.get(i);
		//get list of column using 1 row
		List<WebElement> elementColumns = elementRow.findElements(By.tagName("td"));
		 String trainName = elementColumns.get(1).getText();
		System.out.println(trainName);
		list2.add(trainName);
	}
	
	
	//sort list1 and compare with list2
	Collections.sort(list1);
	boolean equals = list1.equals(list2);
	System.out.println(equals);
}
}
