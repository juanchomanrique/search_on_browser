package motoresdebusqueda.google.pageObjetc;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class googlePaginaResultados extends PageObject {

    public static final String TITULO_RESULTADO_ESPERADO = "//h3[contains(@class,'LC20lb DKV0Md') and contains(.,'{0}')]";


    public void entrarAPaginaEsperada(String tituloBuscado) {
        findBy(TITULO_RESULTADO_ESPERADO,tituloBuscado)
                .then().click();
    }

    public void validaPaginaEsperada(String urlEsperada) {
        WebDriver driver = getDriver();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, urlEsperada );
    }

}
