package Test.LogOut;

import Test.Main.Main;
import Utilerias.Objetos;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class LogOut extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void cerrarSesion() throws InterruptedException {

        //Asserition Pagina inicial al hacer Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.assertDashboard)));
        Assert.assertEquals(Objetos.assertDashboard, Objetos.assertDashboard);
        Thread.sleep(2000);

        //Clic a boton Cerrar Sesion
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.btnLogout)));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.btnLogout)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.cerrarSesion)).click();
    }
}
