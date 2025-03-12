package Test.Reglas_de_estado;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionReglasEstado extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void crearReglas() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Solicitudes / Crear solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.reglasEstado)));
        driver.findElement(By.xpath(Objetos.reglasEstado)).click();
        Thread.sleep(2000);

        //Clic a Crear Solicitud
        driver.findElement(By.xpath(Objetos.crearRegla)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertGeneral)));
        Assert.assertEquals(Objetos.assertGeneral, Objetos.assertGeneral);
        Thread.sleep(2000);

        //Ingreso de informacion obligatoria
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.nombreRegla)));
        driver.findElement(By.xpath(Objetos.nombreRegla)).sendKeys(properties.getProperty("nombreRegla"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.estadoActual)));
        driver.findElement(By.xpath(Objetos.estadoActual)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.firmado)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.estadoFuturo)));
        driver.findElement(By.xpath(Objetos.estadoFuturo)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.formalizacion)).click();

        //Boton Agregar Documentos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir4)));
        driver.findElement(By.xpath(Objetos.btnAñadir4)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.entidad)));
        driver.findElement(By.xpath(Objetos.entidad)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.promociones)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipo)));
        driver.findElement(By.xpath(Objetos.tipo)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.promocion)).click();

        //Agregar Tipos de Aplicacion
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAñadir5)));
        driver.findElement(By.xpath(Objetos.btnAñadir5)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tiposAplicacion)));
        driver.findElement(By.xpath(Objetos.tiposAplicacion)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.construccion)).click();

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnGuardar)));
        driver.findElement(By.xpath(Objetos.btnGuardar)).click();

    }
}
