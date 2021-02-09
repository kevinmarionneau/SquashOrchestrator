import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAccueilGoogle {

	protected WebDriver driver;

	private By jaccepte = By.id("introAgreeButton");
	private By barreRecherche = By.name("q");

	public PageAccueilGoogle(WebDriver driver) {
		this.driver = driver;
	}

	public PageRecherche lancerRecherche(String recherche) {

		driver.switchTo().frame(0);

		driver.findElement(jaccepte).click();
		
		driver.switchTo().defaultContent();

		driver.findElement(barreRecherche).sendKeys(recherche);
		driver.findElement(barreRecherche).submit();

		return new PageRecherche(driver);
	}

}
