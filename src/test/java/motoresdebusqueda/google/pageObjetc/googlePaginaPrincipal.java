package motoresdebusqueda.google.pageObjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class googlePaginaPrincipal extends PageObject {

    @FindBy (css = "input[name='q']")
    WebElementFacade cuadroDeBusqueda;

    @FindBy(css = "style+center>input.gNO89b")
    WebElementFacade botonBuscar;

    @FindBy(css = "ul.erkvQe>li:first-child")
    WebElementFacade sugerencia;

    public void ingresarPalabraClave(String palabraClave) {
        cuadroDeBusqueda.type(palabraClave);
    }

    public void realizarBusquedaConBoton() {
        botonBuscar.click();
    }

    public void realizarBusquedaConSugerencia() {
        sugerencia.click();
    }
}
