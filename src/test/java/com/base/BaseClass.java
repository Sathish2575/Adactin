package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	/**
	 * 
	 * @author Sathish Kumar
	 * @Description User to maintain the reusable methods
	 * @Date 21-Sep-2022
	 *
	 */
	public static class Base_Class {
		public static WebDriver driver;

		/**
		 * @Description User to get property files
		 * @param Key
		 * @return String
		 * @throws FileNotFoundException
		 * @throws IOException
		 */

		public String getPropertyFileValue(String Key) throws FileNotFoundException, IOException {
			Properties properties = new Properties();
			properties.load(new FileInputStream(System.getProperty("user.dir") + "\\Config\\Config.properties"));
			return (String) properties.getProperty(Key);

		}

		/**
		 * @Description Used to switch browser type
		 * @param browerType
		 */

		public static void getDriver(String browerType) {
			switch (browerType) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				break;
			}
		}

		/**
		 * @Descrption Used to take Screenshot
		 * @return byte[]
		 */

		public byte[] getScreeenShot() {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
			return b;

		}

		/**
		 * @Descrption Used to get a driver
		 */
		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		/**
		 * @Descrption Used to get a url
		 * @param url
		 */
		public static void getUrl(String url) {
			driver.get(url);
		}

		/**
		 * @Descrption Used to maximize window
		 */

		public static void Maximizewindow() {
			driver.manage().window().maximize();
		}

		/**
		 * @Descrption Used to find an element by Id
		 * @param attributeValue
		 * @return WebElement
		 */
		public WebElement elementfindbyid(String attributeValue) {

			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}

		/**
		 * @Descrption Used to find an element by Name
		 * @param attributeValue
		 * @return WebElement
		 */

		public WebElement elementfindbyname(String attributeValue) {

			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}

		/**
		 * @Descrption Used to find an element by Classname
		 * @param attributeValue
		 * @return WebElement
		 */

		public WebElement elementfindbyclassName(String attributeValue) {

			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}

		/**
		 * @Descrption Used to find an element by xpath
		 * @param xpathvalue
		 * @return WebElement
		 */

		public WebElement elementfindbyxpath(String xpathvalue) {

			WebElement element = driver.findElement(By.xpath(xpathvalue));
			return element;
		}

		/**
		 * @Descrption Used to send a input data
		 * @param element
		 * @param data
		 */

		public void elementSendkeys(WebElement element, String data) {
			element.sendKeys(data);

		}

		/**
		 * @Descrption Used to click an element
		 * @param element
		 */

		public void elementclick(WebElement element) {
			element.click();
		}
		/**
		 * @Descrption Used to clear an element
		 * @param element
		 */
		
		public void elementclear(WebElement element) {
			element.clear();
		}

		/**
		 * @Descrption Used to get Text
		 * @param element
		 * @return String
		 */

		public String elementGetText(WebElement element) {
			String text = element.getText();
			return text;

		}

		/**
		 * @Descrption Used to get attribute value
		 * @param element
		 * @return String
		 */

		public String elementGetAttributeValue(WebElement element) {
			String attributevalue = element.getAttribute("value");
			return attributevalue;
		}

		/**
		 * @Descrption Used to selecting option by Text
		 * @param element
		 * @param text
		 */

		public void SelectoptionbyText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		/**
		 * @Descrption Used to selecting option by attribute
		 * @param element
		 * @param text
		 */

		public void Selectoptionbyattribute(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

		/**
		 * @Descrption Used to selecting option by index
		 * @param element
		 * @param text
		 */
		public void Selectoptionbyindex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		/**
		 * @Descrption Used to accept alert
		 */
		public void acceptAlert() {
			Alert al = driver.switchTo().alert();
			al.accept();
		}

		/**
		 * @Descrption Used to dismiss alert
		 */

		public void dismissAlert() {
			Alert al = driver.switchTo().alert();
			al.dismiss();
		}
		/**
		 * @Descrption used to close a window
		 */
		public static void closewindow() {
			driver.close();
		}
		/**
		 * @Descrption Used to switch to window
		 * @param nameOrHandle
		 */

		public void switchToWindow(String nameOrHandle) {
			driver.switchTo().window(nameOrHandle);
		}

		/**
		 * @Descrption Used to get a cell value from excel
		 * @param SheetName
		 * @param rownum
		 * @param cellnum
		 * @return String
		 * @throws IOException
		 */
		public String getExcelCellValue(String SheetName, int rownum, int cellnum) throws IOException {
			String res = null;
			File file = new File("C:\\Users\\msant\\eclipse-workspace\\MavenPro\\excel\\HotelBooking.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType Type = cell.getCellType();
			switch (Type) {
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
					res = dateFormat.format(dateCellValue);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long check = Math.round(numericCellValue);
					if (check == numericCellValue) {
						res = String.valueOf(check);

					} else {
						res = String.valueOf(numericCellValue);
					}
				}
				break;

			default:
				break;
			}
			return res;
		}

		/**
		 * @Descrption Used to write a data in excel
		 * @param sheetName
		 * @param rownum
		 * @param cellnum
		 * @param value
		 * @throws IOException
		 */
		public void writeexceldata(String sheetName, int rownum, int cellnum, String value) throws IOException {
			File file = new File("C:\\Users\\msant\\eclipse-workspace\\MavenPro\\excel\\HotelBooking.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell createCell = row.createCell(cellnum);
			createCell.setCellValue(value);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}
	}

}
