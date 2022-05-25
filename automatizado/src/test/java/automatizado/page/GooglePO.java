package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO 
{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesauisa;

    /**
     * Construtor para criação da página do Google
     * @param driver Driver da página do Google.
     */
    public GooglePO(WebDriver driver) 
    {
        super(driver);
    }

    /**
     * Metodo que vai efetuar uma pesquisa no google baseado no texto informado e concluindo com enter.
     * @param texto Texto a ser pesquisado.
     */
    public void pesquisar(String texto)
    {
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Método que retorna o resultado aproximado da pesquisa.
     * @return Retorna o resultado da pesquisa.
     */
    public String obterResultadoDaPesquisa()
    {
        return divResultadoPesauisa.getText();
    }
    
}
