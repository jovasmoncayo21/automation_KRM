package Test.Solicitudes;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionSolicitudes extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void crearSolicitud() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Solicitudes / Crear solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.solicitudes)));
        driver.findElement(By.xpath(Objetos.solicitudes)).click();
        Thread.sleep(2000);

        //Clic a Crear Solicitud
        driver.findElement(By.xpath(Objetos.crearSolicitud)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertGeneral)));
        Assert.assertEquals(Objetos.assertGeneral, Objetos.assertGeneral);
        Thread.sleep(2000);

        //Ingreso de datos obligatorios
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoPersona)));
        driver.findElement(By.xpath(Objetos.tipoPersona)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.perFisica)).click();
        //Este campo de "Persona", no es interactuable con la lista de opciones por lo que al llegar al paso final de guardar, lo pone en rojo,
        // como si no se hubiera ingresado dato
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.persona)));
        driver.findElement(By.xpath(Objetos.persona)).sendKeys(properties.getProperty("persona"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoSolicitud)));
        driver.findElement(By.xpath(Objetos.tipoSolicitud)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.alianza)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.monto)));
        driver.findElement(By.xpath(Objetos.monto)).sendKeys(properties.getProperty("monto"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.meses)));
        driver.findElement(By.xpath(Objetos.meses)).sendKeys(properties.getProperty("meses"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.comaniaOrig)));
        driver.findElement(By.xpath(Objetos.comaniaOrig)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.kapitalizer)).click();

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnGuardar)));
        driver.findElement(By.xpath(Objetos.btnGuardar)).click();

    }
}
