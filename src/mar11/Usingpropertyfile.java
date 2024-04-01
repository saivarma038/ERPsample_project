package mar11;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Usingpropertyfile {

	public static void main(String[] args) throws Throwable{
		Properties conpro = new Properties();
		conpro.load(new FileInputStream("Obj.properties"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys("Admin");
        driver.findElement(By.xpath(conpro.getProperty("objpass"))).sendKeys("Admin");
        driver.findElement(By.xpath(conpro.getProperty("objlogin"))).click();
        driver.findElement(By.xpath(conpro.getProperty("objBranches"))).click();
        driver.findElement(By.xpath(conpro.getProperty("objnewbranch"))).click();
        driver.findElement(By.xpath(conpro.getProperty("objBranchname"))).sendKeys("amerpeet");
        driver.findElement(By.xpath(conpro.getProperty("objAdd1"))).sendKeys("hyderabad");
        driver.findElement(By.xpath(conpro.getProperty("objAdd2"))).sendKeys("srnagar");
        driver.findElement(By.xpath(conpro.getProperty("objAdd3"))).sendKeys("kphp");
        driver.findElement(By.xpath(conpro.getProperty("objArea"))).sendKeys("moosapet");
        driver.findElement(By.xpath(conpro.getProperty("objZip"))).sendKeys("50139");
        new Select(driver.findElement(By.xpath(conpro.getProperty("objcountry")))).selectByIndex(1);
        new Select(driver.findElement(By.xpath(conpro.getProperty("objstate")))).selectByIndex(1);
        new Select(driver.findElement(By.xpath(conpro.getProperty("objcity")))).selectByIndex(1);
        driver.findElement(By.xpath(conpro.getProperty("objsubmit"))).click();
        String alerttext =driver.switchTo().alert().getText();
        System.out.println(alerttext);
        driver.switchTo().alert().accept();
        driver.quit();
	}

}
