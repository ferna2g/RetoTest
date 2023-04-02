package com.saucedemo.main.definitions;


import com.saucedemo.main.steps.GeneralSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GeneralDefinitions {
        @Steps
        GeneralSteps generalSteps;
        @Given("que estoy en la pagina de inicio de sesion")
        public void queEstoyEnLaPaginaDeInicioDeSesion(){
                generalSteps.abrirPagina();
        }

        @When("ingreso mi nombre de usuario {string} y mi contrasena {string}")
        public void ingresoMiNombreDeUsuarioYMiContrasena(String usuario, String password) {
                generalSteps.iniciarSesion(usuario, password);
        }

        @Then("veo la pagina de productos")
        public void veoLaPaginaDeProductos()  {
                generalSteps.visualizarTitulo();
        }

        @When("selecciono el producto {string} de la lista")
        public void seleccionoElProductoDeLaLista(String producto)  {
                generalSteps.buscarProducto(producto);
        }

        @And("presiono el boton de agregar carrito")
        public void presionoElBotonDeAgregarCarrito()  {
                generalSteps.agregarCarrito();
        }

        @And("veo que el producto {string} fue agregado al carrito de compra")
        public void veoQueElProductoFueAgregadoAlCarritoDeCompra(String producto)  {
                generalSteps.verProducto(producto);
        }

        @Then("regreso a productos")
        public void regresoAProductos(){
                generalSteps.seguirCompra();
        }

        @When("selecciono {string} en el menu de ordenamiento")
        public void seleccionoEnElMenuDeOrdenamiento(String ordenar) {
                generalSteps.ordenarProductos(ordenar);
        }

        @Then("veo los productos ordenados por precio de menor a mayor")
        public void veoLosProductosOrdenadosPorPrecioDeMenorAMayor() {
                generalSteps.verProductoOrdenado();
        }

        @And("el precio del primer producto es menor o igual al precio del segundo producto")
        public void elPrecioDelPrimerProductoEsMenorOIgualAlPrecioDelSegundoProducto() {
                generalSteps.menorPrimeroSegundo();
        }

        @And("el precio del segundo producto es menor o igual al precio del tercer producto")
        public void elPrecioDelSegundoProductoEsMenorOIgualAlPrecioDelTercerProducto() {
                generalSteps.menorSegundoTercero();
        }

        @And("el precio del tercer producto es menor o igual al precio del cuarto producto")
        public void elPrecioDelTercerProductoEsMenorOIgualAlPrecioDelCuartoProducto() {
                generalSteps.menorTerceroCuarto();
        }

}
