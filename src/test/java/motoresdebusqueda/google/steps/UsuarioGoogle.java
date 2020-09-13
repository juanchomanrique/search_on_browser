package motoresdebusqueda.google.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresdebusqueda.google.pageObjetc.googlePaginaPrincipal;
import motoresdebusqueda.google.pageObjetc.googlePaginaResultados;
import net.thucydides.core.annotations.Steps;

public class UsuarioGoogle {

    @Steps
    googlePaginaPrincipal paginaPrincipal;
    @Steps
    googlePaginaResultados paginaResultados;

    @Given("^I’m on the Google homepage$")
    public void ingresa_a_google() {
        paginaPrincipal.setDefaultBaseUrl("https://www.google.com");
        paginaPrincipal.open();
    }

    @When("^I type “(.*)” into the search field$")
    public void busca_palabra_clave(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
    }

    @And("^I click the Google Search button$")
    public void click_en_boton_de_busqueda(){
        paginaPrincipal.realizarBusquedaConBoton();
    }
    @And("^I click on the first suggestion in the list displayed$")
    public void click_en_primera_sugerencia(){
        paginaPrincipal.realizarBusquedaConSugerencia();
    }

    @And("^click on the title: “(.*)” in the results page$")
    public void selecciona_titulo_de_resultado(String tituloBuscado){
        paginaResultados.entrarAPaginaEsperada(tituloBuscado);
    }

    @Then("I go to the expected page: “(.*)”")
    //Se compara la página a la que ingresó con la esperada
    public void valida_pagina(String urlEsperada) {
        paginaResultados.validaPaginaEsperada(urlEsperada);
        System.out.println(urlEsperada);
    }
}
