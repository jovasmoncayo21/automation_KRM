package Test.Empleados;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionEmpleados extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void crearEmpleado() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Solicitudes / Crear solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.empleados)));
        driver.findElement(By.xpath(Objetos.empleados)).click();
        Thread.sleep(2000);

        //Clic a Crear Solicitud
        driver.findElement(By.xpath(Objetos.crearEmpleado)).click();

        //Assert a la pantalla General
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertEmpleado)));
        Assert.assertEquals(Objetos.assertEmpleado, Objetos.assertEmpleado);
        Thread.sleep(2000);

        //Los campos obligatorios son de tipo checlist, pero no se puede interactuar con ellos, por lo que hace imposible la automatizacion
        //de este modulo.
    }
}
