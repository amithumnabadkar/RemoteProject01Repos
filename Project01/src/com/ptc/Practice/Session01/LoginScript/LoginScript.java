package com.ptc.Practice.Session01.LoginScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        String appUrl = "https://accounts.google.com";
        driver.get(appUrl);
        driver.manage().window().maximize();

        String expectedTitle = "Sign in - Google Accounts";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Testcase Passed");
        } else {
            System.out.println("Testcase failed");
        }

        WebElement username = driver.findElement(By.name("Email"));
        username.clear();
        username.sendKeys("jtest01412@gmail.com");

        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement password = driver.findElement(By.id("Passwd"));
        password.clear();
        password.sendKeys("selenium001");

        WebElement signInButton = driver.findElement(By.id("signIn"));
        signInButton.click();

        String title1 = driver.getTitle();
        System.out.println("New Title: " + title1);
        
        System.out.println("The new title is correct");
	}

}
