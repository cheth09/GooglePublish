package functions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Function {
WebDriver wd;
	
	private WebDriverWait wait;
	
	public Function(WebDriver wd,WebDriverWait wait) {
		this.wd=wd;
		this.wait=wait;
	}

	
	@Test
	public void clickById(String id) {
		wd.findElement(By.id(id)).click();
	}

	@Test
	public void clickByXpath(String xpath) {
		wd.findElement(By.xpath(xpath)).click();
	}

	@Test
	public void clearById(String id) {
		wd.findElement(By.id(id)).clear();
	}

	@Test
	public void clearByXpath(String xpath) {
		wd.findElement(By.xpath(xpath)).clear();
	}

	@Test
	public void waitForElementById(String id){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		
	}
	@Test
	public void waitForElementByXpath(String xpath){
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		
	}
	@Test
	public void sendValueByXpath(String xpath,String value){
		wd.findElement(By.xpath(xpath)).sendKeys(value);
		
	}
	
	@Test
	public void waitForElementByName(String name){
		wd.findElement(By.name(name));
	}
	
	@Test
	public void scroll(String xpath) throws InterruptedException{
		 //implementing scrolling
		 Actions dragger = new Actions(wd);
		 int numberOfPixelsToDragTheScrollbarDown = 30;
		 for (int i=10;i<150;i=i+numberOfPixelsToDragTheScrollbarDown){
		 // this causes a gradual drag of the scroll bar, 10 units at a time
		 dragger.moveToElement(wd.findElement(By.xpath(xpath))).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
		 Thread.sleep(1000L);
		 }
	}
	
	@Test
	public void scrollUp(String xpath) throws InterruptedException{
		 //implementing scrolling
		 Actions dragger = new Actions(wd);
		 int numberOfPixelsToDragTheScrollbarUp = 10;
		 for (int i=10;i<150;i=i+numberOfPixelsToDragTheScrollbarUp){
		 // this causes a gradual drag of the scroll bar, 10 units at a time
		 dragger.moveToElement(wd.findElement(By.xpath(xpath))).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarUp).release().perform();
		 Thread.sleep(1000L);
		 }
	}
	
	@Test
	public void uploadByXpath(String xpath,String path) throws InterruptedException, IOException{
		 String parent_window1 = wd.getWindowHandle();
		//Runtime.getRuntime().exec(path);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		 wd.findElement(By.xpath(xpath)).click();
		 for (String Child_Window1 : wd.getWindowHandles()){
		 wd.switchTo().window(Child_Window1);
		 wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Runtime.getRuntime().exec(path).destroy();
		 }
		 wd.switchTo().window(parent_window1);
	}
	
	@Test
	public void uploadByXpathSlightly(String xpath,String path) throws InterruptedException, IOException{
		 String parent_window1 = wd.getWindowHandle();
		//Runtime.getRuntime().exec(path);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		 scroll(xpath);
		 wd.findElement(By.xpath(xpath)).click();
		 for (String Child_Window1 : wd.getWindowHandles()){
		 wd.switchTo().window(Child_Window1);
		 wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Runtime.getRuntime().exec(path).destroy();
		 }
		 wd.switchTo().window(parent_window1);
	}
	
	@Test
	public void uploadByID(String id,String path) throws InterruptedException, IOException{
		 String parent_window1 = wd.getWindowHandle();
		 Runtime.getRuntime().exec(path);
		 wd.findElement(By.id(id)).click();
		 for (String Child_Window1 : wd.getWindowHandles()){
		 wd.switchTo().window(Child_Window1);
		 wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Runtime.getRuntime().exec(path).destroy();
		 }
		 wd.switchTo().window(parent_window1);
	}
	@Test
	public void selectByXPath(String path,String value) throws InterruptedException, IOException{
		 new Actions(wd);
		 Select application_type = new Select(wd.findElement(By.xpath(path)));
		 application_type.selectByVisibleText(value);
		
		 Thread.sleep(3000);
	}
	@Test
	public void selectByID(String id,String value) throws InterruptedException, IOException{
		 Actions action = new Actions(wd);
		 Select application_type = new Select(wd.findElement(By.id(id)));
		 clickById(id);
		 application_type.selectByVisibleText(value);
		 action.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
	}
	
}
