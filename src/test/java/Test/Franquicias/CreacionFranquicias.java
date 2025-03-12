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

public class CreacionFranquicias extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void crearFranquicia() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Solicitudes / Crear solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.franquicias)));
        driver.findElement(By.xpath(Objetos.franquicias)).click();
        Thread.sleep(2000);

        //Clic a Crear Solicitud
        driver.findElement(By.xpath(Objetos.crearFranquicia)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertGen)));
        Assert.assertEquals(Objetos.assertGen, Objetos.assertGen);
        Thread.sleep(2000);

        //Se tienen los campos Encargado, Master Broker los cuales tienen un listado con el que no se puede interactuar, por lo que no es posible
        //realizar la automatizacion de este modulo.
    }
}
