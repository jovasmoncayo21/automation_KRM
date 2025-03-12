package Test.Clientes_Personales;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionClientesPersonales extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);


    public static void crearCliente() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Clientes Personales / Crear cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clientPersonal)));
        driver.findElement(By.xpath(Objetos.clientPersonal)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.crearCliente)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertGeneral)));
        Assert.assertEquals(Objetos.assertGeneral, Objetos.assertGeneral);
        Thread.sleep(2000);

        //Ingreso de datos obligatorios
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.nombre)));
        driver.findElement(By.xpath(Objetos.nombre)).sendKeys(properties.getProperty("nombre"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.apellido)));
        driver.findElement(By.xpath(Objetos.apellido)).sendKeys(properties.getProperty("apellido"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.curp)));
        driver.findElement(By.xpath(Objetos.curp)).sendKeys(properties.getProperty("curp"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.fechNacimiento)));
        driver.findElement(By.xpath(Objetos.fechNacimiento)).sendKeys(properties.getProperty("fechNacimiento"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.campoPais)));
        driver.findElement(By.xpath(Objetos.campoPais)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.paisNacimiento)));
        driver.findElement(By.xpath(Objetos.paisNacimiento)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.nacionalidad)));
        driver.findElement(By.xpath(Objetos.nacionalidad)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoNacionalidad)));
        driver.findElement(By.xpath(Objetos.tipoNacionalidad)).click();
        Thread.sleep(2000);

        /*Desmarcar el switch de cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.esCliente)));
        driver.findElement(By.xpath(Objetos.esCliente)).click();*/

        /*Marcar el switch de cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.esCliente)));
        driver.findElement(By.xpath(Objetos.esCliente)).click();*/

        /*Marcar el switch de cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.esEmpleado)));
        driver.findElement(By.xpath(Objetos.esEmpleado)).click();*/

        /*Desmarcar el switch de cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.esEmpleado)));
        driver.findElement(By.xpath(Objetos.esEmpleado)).click();*/

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
