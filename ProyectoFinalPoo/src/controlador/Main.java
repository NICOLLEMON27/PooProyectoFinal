package controlador;

import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.Cliente;
import modelos.Panadero;
    


public class Main {
    
    
 private static final LinkedList<Cliente> clientes = new LinkedList<>();
 private static final Panadero Jefepanadero=new Panadero(null,null,null);
 
    public static void main(String[] args) {
     
     
        
         Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            mostrarMenuPrincipal();
            //Aqui se utiliza la excepcion
            opcion = obtenerEntero(scanner);
            
            switch (opcion) {
                case 1:
                    /*Acceder como cliente
                    Entra al menu cliente */ 
                    accederComoCliente(scanner);
                    break;
                case 2:
                       /*Acceder como Empleado
                        Entra al menu Empleados  */ 
                    accederComoEmpleado( scanner); 
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                      hacerEncabezado("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }

    private static void mostrarMenuPrincipal() {
        hacerEncabezado("   BIENVENIDO A EL PANADERO DORADO ");
          hacerEncabezado("Menú Principal:");
        System.out.println("1. Acceder como cliente");
        System.out.println("2. Acceder como Empleado");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void accederComoCliente(Scanner scanner) {
        int opcionCliente;

        do {
            mostrarMenuCliente();
            opcionCliente = obtenerEntero(scanner);

            switch (opcionCliente) {
                case 1:
                    // Registrar cliente
                   // el registrar cliente puede ser una funcion pero no se si ya son muchas 
                   //se puede hacer funcion de registra datos persona para q sea mas rapido 
                   hacerEncabezado("Ingrese los datos del cliente:");
                   
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Cédula: ");
                    String cedula = scanner.next();

                    System.out.print("Años: ");
                    String años = scanner.next();

                    System.out.print("Ciudad: ");
                    String Ciudad = scanner.next();
                    
                    System.out.print("Calle: ");
                    String Calle = scanner.next();
                   
                    Cliente nuevoCliente = new Cliente(nombre, cedula, años);
                    nuevoCliente.asignarDireccion(Calle, Ciudad);
                    
                    // Agregar el cliente a la lista
                    clientes.add(nuevoCliente);

                    System.out.println("Cliente "+nombre +" registrado con éxito. Índice del cliente: " + (clientes.indexOf(nuevoCliente)+1));
                  
                    break;
                case 2:
                    // Asignar productos a compra
                    // Implementa la lógica para asignar productos a la compra
                    System.out.println("Función para asignar productos a la compra.");
                    break;
                case 3:
                    // Pagar compra
                    // Implementa la lógica para pagar la compra
                    System.out.println("Función para pagar la compra.");
                    break;
                case 4:
                    // Mostrar clientes
                  
                    hacerEncabezado( "      CLIENTES       ");
                   try {
                     mostrarElementos(clientes, "clientes");
                   } catch (ListaVaciaException e) {
                    System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcionCliente != 0);
    }

    private static void mostrarMenuCliente() {
         hacerEncabezado("Menú Cliente:");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Asignar productos a compra");
        System.out.println("3. Pagar compra");
        System.out.println("4. Ver Clientes registrados");
        System.out.println("0. Volver al menú principal");
        System.out.print("Ingrese su opción: ");
    }
    
      private static void accederComoEmpleado(Scanner scanner) {
        int opcionEmpleado;

        do {
            mostrarMenuEmpleado();
            opcionEmpleado = obtenerEntero(scanner);

            switch (opcionEmpleado) {
                case 1:
                    // Registrar Panadero
                    //aqui tambien se utilizaria
                   hacerEncabezado("Ingrese los datos del Panadero:");
                   
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Cédula: ");
                    String cedula = scanner.next();

                    System.out.print("Años: ");
                    String años = scanner.next();
                    
                    Panadero nuevoPanadero = new Panadero(nombre, cedula, años);
                    // Agregar Panadero a la lista
                    Jefepanadero.contratarPanadero(nuevoPanadero);
                    nuevoPanadero.agregarJefe(Jefepanadero);
                    System.out.println("Panadero "+nombre +" registrado con éxito. Índice del Panadero: " + (Jefepanadero.getPanaderos().indexOf(nuevoPanadero)+1));
                                     
                    break;
                case 2:                                                                           
                   // Registrar Chef  Panadero2
                    //aqui tambien se utilizaria
                    // Registrar Chef Panadero
                if (Jefepanadero.getChefPanadero() == null) {
                    hacerEncabezado("Ingrese los datos del Jefe:");
        
                    System.out.print("Nombre: ");
                    String nombreJefe = scanner.next();

                    System.out.print("Cédula: ");
                    String cedulaJefe = scanner.next();

                    System.out.print("Años: ");
                    String añosJefe = scanner.next();
                     
                    Jefepanadero.setNombre(nombreJefe);
                    Jefepanadero.setCedula(cedulaJefe);
                    Jefepanadero.setAños(añosJefe);

                    System.out.println("Panadero " + nombreJefe + " registrado con éxito. ");
                } else {
                    System.out.println("Error: Ya hay un jefe registrado.");
                }

                    break;                                                       
                case 3:
                    // Aqui se hornea todavia no se si crear otro menu para hornear uno
                    //por uno o en el menu de empleados
                    System.out.println("Función para hornar.");
                    break;                    
                 case 4:
                    // mostrar Empleado 
                      hacerEncabezado( "      EMPLEADOS      ");
                      // Mostrar información del jefe
                      mostrarPanadero(Jefepanadero);
                      // Mostrar información de cada panadero
                      for (Panadero panadero : Jefepanadero.getPanaderos()) {
                          mostrarPanadero(panadero);
                      }

                    break;   
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcionEmpleado != 0);
    }

      private static void mostrarMenuEmpleado() {
          hacerEncabezado("Menú Empleado:");
        System.out.println("1. Contratar Panadero");
        System.out.println("2. Contratar Chef en Jefe");
        System.out.println("3. Hornear");
        System.out.println("4. Mostrar Empleados");
        System.out.println("0. Volver al menú principal");
        System.out.print("Ingrese su opción: ");
    }  
      
      
    private static int obtenerEntero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Limpiar el buffer del scanner en caso de una entrada no válida
                scanner.next();
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }
    }
    
    private static void hacerEncabezado(String titulo) {
        System.out.println("*--------------------------------------*");
        System.out.println(titulo);
        System.out.println("*--------------------------------------*\n");
    }
    
    private static void mostrarElementos(LinkedList<?> lista, String nombreLista) throws ListaVaciaException {
        if (lista.isEmpty()) {
            throw new ListaVaciaException(nombreLista);
        } else {
            System.out.println("Elementos de la lista " + nombreLista + ":");
            for (int i = 0; i < lista.size(); i++) {
                Object elemento = lista.get(i);
                System.out.println((i + 1) + ". " + elemento);
            }
        }
    }
    
    public static void mostrarPanadero(Panadero objPanadero) {
    System.out.println(objPanadero);

    // Mostrar información del jefe
    Panadero jefe = objPanadero.getChefPanadero();
    if (jefe == null) {
        System.out.println("Este panadero no tiene jefe");
    } else {
        try {
            System.out.println("Jefe: " + jefe.getNombre());
        } catch (NullPointerException e) {
            System.out.println("Error al obtener el nombre del jefe: " + e.getMessage());
        }
    }
    }
}

        
        
        
   

