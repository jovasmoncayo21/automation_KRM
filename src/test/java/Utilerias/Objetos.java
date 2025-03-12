package Utilerias;

public class
Objetos {

    public static String

            //Proceso de Login en KRM
            userAdmin = "//input[@id='username']",
            password = "//input[@id='password']",
            btnAcceder = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/button[1]",

        //Assertion del Dashboard en KRM
        assertDashboard = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]",
                btnLogout = "//header/div[1]/div[1]/button[1]/span[1]",
                cerrarSesion = "//body/div[@id='menu-appbar']/div[3]/ul[1]/li[1]",

        //Flujo de Clientes Potenciales
        clientPotencial = "//span[contains(text(),'Clientes Potenciales')]",
                clientPrecalif = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/span[1]",

        //Flujo de Clientes Personales / Crear cliente
        clientPersonal = "//span[contains(text(),'Clientes Personales')]",
                listadoClientes = "//*[@id=\"root\"]/div/div/div/main/div[1]/div/div/div/div/div/div/div[3]/ul/li[3]/div/div/div/a[1]/span[1]",
                crearCliente = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]/span[1]",
                assertGeneral = "//h4[contains(text(),'General')]",

        nombre = "//input[@id='firstName']",
                apellido = "//input[@id='fatherLastName']",
                curp = "//input[@id='documentNumber']",
                fechNacimiento = "//input[@id='birthday']",
                campoPais = "//div[@id='countryOfBirth']",
                paisNacimiento = "//body/div[@id='menu-countryOfBirth']/div[3]/ul[1]/li[6]",

        nacionalidad = "//div[@id='nationality.id']",
                tipoNacionalidad = "//body/div[@id='menu-nationality.id']/div[3]/ul[1]/li[6]",
                esCliente = "//span[contains(text(),'Es Cliente?')]",
                esEmpleado = "//span[contains(text(),'Es empleado?')]",

        assertContactos = "//div[contains(text(),'Contactos')]",
                btnAñadir = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[1]/span[1]/button[1]",
                tipoContacto = "//*[@id=\"contacts[0].contactType\"]",
                telefono = "//*[@id=\"menu-contacts[0].contactType\"]/div[3]/ul/li[1]",
                numCasa = "//*[@id=\"contacts[0].contact\"]",
                btnAñadir2 = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[2]/span[1]/button[1]/span[1]",
                tipoContacto2 = "//*[@id=\"contacts[1].contactType\"]",
                celular = "//*[@id=\"menu-contacts[1].contactType\"]/div[3]/ul[1]/li[2]",
                numCel = "//*[@id=\"contacts[1].contact\"]",
                btnAñadir3 = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[3]/span[1]/button[1]/span[1]",
                tipoContacto3 = "//*[@id=\"contacts[2].contactType\"]",
                email = "//*[@id=\"menu-contacts[2].contactType\"]/div[3]/ul[1]/li[3]",
                correo = "//*[@id=\"contacts[2].contact\"]",

        btnGuardar = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]",

        //Flujo para realizar la carga de documentos
        ingresoCliente = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[3]/div",
                documentos = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[1]/div/div/a[4]",
                btnSubirArchivo = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div[1]/div/div/div/button[2]",
                cargaIne = "//*[@id=\"split-button-menu\"]/li[7]",

        //Flujo para realizar la carga de Referencias
        referencias = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[1]/div/div/a[5]",
                agregarReferencia = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div[1]/a",
                tipoRef = "//*[@id=\"referenceType\"]",
                personal = "//*[@id=\"menu-referenceType\"]/div[3]/ul/li[5]",
                nombreRef = "//*[@id=\"name\"]",
                btnAñadir6 = "//*[@id=\"tabpanel-/references/create\"]/div/div/div[3]/div[2]/ul/li/span/button",
                btnAñadir7 = "//*[@id=\"tabpanel-/references/create\"]/div/div/div[3]/div[2]/ul/li[2]/span/button",
                btnAñadir8 = "//*[@id=\"tabpanel-/references/create\"]/div/div/div[3]/div[2]/ul/li[3]/span/button",
                guardar = "//*[@id=\"main-content\"]/div/div[2]/div/form/div[3]/div/button",

        //Eliminar una referencia
        btnEliminar = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div[2]/table/tbody/tr/td[5]/span/div/button",
                assertEliminar = "//*[@id=\"alert-dialog-title\"]/h2",
                btnCancelar = "/html/body/div[2]/div[3]/div/div[3]/button[1]",
                btnConfirmar = "/html/body/div[2]/div[3]/div/div[3]/button[2]",

        //Agregar ingresos
        ingresos = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[1]/div/div/a[7]",
                agregarIngreso = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[2]/span/div[1]/a",
                tipoIng = "//*[@id=\"incomeType\"]",
                negocio = "//*[@id=\"menu-incomeType\"]/div[3]/ul/li[4]",
                compania = "//*[@id=\"companyName\"]",
                ingreso = "//*[@id=\"amount\"]",
                fechaDeInicio = "//*[@id=\"effectiveDate\"]",
                btnAñadir9 = "//*[@id=\"tabpanel-/incomes/create\"]/div/div/div[7]/div[2]/ul/li/span/button",
                btnAñadir10 = "//*[@id=\"tabpanel-/incomes/create\"]/div/div/div[7]/div[2]/ul/li[2]/span/button",
                btnAñadir11 = "//*[@id=\"tabpanel-/incomes/create\"]/div/div/div[7]/div[2]/ul/li[3]/span/button",
                assertSup = "//*[@id=\"tabpanel-/incomes/create\"]/div/div/div[9]/div",
                nombreSup = "//*[@id=\"supervisor\"]",
                btnAñadirSup = "//*[@id=\"tabpanel-/incomes/create\"]/div/div/div[11]/div[2]/ul/li/span/button",
                contactoCel = "//*[@id=\"supervisorContacts[0].contactType\"]",
                celSup = "//*[@id=\"menu-supervisorContacts[0].contactType\"]/div[3]/ul/li[2]",
                numCelSup = "//*[@id=\"supervisorContacts[0].contact\"]",

        //Eliminar un ingreso
        BtnEliminarIng = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[2]/span/div[2]/table/tbody/tr/td[6]/button",
                btnCancelarIng = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text']",
                btnConfirmarIng = "/html/body/div[3]/div[3]/div/div[3]/button[2]",

        //Agregar Bienes
        bienes = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[1]/div/div/a[8]",
                crearBien = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[2]/span/div[1]/a",
                bien = "//*[@id=\"segment\"]",
                propiedad = "//*[@id=\"menu-segment\"]/div[3]/ul/li[1]",
                tipoPropiedad = "//*[@id=\"assetType\"]",
                casa = "//*[@id=\"menu-assetType\"]/div[3]/ul/li[12]",
                tipoDocumento = "//*[@id=\"documentType\"]",
                tituloPropiedad = "//*[@id=\"menu-documentType\"]/div[3]/ul/li",
                numDoc = "//*[@id=\"documentNumber\"]",
                valorAvaluo = "//*[@id=\"value\"]",

        //Eliminar un bien
        btnEliminarBien = "//*[@id=\"main-content\"]/div/div[2]/div/div/div[2]/span/div[2]/table/tbody/tr/td[6]/button",
                btnCancelarBien = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text']",
                btnConfirmarBien = "/html/body/div[3]/div[3]/div/div[3]/button[2]",

        //Flujo de Clientes Morales / Crear cliente
        clienteMoral = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/button[1]/span[1]",
                creacionCliente = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[1]/div[1]/a[2]/span[1]",

        numDocumento = "//input[@id='documentNumber']",
                nombreCompania = "//*[@id=\"businessName\"]",
                razonSocial = "//input[@id='tradeName']",
                paisConstitucion = "//div[@id='constitutionCountry.id']",
                selectPais = "//body/div[@id='menu-constitutionCountry.id']/div[3]/ul[1]/li[6]",

        //Listado de clientes
        listadoCli = "//*[@id=\"root\"]/div/div/div/main/div[1]/div/div/div/div/div/div/div[3]/ul/li[4]/div/div/div/a[1]",
                ingresoCli = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[3]",

        //Flujo Solicitudes / Crear solicitudes
        solicitudes = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/button[1]/span[1]",
                crearSolicitud = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/div[1]/div[1]/div[1]/a[2]/span[1]",
                tipoPersona = "//div[@id='personType']",
                perFisica = "//body/div[@id='menu-personType']/div[3]/ul[1]/li[1]",
                perMoral = "//body/div[@id='menu-personType']/div[3]/ul[1]/li[2]",
                persona = "//input[@id='person']",
                tipoSolicitud = "//div[@id='applicationType']",
                alianza = "//body/div[@id='menu-applicationType']/div[3]/ul[1]/li[2]",
                monto = "//input[@id='amount']",
                meses = "//input[@id='months']",
                comaniaOrig = "//div[@id='fundingCompany.id']",
                kapitalizer = "//body/div[@id='menu-fundingCompany.id']/div[3]/ul[1]/li[3]",

        //Crear Nota
        listadoSolicitudes = "//*[@id=\"root\"]/div/div/div/main/div[1]/div/div/div/div/div/div/div[3]/ul/li[5]/div/div/div/a[1]",
                notas = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[1]/div/div/a[2]",
                tipoNota = "//*[@id=\"contactHistoryType\"]",
                docSubsanado = "//*[@id=\"menu-contactHistoryType\"]/div[3]/ul/li[1]",
                texto = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div/div[1]/div[1]/div[2]/div[2]/div/div/div/div/div/div",
                guardarNota = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div/div[1]/div[1]/button",
                eliminarNota = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div/div/div[2]/div/div[3]/div/button[2]",
                btnAceptar = "//button[@aria-label='ACEPTAR']",

        //Flujo Franquicias / Crear franquicias
        franquicias = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[6]/button[1]/span[1]",
                crearFranquicia = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[6]/div[1]/div[1]/div[1]/a[2]/span[1]",
                assertGen = "//h3[contains(text(),'General')]",
                listFranquicias = "//*[@id=\"root\"]/div/div/div/main/div[1]/div/div/div/div/div/div/div[3]/ul/li[6]/div/div/div/a[1]",

        //Flujo Empleados / Crear empleado
        empleados = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[8]/button[1]/span[1]",
                crearEmpleado = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[1]/div[1]/a[2]/span[1]",
                assertEmpleado = "//h4[contains(text(),'Empleado')]",
                listEmpleados = "//*[@id=\"root\"]/div/div/div/main/div[1]/div/div/div/div/div/div/div[3]/ul/li[8]/div/div/div/a[1]",
                guardarSolicitud = "//*[@id=\"main-content\"]/div/div[2]/div/form/div[2]/div/button",

        //Creacion de solicitudes
        solicitudEmp = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[1]/div/div/a[2]",
                creaSolicitud = "//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[2]/span/div[1]/a",



        //Flujo Reglas de Estado / Crear reglas
        reglasEstado = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[9]/button[1]/span[1]",
                crearRegla = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[1]/div[1]/a[2]/span[1]",
                nombreRegla = "//input[@id='name']",
                estadoActual = "//div[@id='actualState']",
                firmado = "//body/div[@id='menu-actualState']/div[3]/ul[1]/li[5]",
                estadoFuturo = "//div[@id='futureState']",
                formalizacion = "//body/div[@id='menu-futureState']/div[3]/ul[1]/li[1]",

                btnAñadir4 = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/span[1]/button[1]/span[1]",
                entidad = "//*[@id=\"documents[0].documentSegment\"]",
                promociones = "//*[@id=\"menu-documents[0].documentSegment\"]/div[3]/ul/li[2]",
                tipo = "//*[@id=\"documents[0].documentType\"]",
                promocion = "//*[@id=\"menu-documents[0].documentType\"]/div[3]/ul/li",

                btnAñadir5 = "//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]/span[1]/button[1]",
                tiposAplicacion = "//*[@id=\"applicationTypes[0]\"]",
                construccion = "//*[@id=\"menu-applicationTypes[0]\"]/div[3]/ul/li[3]"

        ;
}
