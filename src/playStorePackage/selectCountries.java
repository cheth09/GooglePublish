package playStorePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.Test;

public class selectCountries {
	WebDriver wd;
	@Test
	public selectCountries(WebDriver wd){
		this.wd = wd;
	}
	@Test
	public void selectcountry(String id,String name,String status) throws Exception{
		//  JavascriptExecutor js = (JavascriptExecutor)wd;

		switch(name.toUpperCase()){
		case "ALBANIA" :{
			WebElement element1 =  wd.findElement(By.xpath(id));
			//identifying element
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ALBANIA is selected successfully");
			break;  
		}
		case "ALGERIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ALGERIA is selected successfully");
			break;  
		}
		case "ANGOLA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ANGOLA is selected successfully");
			break;  
		}
		case "ANTIGUA AND BARBUDA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ANTIGUA AND BARBUDA is selected successfully");
			break;  
		}
		case "ARGENTINA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ARGENTINA is selected successfully");
			break;  
		}
		case "ARMENIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ARMENIA is selected successfully");
			break;  
		}
		case "ARUBA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("ARUBA is selected successfully");
			break;  
		}
		case "AUSTRALIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("AUSTRALIA is selected successfully");
			break;  
		}
		case "AUSTRIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("AUSTRIA is selected successfully");
			break;  
		}
		case "AZERBAIJAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("AZERBAIJAN is selected successfully");
			break;  
		}
		case "BAHAMAS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			Coordinates coordinate = ((Locatable)element1).getCoordinates();
			coordinate.inViewPort();
			element1.click();
			System.out.println("BAHAMAS is selected successfully");
			break;  
		}
		case "BAHRAIN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[10]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BAHRAIN is selected successfully");
			break;  
		}
		case "BANGLADESH" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[11]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BANGLADESH is selected successfully");
			break;  
		}
		case "BELARUS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[12]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BELARUS is selected successfully");
			break;  
		}
		case "BELGIUM" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[13]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BELGIUM is selected successfully");
			break;  
		}
		case "BELIZE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[14]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BELIZE is selected successfully");
			break;  
		}
		case "BENIN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[15]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BENIN is selected successfully");
			break;  
		}
		case "BOLIVIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[16]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BOLIVIA is selected successfully");
			break;  
		}
		case "BOSNIA AND HERZEGOVINA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[17]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BOSNIA AND HERZEGOVINA is selected successfully");
			break;  
		}
		case "BOTSWANA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[18]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BOTSWANA is selected successfully");
			break;  
		}
		case "BRAZIL" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[19]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[22]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BRAZIL is selected successfully");
			break;  
		}
		case "BULGARIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[20]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BULGARIA is selected successfully");
			break;  
		}
		case "BURKINA FASO" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[21]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("BURKINA FASO is selected successfully");
			break;  
		}
		case "CAMBODIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[22]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CAMBODIA is selected successfully");
			break;  
		}
		case "CAMEROON" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[23]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CAMEROON is selected successfully");
			break;  
		}
		case "CANADA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[24]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CANADA is selected successfully");
			break;  
		}
		case "CAPE VERDE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[25]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CAPE VERDE is selected successfully");
			break;  
		}
		case "CHILE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[26]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CHILE is selected successfully");
			break;  
		}
		case "CHINA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[27]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CHINA is selected successfully");
			break;  
		}
		case "COLOMBIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[28]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[32]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("COLOMBIA is selected successfully");
			break;  
		}
		case "COSTA RICA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[29]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("COSTA RICA is selected successfully");
			break;  
		}
		case "COTE D IVOIRE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[30]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("Côte d’Ivoire is selected successfully");
			break;  
		}
		case "CROATIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[31]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CROATIA is selected successfully");
			break;  
		}
		case "CUBA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[32]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CUBA is selected successfully");
			break;  
		}
		case "CYPRUS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[33]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CYPRUS is selected successfully");
			break;  
		}
		case "CZECH REPUBLIC" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[34]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("CZECH REPUBLIC is selected successfully");
			break;  
		}
		case "DENMARK" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[35]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("DENMARK is selected successfully");
			break;  
		}
		case "DOMINICAN REPUBLIC" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[36]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[39]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("DOMINICAN REPUBLIC is selected successfully");
			break;  
		}
		case "ECUADOR" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[37]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[41]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ECUADOR is selected successfully");
			break;  
		}
		case "EGYPT" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[38]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("EGYPT is selected successfully");
			break;  
		}
		case "EL SALVADOR" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[39]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("EL SALVADOR is selected successfully");
			break;  
		}
		case "ESTONIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[40]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ESTONIA is selected successfully");
			break;  
		}
		case "FIJI" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[41]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("FIJI is selected successfully");
			break;  
		}
		case "FINLAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[42]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("FINLAND is selected successfully");
			break;  
		}
		case "FRANCE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[43]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("FRANCE is selected successfully");
			break;  
		}
		case "GABON" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[44]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GABON is selected successfully");
			break;  
		}
		case "GERMANY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[45]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[49]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GERMANY is selected successfully");
			break;  
		}
		case "GHANA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[46]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GHANA is selected successfully");
			break;  
		}
		case "GREECE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[47]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GREECE is selected successfully");
			break;  
		}
		case "GUATEMALA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[48]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GUATEMALA is selected successfully");
			break;  
		}
		case "GUINEA-BISSAU" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[49]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("GUINEA-BISSAU is selected successfully");
			break;  
		}
		case "HAITI" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[50]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("HAITI is selected successfully");
			break;  
		}
		case "HONDURAS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[51]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("HONDURAS is selected successfully");
			break;  
		}
		case "HONG KONG" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[52]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("HONG KONG is selected successfully");
			break;  
		}
		case "HUNGARY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[53]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("HUNGARY is selected successfully");
			break;  
		}
		case "ICELAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[54]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[58]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ICELAND is selected successfully");
			break;  
		}
		case "INDIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[55]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("INDIA is selected successfully");
			break;  
		}
		case "INDONESIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[56]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("INDONESIA is selected successfully");
			break;  
		}
		case "IRAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[57]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("IRAN is selected successfully");
			break;  
		}
		case "IRELAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[58]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("IRELAND is selected successfully");
			break;  
		}
		case "ISRAEL" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[59]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ISRAEL is selected successfully");
			break;  
		}
		case "ITALY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[60]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ITALY is selected successfully");
			break;  
		}
		case "JAMAICA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[61]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("JAMAICA is selected successfully");
			break;  
		}
		case "JAPAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[62]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("JAPAN is selected successfully");
			break;  
		}
		case "JORDAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[63]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[67]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("JORDAN is selected successfully");
			break;  
		}
		case "KAZAKHSTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[64]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("KAZAKHSTAN is selected successfully");
			break;  
		}
		case "KENYA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[65]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("KENYA is selected successfully");
			break;  
		}
		case "KUWAIT" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[66]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("KUWAIT is selected successfully");
			break;  
		}
		case "KYRGYZSTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[67]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("KYRGYZSTAN is selected successfully");
			break;  
		}
		case "LAOS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[68]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LAOS is selected successfully");
			break;  
		}
		case "LATVIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[69]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LATVIA is selected successfully");
			break;  
		}
		case "LEBANON" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[70]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LEBANON is selected successfully");
			break;  
		}
		case "LIECHTENSTEIN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[71]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[75]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LIECHTENSTEIN is selected successfully");
			break;  
		}
		case "LITHUANIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[72]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[76]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LITHUANIA is selected successfully");
			break;  
		}
		case "LUXEMBOURG" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[73]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[77]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("LUXEMBOURG is selected successfully");
			break;  
		}
		case "MACEDONIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[74]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MACEDONIA is selected successfully");
			break;  
		}
		case "MALAYSIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[75]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MALAYSIA is selected successfully");
			break;  
		}
		case "MALI" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[76]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MALI is selected successfully");
			break;  
		}
		case "MALTA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[76]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MALTA is selected successfully");
			break;  
		}
		case "MAURITIUS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[77]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MAURITIUS is selected successfully");
			break;  
		}
		case "MEXICO" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[78]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MEXICO is selected successfully");
			break;  
		}
		case "MOLDOVA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[79]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[84]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MOLDOVA is selected successfully");
			break;  
		}
		case "MOROCCO" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[80]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MOROCCO is selected successfully");
			break;  
		}
		case "MOZAMBIQUE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[81]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[86]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MOZAMBIQUE is selected successfully");
			break;  
		}
		case "MYANMAR" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[82]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[87]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("MYANMAR is selected successfully");
			break;  
		}
		case "NAMIBIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[83]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NAMIBIA is selected successfully");
			break;  
		}
		case "NEPAL" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[84]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NEPAL is selected successfully");
			break;  
		}
		case "NETHERLANDS" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[85]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NETHERLANDS is selected successfully");
			break;  
		}
		case "NETHERLANDS ANTILLES" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[86]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[91]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NETHERLANDS ANTILLES is selected successfully");
			break;  
		}
		case "NEW ZEALAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[87]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[92]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NEW ZEALAND is selected successfully");
			break;  
		}
		case "NICARAGUA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[88]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NICARAGUA is selected successfully");
			break;  
		}
		case "NIGER" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[89]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NIGER is selected successfully");
			break;  
		}
		case "NIGERIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[90]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NIGERIA is selected successfully");
			break;  
		}
		case "NORWAY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[91]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[96]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("NORWAY is selected successfully");
			break;  
		}
		case "OMAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[93]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[98]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("OMAN is selected successfully");
			break;  
		}
		case "PAKISTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[93]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PAKISTAN is selected successfully");
			break;  
		}
		case "PANAMA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[94]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PANAMA is selected successfully");
			break;  
		}
		case "PAPUA NEW GUINEA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[95]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PAPUA NEW GUINEA is selected successfully");
			break;  
		}
		case "PARAGUAY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[96]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[101]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PARAGUAY is selected successfully");
			break;  
		}
		case "PERU" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[97]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[102]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PERU is selected successfully");
			break;  
		}
		case "PHILIPPINES" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[98]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PHILIPPINES is selected successfully");
			break;  
		}
		case "POLAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[99]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("POLAND is selected successfully");
			break;  
		}
		case "PORTUGAL" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[100]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("PORTUGAL is selected successfully");
			break;  
		}
		case "QATAR" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[101]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[106]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("QATAR is selected successfully");
			break;  
		}
		case "ROMANIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[102]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[107]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ROMANIA is selected successfully");
			break;  
		}
		case "RUSSIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[103]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();;
			System.out.println("RUSSIA is selected successfully");
			break;  
		}
		case "RWANDA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[104]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("RWANDA is selected successfully");
			break;  
		}
		case "SAUDI ARABIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[105]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SAUDI ARABIA is selected successfully");
			break;  
		}
		case "SENEGAL" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[106]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[111]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SENEGAL is selected successfully");
			break;  
		}
		case "SERBIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[107]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[112]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SERBIA is selected successfully");
			break;  
		}
		case "SINGAPORE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[108]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SINGAPORE is selected successfully");
			break;  
		}
		case "SLOVAKIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[109]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SLOVAKIA is selected successfully");
			break;  
		}
		case "SLOVENIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[110]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SLOVENIA is selected successfully");
			break;  
		}
		case "SOUTH AFRICA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[111]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[116]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SOUTH AFRICA is selected successfully");
			break;  
		}
		case "SOUTH KOREA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[112]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[117]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SOUTH KOREA is selected successfully");
			break;  
		}
		case "SPAIN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[113]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SPAIN is selected successfully");
			break;  
		}
		case "SRI LANKA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[114]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SRI LANKA is selected successfully");
			break;  
		}
		case "SWEDEN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[115]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SWEDEN is selected successfully");
			break;  
		}
		case "SWITZERLAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[116]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[121]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("SWITZERLAND is selected successfully");
			break;  
		}
		case "TAIWAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[117]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[122]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TAIWAN is selected successfully");
			break;  
		}
		case "TAJIKISTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[118]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TAJIKISTAN is selected successfully");
			break;  
		}
		case "TANZANIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[119]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TANZANIA is selected successfully");
			break;  
		}
		case "THAILAND" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[120]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("THAILAND is selected successfully");
			break;  
		}
		case "TOGO" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[121]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[126]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TOGO is selected successfully");
			break;  
		}
		case "TRINIDAD AND TOBAGO" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[122]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[125]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TRINIDAD AND TOBAGO is selected successfully");
			break;  
		}
		case "TUNISIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[123]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TUNISIA is selected successfully");
			break;  
		}
		case "TURKEY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[124]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TURKEY is selected successfully");
			break;  
		}
		case "TURKMENISTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[125]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("TURKMENISTAN is selected successfully");
			break;  
		}
		case "UGANDA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[126]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[131]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UGANDA is selected successfully");
			break;  
		}
		case "UKRAINE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[127]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[132]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UKRAINE is selected successfully");
			break;  
		}
		case "UNITED ARAB EMIRATES" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[128]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UNITED ARAB EMIRATES is selected successfully");
			break;  
		}
		case "UNITED KINGDOM" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[129]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UNITED KINGDOM is selected successfully");
			break;  
		}
		case "UNITED STATES" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[130]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UNITED STATES is selected successfully");
			break;  
		}
		case "URUGUAY" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[131]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[136]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("URUGUAY is selected successfully");
			break;  
		}
		case "UZBEKISTAN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[132]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[137]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("UZBEKISTAN is selected successfully");
			break;  
		}
		case "VENEZUELA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[133]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("VENEZUELA is selected successfully");
			break;  
		}
		case "VIETNAM" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[134]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("VIETNAM is selected successfully");
			break;  
		}
		case "YEMEN" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[135]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("YEMEN is selected successfully");
			break;  
		}
		case "ZAMBIA" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[136]/td/div/label/input"));
			WebElement element3 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[140]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element3).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ZAMBIA is selected successfully");
			break;  
		}
		case "ZIMBABWE" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[137]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("ZIMBABWE is selected successfully");
			break;  
		}
		case "REST OF THE WORLD" :{
			WebElement element1 = wd.findElement(By.xpath(id));
			WebElement element2 = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div[2]/div[3]/div/div/div/div/div[3]/div/div[2]/div/div/table/tbody/tr[138]/td/div/label/input"));
			Actions actions = new Actions(wd);
			actions.moveToElement(element1).perform();
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			actions.moveToElement(element2).perform();
			element1.click();
			System.out.println("REST OF THE WORLD is selected successfully");
			break;  
		}  
		default : break; 

		}

	}
}
