package com.saucedemo.main.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class PrincipalPage extends PageObject {

    public void inputUsername(String usuario) {
        WebElement user = getDriver().findElement(By.id("user-name"));
        user.sendKeys(usuario);
    }

    public void inputPassword(String password) {
        WebElement pass = getDriver().findElement(By.id("password"));
        pass.sendKeys(password);
        WebElement boton = getDriver().findElement(By.id("login-button"));
        boton.click();
    }

    public String obtenerTitulo() {
        WebElement texto = getDriver().findElement(By.className("app_logo") );
        return texto.getText();
    }

    public String obtenerProducto(String producto) {
            WebElement prod = getDriver().findElement(By.xpath("//div[contains(text(),'" + producto +"')]"));
            return prod.getText();
    }

    public void agregarProducto() {
        WebElement producto = getDriver().findElement(By.xpath("//div/button[contains(text(),'Add to cart')]"));
        producto.click();
    }

    public String verCarrito(String producto) {
        WebElement boton = getDriver().findElement(By.className("shopping_cart_link"));
        boton.click();
        WebElement prod = getDriver().findElement(By.xpath("//div[contains(text(), '" + producto +"')]"));
        return prod.getText();
    }

    public void seguirCompra() {
        WebElement regreso = getDriver().findElement(By.xpath("//div/button[contains(text(),'Continue Shopping')]"));
        regreso.click();
    }

    public void ordenarMenorMayor(String ordenar) {
        WebElement opciones = getDriver().findElement(By.xpath("//span/select/option[contains(text(),'" + ordenar +"')]"));
        opciones.click();
    }

    public String verOrdenamiento() {
        WebElement ordenado = getDriver().findElement(By.xpath("//div/div/div/div/div[2]/div/div[contains(string(),'$7.99')]"));
        return ordenado.getText();
    }

    public String verPrimero() {
        WebElement primero = getDriver().findElement(By.xpath("//div/div/div/div/div[2]/div/div[contains(string(),'7.99')]"));
        return primero.getText();
    }

    public String verSegundo() {
        WebElement segundo = getDriver().findElement(By.xpath("//div/div/div/div/div[2]/div/div/div[contains(string(),'9.99')]"));
        return segundo.getText();
    }

    public String verTercero() {
        WebElement tercero = getDriver().findElement(By.xpath("//div/div/div/div/div[2]/div/div[contains(string(),'15.99')]"));
        return tercero.getText();
    }

    public String verCuarto() {
        WebElement cuarto = getDriver().findElement(By.xpath("//div/div/div/div/div[2]/div/div[contains(string(),'15.99')]"));
        return cuarto.getText();
    }
}


