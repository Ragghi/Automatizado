package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
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
    public void TC0001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita() //TC é teste control, um padrão utilizado para testes.
    {
        googlePage.pesquisar("Batata frita"); //Digita Batata frita e realiza a busca

        String resultado = googlePage.obterResultadoDaPesquisa(); //Verifica o que contém dentro da variável result-stats do site

        assertTrue(resultado, resultado.contains("Aproximadamente")); //testa se está escrito Aproximadamente na variável pesquisada acima
    }

    @Test
    public void TC002_deveSerPossivelPesquisarNoGoogleOTextoNutella() //TC é teste control, um padrão utilizado para testes.
    {
        googlePage.pesquisar("Nutella"); //Digita Nutella e realiza a busca

        String resultado = googlePage.obterResultadoDaPesquisa(); //Verifica o que contém dentro da variável result-stats do site

        assertTrue(resultado, resultado.contains("resultados")); //testa se está escrito resultados na variável pesquisada acima
    }
}
