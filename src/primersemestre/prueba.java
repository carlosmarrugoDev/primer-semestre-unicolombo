package primersemestre;

import java.util.Scanner;

class Empleado {
    private int cedula;
    private String name;
    private String email;
    private String cargo;

    public Empleado(int cedula, String name, String email, String cargo) {
        this.cedula = cedula;
        this.name = name;
        this.email = email;
        this.cargo = cargo;
    }

    public int getcedula() {
        return cedula;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }
}

public class prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Empleado[] empleados = new Empleado[100];
        int cantidadEmpleados = 0;

        int opcion;

        do {
            System.out.println("-----MENU------");
            System.out.println("1. Gestionar empleados");
            System.out.println("2. Gestionar Clientes");
            System.out.print("Digite una opcion validad: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    gestionarEmpleados(empleados, cantidadEmpleados, entrada);
                    break;

                case 2:

                    break;

                default:
                    break;
            }

        } while (true);
    }

    public static void gestionarEmpleados(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {
        do {
            System.out.println("1. Guardar empleados");
            System.out.println("2. Listar emepleados");
            System.out.println("3. Modificar Empleados");
            System.out.println("4. Eliminar empleados");
            System.out.print("Digite una opcion: ");
            int opcionGestion = entrada.nextInt();
            System.out.println("");

            switch (opcionGestion) {
                case 1:
                    if (cantidadEmpleados < empleados.length) {
                        guardarEmpleados(empleados, cantidadEmpleados, entrada);
                        cantidadEmpleados++;
                    }
                    break;
                case 2:
                    listarEmpleados(empleados, cantidadEmpleados);
                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    break;
            }

        } while (true);
    }

    // Metodo guardar
    public static void guardarEmpleados(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {

        System.out.print("Digite la cedula: ");
        int cedula = entrada.nextInt();

        System.out.print("Digite su nombre: ");
        String name = entrada.next();

        System.out.print("Digite su email: ");
        String email = entrada.next();

        System.out.print("Digite la cargo: ");
        String cargo = entrada.next();

        empleados[cantidadEmpleados] = new Empleado(cedula, name, email, cargo);
        System.out.println("Guardado con exito!");
    }

    public static void listarEmpleados(Empleado[] empleados, int cantidadEmpleados) {
        System.out.println("LISTA DE EMPLEADOS");

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Cedula: " + empleados[i].getcedula());
            System.out.println("Nombre: " + empleados[i].getname());
            System.out.println("Email: " + empleados[i].getemail());
            System.out.println("Cargo: " + empleados[i].getcargo());
        }
    }
}