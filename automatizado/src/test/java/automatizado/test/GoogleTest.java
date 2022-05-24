package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import automatizado.page.GooglePO;

public class GoogleTest extends BaseTest
{

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes()
    {
        googlePage = new GooglePO(driver);
    }


    @Test
    public void devePesquisarNoGoogle()
    {
        iniciar();
       
       googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER); //Digita Batata frita e realiza a busca

        String resultado = googlePage.divResultadoPesauisa.getText(); //Verifica o que contém dentro da variável result-stats do site

        assertTrue(resultado, resultado.contains("Aproximadamente")); //testa se está escrito Aproximadamente na variável pesquisada acima
    }
}
