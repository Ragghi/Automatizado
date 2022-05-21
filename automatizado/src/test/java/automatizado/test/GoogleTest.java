package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseTest
{
    @Test
    public void devePesquisarNoGoogle()
    {
        iniciar();

        WebElement inputPesquisa = driver.findElement(By.name("q"));  //No site do google, posiciona o cursor no elemento q do site, que no caso é o campo de busca
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Digita Batata frita e realiza a busca

        String resultado = driver.findElement(By.id("result-stats")).getText(); //Verifica o que contém dentro da variável result-stats do site

        assertTrue(resultado, resultado.contains("Aproximadamente")); //testa se está escrito Aproximadamente na variável pesquisada acima
    }
}
