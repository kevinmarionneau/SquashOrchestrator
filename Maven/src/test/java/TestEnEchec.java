import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEnEchec {

	@Test
	public void test1() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\kmarionneau\\eclipse-workspace\\Maven\\target\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.fr");

		driver.switchTo().frame(0);

		WebElement jaccepte = driver.findElement(By.id("introAgreeButton"));
		jaccepte.click();

		driver.switchTo().defaultContent();

		WebElement barreRecherche = driver.findElement(By.name("q"));
		barreRecherche.sendKeys("Lamantin");
		barreRecherche.submit();


		WebElement titre = driver.findElement(By.xpath("(//h2[@data-attrid='title']/span)[1]"));
		assertEquals("Otarie", titre.getText());

	}

}