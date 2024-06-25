package exam_3_4_luis;

import java.util.Scanner;

public class Exam_3_4_Luis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opciOn:");
            System.out.println("1. Crear Ave");
            System.out.println("2. Crear Perro");
            System.out.println("3. Salir del sistema");
            System.out.print("OpciOn: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearAve(scanner);
                    break;
                case 2:
                    crearPerro(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void crearAve(Scanner scanner) {

        Ave UsuarioAve = new Ave(60.0,"Un loro colorido y parlante", "Loro", 3, 1.5);

        System.out.println("Nombre: " + UsuarioAve.getNombre());
        System.out.println("Edad: " + UsuarioAve.getEdad());
        System.out.println("Peso: " + UsuarioAve.getPeso());
        System.out.println("Velocidad en vuelo: " + UsuarioAve.getVelocidadEnVuelo() + " km/h");
        System.out.println("Descripcion: " + UsuarioAve.getDescripcion());

    }

    private static void crearPerro(Scanner scanner) {

        Perro miPerro = new Perro("Luis", "Firulais", 5, 20.0);

        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Peso: " + miPerro.getPeso());
        System.out.println("Duenio: " + miPerro.getDuenio());

        System.out.println(miPerro.hacesonido());
        System.out.println("¿Es domestico?: " + miPerro.esDomestico());
        System.out.println("Movimiento: " + (miPerro.Moverse(500) ? "Exitoso" : "Fallido"));
        System.out.println(miPerro.comer(200));
    }
}


