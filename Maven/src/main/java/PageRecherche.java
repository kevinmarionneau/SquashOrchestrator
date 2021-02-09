import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRecherche {
	
	protected WebDriver driver;
	
	private By titre = By.xpath("(//h2[@data-attrid='title']/span)[1]");
	
	
	
	

	  
	  public PageRecherche(WebDriver driver) {
		this.driver = driver;
	}



	public String TitrePageRecherche() {
		  
		return driver.findElement(titre).getText();
		  
	  }
	

}
