package Utilerias;

import Test.Main.Main;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FuncionesGenerales {

    private static WebDriver driver = Main.driver;
    //static WebDriverWait wait = new WebDriverWait(driver, 30);


    public static void captureScreen(String nombrePaso) throws InterruptedException, AWTException, IOException {

        Thread.sleep(2000);
        //String nombre_paso = "Se abre pagina";
        String formato_foto = ".png";
        String path_foto = "C:\\Tools\\Automatizacion con Serenity\\src\\Imagenes";
        String Archivo_foto = path_foto + nombrePaso + formato_foto;

        //Robot robot = new Robot();
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File(Archivo_foto));
        Thread.sleep(3000);
        System.out.println("Screenshot tomada con exito " + nombrePaso);
    }
}
