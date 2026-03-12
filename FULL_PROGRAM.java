package Basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class FULL_PROGRAM {
	

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");

		driver.get("https://vinothqaacademy.com/mouse-event/");

		driver.manage().window().maximize();

		WebElement draggableElement=driver.findElement(By.xpath("//*[@id=\"draggableElement\"]"));

		WebElement droppableElement=driver.findElement(By.xpath("//*[@id=\"droppableElement\"]"));

		Actions ac=new Actions(driver);

		ac.dragAndDrop(draggableElement, droppableElement).build().perform();

		Thread.sleep(5000);

		

		//mouse over

		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"textbox\"]"));

		ac.moveToElement(textbox).perform();

		Thread.sleep(3000);

		

		//double click

		WebElement dclick=driver.findElement(By.id("dblclick"));

		ac.doubleClick(dclick).build().perform();

		

		//Right click

		Thread.sleep(6000);

	

		WebElement rightclick=d.findElement(By.xpath("//*[@id=\"rightclick\"]"));

		ac.contextClick(rightclick).build().perform();

		Thread.sleep(5000);

//		WebElement pop=d.findElement(By.xpath("//*[@id=\"myDiv\"]/ul/center[2]/a"));
//
//		pop.click();
//
//		Thread.sleep(3000);
//
//		WebElement al=d.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button"));
//
//		al.click();
//
//		Alert At=d.switchTo().alert();
//		At.accept();

		WebElement Form = d.findElement(By.xpath("//*[@id=\"myDiv\"]/ul/center[1]/a"));
		Form.click();
		
		Thread.sleep(3000);
		
		WebElement Fn = d.findElement(By.xpath("//*[@id=\"vfb-5\"]"));
		Fn.sendKeys("Sabarish");
		Thread.sleep(3000);
		
		WebElement Ln = d.findElement(By.xpath("//*[@id=\"vfb-7\"]"));
		Ln.sendKeys("2608");
		Thread.sleep(3000);
		
		WebElement Rb = d.findElement(By.xpath("//*[@id=\"vfb-31-1\"]"));
		Rb.click();
		Thread.sleep(3000);
		
		
		
	}
}

