/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Uma
 */
public class UmaStepDefinitions {
       private static WebDriver driver;
    private String baseUrl; 
 
    
    @Given("^user is already on Bulletin Home Page$")
public void user_is_already_on_Bulletin_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);
    baseUrl = "https://bamboo-gardens.com/";
    driver.manage().window().maximize();
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("[title=\"IBG Bulletin\"]")).click();
    Thread.sleep(2000);

}

@Then("^user enters data name emaile$")
public void user_enters_data_name_emaile() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
     driver.findElement(By.id("Name")).click();
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Arti Verma");
    Thread.sleep(2000);
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("ackuselenium@gmail.com");
    Thread.sleep(2000);

   
}

@Then("^user clicks on Schaumburg on Select Location Page$")
public void user_clicks_on_Schaumburg_on_Select_Location_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    new Select(driver.findElement(By.xpath("(//select[@id='Location'])[2]"))).selectByVisibleText("Chicago, IL - Schaumburg");
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='contact_form_fields']/div[4]")).click();

    
}

@Then("^user enters captcha code on Bulletin Page$")
public void user_enters_captcha_code_on_Bulletin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).clear();
    driver.findElement(By.name("Captcha")).sendKeys("5738");

    
}

@Then("^user clicks on Submit Form on Bulletin Page$")
public void user_clicks_on_Submit_Form_on_Bulletin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.xpath("//input[@value='Send']")).click();
}

@Then("^user closes the browser for bulletin$")
public void user_closes_the_browser_for_bulletin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.close();
}


    
   }
