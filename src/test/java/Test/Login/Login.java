package Test.Login;

import Test.Main.Main;
import Utilerias.Objetos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class Login extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void inicioSesion() throws InterruptedException, AWTException, IOException {

        System.out.println("Ingreso de datos");

        //Ingreso de Usuario
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.userAdmin)));
        driver.findElement(By.xpath(Objetos.userAdmin)).sendKeys(properties.getProperty("userAdmin"));
        //driver.findElement(By.xpath(Objetos.userAdmin)).sendKeys(properties.getProperty("userLead"));
        //driver.findElement(By.xpath(Objetos.userAdmin)).sendKeys(properties.getProperty("userAgent"));
        //driver.findElement(By.xpath(Objetos.userAdmin)).sendKeys(properties.getProperty("userAsesorVD"));
        //FuncionesGenerales.captureScreen("Ingreso de usuario");
        Thread.sleep(2000);

        //Ingreso de Contraseña
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.password)));
        driver.findElement(By.xpath(Objetos.password)).sendKeys(properties.getProperty("password"));
        //driver.findElement(By.xpath(Objetos.password)).sendKeys(properties.getProperty("passwordLead"));
        //driver.findElement(By.xpath(Objetos.password)).sendKeys(properties.getProperty("passwordAg"));
        //driver.findElement(By.xpath(Objetos.password)).sendKeys(properties.getProperty("passwordAsesor"));
        //FuncionesGenerales.captureScreen("Ingreso de contraseña");
        Thread.sleep(2000);

        //Clic a boton Acceder
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnAcceder)));
        driver.findElement(By.xpath(Objetos.btnAcceder)).click();
    }

}
