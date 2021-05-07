package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static void fill(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void buttonClick(WebElement element) {

		element.click();

	}

	public static void selectbyindex(WebElement element, int index) {
		// Select a=new Select(element);
		// a.selectByIndex(index);

		new Select(element).selectByIndex(index);

	}

	public static void selectByValue(WebElement element, String value) {

		new Select(element).selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {

		new Select(element).selectByVisibleText(value);
	}

	// getOptions
	public static List allOptions(WebElement element) {

		Select a = new Select(element);

		List allOptions = new ArrayList();

		List<WebElement> options = a.getOptions();

		for (WebElement eachOptions : options) {

			String data = eachOptions.getText();
			allOptions.add(data);

		}

		return allOptions;

	}

	public static String getFirstSelect(WebElement element) {

		return new Select(element).getFirstSelectedOption().getText();

	}

	public static String getAttributeValue(WebElement element) {

		return element.getAttribute("value");

	}

	public static String getTextValue(WebElement element) {

		return element.getText();

	}

	public static String readExcel(int row, int cell) throws IOException {
		File loc = new File("F:\\Eclipse-workspace\\POMFramework\\POM.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook work = new XSSFWorkbook(input);

		Sheet sheet = work.getSheet("Sheet1");

		Row r = sheet.getRow(row);

		Cell c = r.getCell(cell);

		int type = c.getCellType();

		String value ="";

		if (type == 1) {

			value = c.getStringCellValue();

		} else if (type == 0) {

			if (DateUtil.isCellDateFormatted(c)) {

				Date d = c.getDateCellValue();

				SimpleDateFormat f = new SimpleDateFormat("MM/DD/YYYY");
				value = f.format(d);

			}

			else {

				double d = c.getNumericCellValue();

				long l = (long) d;

				value = String.valueOf(l);

			}
			
		}
		return value;
	}
	
}
