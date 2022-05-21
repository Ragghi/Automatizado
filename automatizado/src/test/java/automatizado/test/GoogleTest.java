package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest 
{    
    private WebDriver driver;
    private final String URL_BASE = "https://google.com/";
    private final String CAMINHO_DRIVER = "/Users/ragghi/Documents/Automatizado/automatizado/src/test/java/automatizado/resource/chromedriver-v10104951";

    private void iniciar()
    {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver(); //abre o navegador
        driver.manage().window().maximize(); //maximixa o navegador
        driver.get(URL_BASE); //ao abrir o navegador será carregada a URL_BASE
    }

    @Test
    public void devePesquisarNoGoogle()
    {
        iniciar();

        WebElement inputPesquisa = driver.findElement(By.name("q"));  //No site do google, posiciona o cursor no elemento q do site, que no caso é o campo de busca
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Digita Batata frita e realiza a busca

        String resultado = driver.findElement(By.id("result-stats")).getText(); //Verifica o que contém dentro da variável result-stats do site

        assertTrue(resultado, resultado.contains("Aproximadamente")); //testa se está escrito Aproximadamente na variável pesquisada acima

        driver.quit(); //fecha o navegador
    }
}
