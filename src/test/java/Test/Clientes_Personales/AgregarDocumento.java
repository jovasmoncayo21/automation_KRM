package Test.Clientes_Personales;

import Test.Main.Main;
import Utilerias.Objetos;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class AgregarDocumento extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void agregarDocumento() throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Clic a opcion del menu Clientes Personales / Crear cliente
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clientPersonal)));
        driver.findElement(By.xpath(Objetos.clientPersonal)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.listadoClientes)).click();

        //Ingreso a la solicitud
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.ingresoCliente)));
        driver.findElement(By.xpath(Objetos.ingresoCliente)).click();
        Thread.sleep(2000);

        //Clic a la pestaña Documentos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.documentos)));
        driver.findElement(By.xpath(Objetos.documentos)).click();
        Thread.sleep(2000);

        //Se llega al punto en el que el flujo no puede continuar, debido a que la carga de un documento no se puede automatizar


    }
}
