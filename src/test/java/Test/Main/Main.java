package Test.Main;

import Test.Empleados.AgregarBienes;
import Test.Empleados.AgregarIngresos;
import Test.Empleados.AgregarReferencia;
import Test.Empleados.CrearSolicitud;
import Test.Franquicias.AgregarNota;
import Test.LogOut.LogOut;
import Test.Login.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static WebDriver driver;
    public static Properties properties = new Properties();

    @Before
    public void setUp() throws Exception {

        //creamos opciones sobre nuestro driver

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //driver = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        properties.load(new FileReader("src\\test\\java\\Utilerias\\Test.properties"));
        driver.get(properties.getProperty("URLDev"));
        //driver.get(properties.getProperty("URLProd"));
    }

    @Test
    public void flujoPrincipal() throws InterruptedException, IOException, AWTException {

        Login.inicioSesion();
        //CreacionClientesPotenciales.clientes_precalificados();
        //CreacionClientesMorales.crearCliente();
        //AgregarReferencia.agregaRef();
        //AgregarIngresos.agregarIng();
        //AgregarBienes.agregaBien();
        //CreacionClientesPersonales.crearCliente();
        //AgregarDocumento_CP.agregarDocumento();
        //AgregarReferencia_CP.cargaReferencia();
        //AgregarIngresos.agregaIngreso();
        //AgregarBienes.agregaBien();
        //CreacionSolicitudes.crearSolicitud();
        //AgregarNota.agragarNota();
        //CreacionFranquicias.crearFranquicia();
        //AgregarNota.agregaNota();
        //CreacionEmpleados.crearEmpleado();
        //CrearSolicitud.creaSolicitud();
        //AgregarReferencia.agregaRef();
        //AgregarIngresos.agregaIng();
        //AgregarBienes.agregaBien();
        //CreacionReglasEstado.crearReglas();
        LogOut.cerrarSesion();
    }

    @After
    public void cerrarDrive() throws InterruptedException {

        //Cerrar ventana de navegacion
        Thread.sleep(5000);
        driver.quit();
    }
}
