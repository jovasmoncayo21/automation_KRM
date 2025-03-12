package Test.Empleados;

import Test.Main.Main;
import Utilerias.Objetos;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CrearSolicitud extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void creaSolicitud() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //Clic a opcion del menu Empleados / Listado de empleados
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.empleados)));
        driver.findElement(By.xpath(Objetos.empleados)).click();
        Thread.sleep(2000);

        //Clic a Listado de empleados
        driver.findElement(By.xpath(Objetos.listEmpleados)).click();

        //Ingreso a la solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresoCli)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.ingresoCli)).click();

        //Clic a la pestaña solicitudes
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.solicitudEmp)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.solicitudEmp)).click();

        //Clic a crear una solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.creaSolicitud)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.creaSolicitud)).click();

        //Ingreso de datos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoSolicitud)));
        Thread.sleep(2000);
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

        //Clic al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.guardarSolicitud)));
        driver.findElement(By.xpath(Objetos.guardarSolicitud)).click();

    }
}
