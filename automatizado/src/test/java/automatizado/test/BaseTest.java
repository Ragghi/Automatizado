package automatizado.test;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest 
{
    protected WebDriver driver;
    private static final String URL_BASE = "https://google.com/";
    private static final String CAMINHO_DRIVER = "/Users/ragghi/Documents/Automatizado/automatizado/src/test/java/automatizado/resource/chromedriver-v10104951"; 

    @BeforeClass //chama o metodo antes de qq outro método
    protected static void iniciar()
    {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver(); //abre o navegador
        driver.manage().window().maximize(); //maximixa o navegador
        driver.get(URL_BASE); //ao abrir o navegador será carregada a URL_BASE
    }

    @AfterClass
    protected static void finalizar()
    {
        driver.quit();
    }
}
