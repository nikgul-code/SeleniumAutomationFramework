package com.practice.qa.baseclasses;

import java.io.FileInputStream;
import java.util.Properties;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.practice.qa.utils.environmentVariables;
import com.practice.qa.utils.TimeOutUtils;


public class TestBase 
{
    public static WebDriver driver;
    public static Properties prop;
    static String baseURL;
    
    public TestBase()
    {
    	try 
    	{
    		prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/com/practice/qa/config/config.properties");
            prop.load(fis);
        }
    	catch (Exception e) 
    	{
            e.printStackTrace();
        }
    }
    
    public static void Init()
    {
    	String browser = prop.getProperty("browser").toLowerCase();

    	driver = switch (browser) {
    	    case "chrome" -> new ChromeDriver();
    	    case "edge"   -> new EdgeDriver();
    	    
    	    default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
    	};
    	
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeOutUtils.ImplicitWait));
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeOutUtils.PageLoadTimeout));
    	
    	baseURL = prop.getProperty("url");
    	driver.get(baseURL);
        
    };

    }

