package Test.Clientes_Morales;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionClientesMorales extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);


    public static void crearCliente() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Clientes Morales / Crear cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clienteMoral)));
        driver.findElement(By.xpath(Objetos.clienteMoral)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.creacionCliente)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertGeneral)));
        Assert.assertEquals(Objetos.assertGeneral, Objetos.assertGeneral);
        Thread.sleep(2000);

        //Ingreso de datos obligatorios
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numDocumento)));
        driver.findElement(By.xpath(Objetos.numDocumento)).sendKeys(properties.getProperty("numDocumento"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.nombreCompania)));
        driver.findElement(By.xpath(Objetos.nombreCompania)).sendKeys(properties.getProperty("nombreCompania"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.razonSocial)));
        driver.findElement(By.xpath(Objetos.razonSocial)).sendKeys(properties.getProperty("razonSocial"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.paisConstitucion)));
        driver.findElement(By.xpath(Objetos.paisConstitucion)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.selectPais)).click();

        //Scroll
        js.executeScript("window.scroll(0,500)");

        //Assert de la seccion Contactos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertContactos)));
        Assert.assertEquals(Objetos.assertContactos, Objetos.assertContactos);
        Thread.sleep(2000);

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir)));
        driver.findElement(By.xpath(Objetos.btnAñadir)).click();

        //Agregar un Telefono de casa
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto)));
        driver.findElement(By.xpath(Objetos.tipoContacto)).click();
        driver.findElement(By.xpath(Objetos.telefono)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCasa)));
        driver.findElement(By.xpath(Objetos.numCasa)).sendKeys(properties.getProperty("numCasa"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir2)));
        driver.findElement(By.xpath(Objetos.btnAñadir2)).click();

        //Agregar un Telefono celular
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto2)));
        driver.findElement(By.xpath(Objetos.tipoContacto2)).click();
        driver.findElement(By.xpath(Objetos.celular)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCel)));
        driver.findElement(By.xpath(Objetos.numCel)).sendKeys(properties.getProperty("numCel"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir3)));
        driver.findElement(By.xpath(Objetos.btnAñadir3)).click();

        //Agregar un Telefono celular
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto3)));
        driver.findElement(By.xpath(Objetos.tipoContacto3)).click();
        driver.findElement(By.xpath(Objetos.email)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.correo)));
        driver.findElement(By.xpath(Objetos.correo)).sendKeys(properties.getProperty("correo"));

        js.executeScript("window.scroll(0,1100)");
        Thread.sleep(2000);

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnGuardar)));
        driver.findElement(By.xpath(Objetos.btnGuardar)).click();
    }
}
