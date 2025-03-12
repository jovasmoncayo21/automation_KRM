package Test.Franquicias;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class AgregarNota extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void agregaNota() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Solicitudes / Listado de Franquicias
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.franquicias)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.franquicias)).click();

        //Clic a Listado de Franquicias
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.listFranquicias)).click();

        //Ingreso a la solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresoCli)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingresoCli)).click();

        //Clic a la pestaña Notas
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.notas)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.notas)).click();

        //Seleccion de tipo de nota
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoNota)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.tipoNota)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.docSubsanado)).click();

        //Ingreso de texto
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.texto)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.texto)).sendKeys(properties.getProperty("texto"));

        /*Flujo alterno para eliminar una nota
        js.executeScript("window.scroll(0,500)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.eliminarNota)));
        driver.findElement(By.xpath(Objetos.eliminarNota)).click();
        Thread.sleep(2000);
        Assert.assertEquals(Objetos.assertEliminar, Objetos.assertEliminar);
        //driver.findElement(By.xpath(Objetos.btnCancelar)).click();
        driver.findElement(By.xpath(Objetos.btnAceptar)).click();*/

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.guardarNota)));
        driver.findElement(By.xpath(Objetos.guardarNota)).click();
    }
}
