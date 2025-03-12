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

public class AgregarIngresos  extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void agregarIng() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Clientes Morales / Listado de clientes
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clienteMoral)));
        driver.findElement(By.xpath(Objetos.clienteMoral)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.listadoCli)).click();

        //Ingreso a la solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresoCli)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingresoCli)).click();

        //Clic a la pestaña Ingresos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresos)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingresos)).click();

        //Clic a Agregar Ingreso
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.agregarIngreso)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.agregarIngreso)).click();

        //Ingreso de datos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoIng)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.tipoIng)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.negocio)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.compania)).sendKeys(properties.getProperty("compania"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingreso)).sendKeys(properties.getProperty("ingreso"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.fechaDeInicio)).sendKeys(properties.getProperty("fechaDeInicio"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir9)));
        driver.findElement(By.xpath(Objetos.btnAñadir9)).click();

        //Agregar un Telefono de casa
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto)));
        driver.findElement(By.xpath(Objetos.tipoContacto)).click();
        driver.findElement(By.xpath(Objetos.telefono)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCasa)));
        driver.findElement(By.xpath(Objetos.numCasa)).sendKeys(properties.getProperty("numCasa"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir10)));
        driver.findElement(By.xpath(Objetos.btnAñadir10)).click();

        //Agregar un Telefono celular
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto2)));
        driver.findElement(By.xpath(Objetos.tipoContacto2)).click();
        driver.findElement(By.xpath(Objetos.celular)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCel)));
        driver.findElement(By.xpath(Objetos.numCel)).sendKeys(properties.getProperty("numCel"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir11)));
        driver.findElement(By.xpath(Objetos.btnAñadir11)).click();

        //Agregar un correo
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto3)));
        driver.findElement(By.xpath(Objetos.tipoContacto3)).click();
        driver.findElement(By.xpath(Objetos.email)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.correo)));
        driver.findElement(By.xpath(Objetos.correo)).sendKeys(properties.getProperty("correo"));

        js.executeScript("window.scroll(0,1100)");

        //Assert de la seccion Contactos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertSup)));
        Assert.assertEquals(Objetos.assertSup, Objetos.assertSup);
        Thread.sleep(2000);

        //Ingreso de nombre de Supervisor
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.nombreSup)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.nombreSup)).sendKeys(properties.getProperty("nombreSup"));

        //Clic a btn Añadir Supervisor
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadirSup)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.btnAñadirSup)).click();

        //Agregar un Telefono celular del Supervisor
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.contactoCel)));
        driver.findElement(By.xpath(Objetos.contactoCel)).click();
        driver.findElement(By.xpath(Objetos.celSup)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCelSup)));
        driver.findElement(By.xpath(Objetos.numCelSup)).sendKeys(properties.getProperty("numCelSup"));

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.guardar)));
        driver.findElement(By.xpath(Objetos.guardar)).click();
    }
}
