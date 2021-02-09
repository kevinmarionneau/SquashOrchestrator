import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPOMEchec {
	

	WebDriver driver;
	String recherche = "Lamantin";
	String url = "https://www.google.fr";

	
	//Configurer le WebDriver
	@Before
	public void ouvrirBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kmarionneau\\eclipse-workspace\\Maven\\target\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void testRecherche() throws InterruptedException {
		
		//Ouvrir le navigateur
		driver.get(url);
		
		//Instancier page d'accueil
		PageAccueilGoogle pageAccueilGoogle = new PageAccueilGoogle(driver);
		
		//Lancer la recherche
		PageRecherche pageRecherche = pageAccueilGoogle.lancerRecherche(recherche);
		Thread.sleep(1000);
		
		//Vérifier que titre à droitre correspond à la recherche faite
		assertEquals("Otarie", pageRecherche.TitrePageRecherche());
		
	}
	
	//Fermer le navigateur
	@After
	public void closeBrowser() {
		
		driver.close();
	}
	
}
