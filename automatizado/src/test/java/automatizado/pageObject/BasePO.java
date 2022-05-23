package automatizado.pageObject;

/**
 * Classe base para criação das novas PagesObjects.
 * Todas as pages devem ser herdadas desta classe.
 */
public abstract BasePO 
{
    /**Driver base que será usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory)
     * 
     */
    @param driver
    protected BasePO(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
