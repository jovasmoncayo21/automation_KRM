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

public class AgregarReferencia extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void cargaReferencia() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Clic a opcion del menu Clientes Personales / Crear cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clientPersonal)));
        driver.findElement(By.xpath(Objetos.clientPersonal)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.listadoClientes)).click();

        //Ingreso a la solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresoCliente)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingresoCliente)).click();


        //Clic a la pestaña Referencias
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.referencias)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.referencias)).click();

        //Clic a Agregar Referencia
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.agregarReferencia)));
        driver.findElement(By.xpath(Objetos.agregarReferencia)).click();
        Thread.sleep(2000);

        //Agregar tipo de Referencia
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoRef)));
        driver.findElement(By.xpath(Objetos.tipoRef)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.personal)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.nombreRef)).sendKeys(properties.getProperty("nombreRef"));

        //Assert de la seccion Contactos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertContactos)));
        Assert.assertEquals(Objetos.assertContactos, Objetos.assertContactos);
        Thread.sleep(2000);

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir6)));
        driver.findElement(By.xpath(Objetos.btnAñadir6)).click();

        //Agregar un Telefono de casa
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto)));
        driver.findElement(By.xpath(Objetos.tipoContacto)).click();
        driver.findElement(By.xpath(Objetos.telefono)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCasa)));
        driver.findElement(By.xpath(Objetos.numCasa)).sendKeys(properties.getProperty("numCasa"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir7)));
        driver.findElement(By.xpath(Objetos.btnAñadir7)).click();

        //Agregar un Telefono celular
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto2)));
        driver.findElement(By.xpath(Objetos.tipoContacto2)).click();
        driver.findElement(By.xpath(Objetos.celular)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numCel)));
        driver.findElement(By.xpath(Objetos.numCel)).sendKeys(properties.getProperty("numCel"));

        //Click al boton Añadir
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir8)));
        driver.findElement(By.xpath(Objetos.btnAñadir8)).click();

        //Agregar un correo
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoContacto3)));
        driver.findElement(By.xpath(Objetos.tipoContacto3)).click();
        driver.findElement(By.xpath(Objetos.email)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.correo)));
        driver.findElement(By.xpath(Objetos.correo)).sendKeys(properties.getProperty("correo"));

        js.executeScript("window.scroll(0,1100)");
        Thread.sleep(2000);

        /*Flujo alterno para eliminar el documento
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnEliminar)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.btnEliminar)).click();
        Thread.sleep(2000);
        Assert.assertEquals(Objetos.assertEliminar, Objetos.assertEliminar);
        Thread.sleep(2000);
        //driver.findElement(By.xpath(Objetos.btnCancelar)).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.btnConfirmar)).click();*/

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.guardar)));
        driver.findElement(By.xpath(Objetos.guardar)).click();


    }
}
