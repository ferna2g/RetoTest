package com.saucedemo.main.steps;

import com.saucedemo.main.pages.PrincipalPage;
import net.thucydides.core.annotations.ManagedPages;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GeneralSteps {
    @ManagedPages
    PrincipalPage principalPage;


    public void abrirPagina() {
        principalPage.open();
    }

    public void iniciarSesion(String usuario, String password) {
        principalPage.inputUsername(usuario);
        principalPage.inputPassword(password);
    }

    public void visualizarTitulo() {
        assertThat("Swag Labs", equalTo(principalPage.obtenerTitulo()));
    }

    public void buscarProducto(String producto) {
            assertThat(producto, equalTo(principalPage.obtenerProducto(producto)));
    }

    public void agregarCarrito() {
        principalPage.agregarProducto();
    }

    public void verProducto(String producto) {
        principalPage.verCarrito(producto);
        assertThat(producto, equalTo(principalPage.obtenerProducto(producto)));
    }

    public void seguirCompra() {
        principalPage.seguirCompra();
    }

    public void ordenarProductos(String ordenar) {
        principalPage.ordenarMenorMayor(ordenar);
    }

    public void verProductoOrdenado() {
        assertThat("$7.99", equalTo(principalPage.verOrdenamiento()));
    }

    public void menorPrimeroSegundo() {
        assertThat(principalPage.verPrimero(), lessThanOrEqualTo(principalPage.verSegundo()));
    }

    public void menorSegundoTercero() {
        assertThat(principalPage.verTercero(), lessThanOrEqualTo(principalPage.verSegundo()));
    }

    public void menorTerceroCuarto() {
        assertThat(principalPage.verTercero(), equalTo(principalPage.verCuarto()));
    }
}
