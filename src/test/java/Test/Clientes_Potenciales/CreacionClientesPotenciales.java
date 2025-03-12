package Test.Clientes_Potenciales;

import Test.Main.Main;
import Utilerias.Objetos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class CreacionClientesPotenciales extends Main {

    private static WebDriver driver = Main.driver;
    private static Properties properties = Main.properties;
    static WebDriverWait wait = new WebDriverWait(driver, 2000);

    public static void clientes_precalificados() throws InterruptedException {

        Thread.sleep(2000);
        //Clic a opcion del menu Clientes Potenciales / Clientes Precalificados
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos.clientPotencial)));
        driver.findElement(By.xpath(Objetos.clientPotencial)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Objetos.clientPrecalif)).click();
    }
}
