package variousconcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {

	
	public static void main(String[] args) {
		System.out.println("First Selenium");
		Scanner ui = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://codefios.com/ebilling/ ");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();

		driver.manage().window().maximize();
		
		
		//driver.close();
		ui.close();
		
	}
}
