package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook {

	public static WebDriver driver;

	@Given("^Utilisateur sur la page d'accueil$")
	public void utilisateur_sur_la_page_d_acceuil() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@When("^Utilisateur saisir adresse email valide$")
	public void utilsateur_saisir_adresse_email_valide() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("abc.xyz@gmail.com");
	}

	@When("^utilisateur saisir MP valide$")
	public void utilasateur_saisir_MP_valide() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("abc");
	}

	@When("^Cliquer sur bouton connexion$")
	public void cliquer_sur_bouton_connexion() throws Throwable {
		//driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
	
	}
	


	@Then("^La connexion reussite$")
	public void la_connexion_reussite() throws Throwable {
		System.out.println("LogIN UNSuccessfully");
		driver.close();

	}
}
