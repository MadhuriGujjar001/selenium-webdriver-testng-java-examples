package com.examples.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by janesh on 7/6/2015.
 */
public class SelectItemsFromList {


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
        driver.findElement(By.cssSelector("#txtUsername")).clear();
        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("#txtPassword")).clear();
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");
        driver.findElement(By.cssSelector("#btnLogin")).click();

    }
}
