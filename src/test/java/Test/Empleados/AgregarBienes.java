package Test.Empleados;

import Test.Main.Main;
import Utilerias.Objetos;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class AgregarBienes extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void agregaBien() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

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

        //Clic a la pestaña Bienes
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.bienes)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.bienes)).click();

        //Clic a Crear Bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.crearBien)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.crearBien)).click();

        //Seleccionar el tipo de Bien a agregar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.bien)));
        driver.findElement(By.xpath(Objetos.bien)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.propiedad)).click();

        //Ingreso de datos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoPropiedad)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.tipoPropiedad)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.casa)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.tipoDocumento)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.tipoDocumento)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.tituloPropiedad)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.numDoc)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.numDoc)).sendKeys(properties.getProperty("numDoc"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.valorAvaluo)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.valorAvaluo)).sendKeys(properties.getProperty("valorAvaluo"));

        /*Flujo alterno para eliminar un bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnEliminarBien)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.btnEliminarBien)).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath(Objetos.btnCancelarBien)).click();
        Thread.sleep(2000);
        //El elemento no es interactuable por lo que no puedo confirmar la eliminacion
        driver.findElement(By.xpath(Objetos.btnConfirmarBien)).click();*/

        //Click al boton Guardar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.guardar)));
        driver.findElement(By.xpath(Objetos.guardar)).click();
    }
}
