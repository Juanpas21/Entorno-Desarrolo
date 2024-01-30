import controller.Controlador;
import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Controlador controlador = new Controlador();

    public static void main(String[] args) {

   int opcion;
   do {
       System.out.println("Menu principal");
       System.out.println("1.Registrar usuario");
       System.out.println("2. Mostrar usuarios");
       System.out.println("3. Salir");
       System.out.print("Seleccione una opcion: ");
       opcion = scanner.nextInt();

       switch (opcion) {
           case 1:
               registrarUsuario();
               break;
           case 2:
             mostrarUsuario();
               break;
           case 3:
               System.out.println("¡ADIOS!");
               break;
           default:
               System.out.println("Opcion no valida. Por favor ingresese una opcion valida.\n");
       }
   } while (opcion !=3);
    }

    private static void registrarUsuario(){
    String nombreUsuario = ingresarString("Ingrese el nombre de usuario");
    Usuario usuarioExistente = controlador.obtenerUsuario(nombreUsuario);
    if (usuarioExistente !=null){
        System.out.println("Ya existe un usuario con este nombre"+usuarioExistente);
        return;
    }
    String nombre = ingresarString("Ingrese el nombre");
    String apellido = ingresarString("Ingrese el apellido");
    String contrasenia = ingresarString("Ingrese la contraseña");
    String correoElectronico = ingresarString("Ingrese el correo electrónico");
    String telefono = ingresarString("Ingrese numero de telefono");

    Usuario nuevoUsuario = new Usuario(nombre, apellido, nombreUsuario, contrasenia, correoElectronico,telefono);
    controlador.agregarUsuarios(nuevoUsuario);

    }
   private static void mostrarUsuario() {
        controlador.mostrarUsuarios();
    }

   private static String ingresarString(String mensaje){
        System.out.print(mensaje +":");
        return scanner.next();
   }

}






