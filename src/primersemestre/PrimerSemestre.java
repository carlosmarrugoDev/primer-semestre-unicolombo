package primersemestre;

import java.util.Scanner;

public class PrimerSemestre {
    //Comment
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] trabajadores = new String[100][3]; //Bidemencional Arrays for Workers
        int numTrabajadores = 0; //Workers counter

        String usuarioRector = "rector"; //User for Rector
        String cedulaRector = "123"; //Password for Rector

        String[][] guardados = new String[100][2]; //Bidemencional Arrays for Saved Workers
        int guardadosPorRector = 0; //Saved workers counter

        String cedulaCoordinador = ""; //Variable going to be empty
        String emailCoordinador = ""; //Variable going to be empty to asociate with rector passwpord for coordinador

        int opcionInicial; //Op for our switch
        //do while y switch ppara Inicio de sesion
        do {
            System.out.println("Welcome!");
            System.out.println("1. Login as Rector");
            System.out.println("2. Login as Coordinador");
            System.out.println("3. Salir");

            System.out.print("Selecciones una opcion: ");
            opcionInicial = entrada.nextInt();

            switch (opcionInicial) {
                case 1:
                    System.out.print("Type you user: ");
                    String user = entrada.next();
                    System.out.print("Type you password: ");
                    String password = entrada.next();

                    if (user.equals(usuarioRector) && password.equals(cedulaRector)) {
                        int opcionAdmin;
                        //do while y switch para Crud
                        do {
                            System.out.println("Welcome!");
                            System.out.println("1. Contratar trabajdor");
                            System.out.println("2. Mostrar Trabajadores");
                            System.out.println("3. Modificar Informacion de Trabajador");
                            System.out.println("4. Despedir por flojo");
                            System.out.println("5. Salir");

                            System.out.print("Digite una opcion: ");
                            opcionAdmin = entrada.nextInt();

                            switch (opcionAdmin) {
                                case 1:
                                    System.out.print("Type your Id: ");
                                    String id = entrada.next();
                                    System.out.print("Type your name: ");
                                    String name = entrada.next();
                                    System.out.print("Type your email: ");
                                    String email = entrada.next();
                                    System.out.print("Type your charge: ");
                                    String cargo = entrada.next();

                                    trabajadores[numTrabajadores][0] = id;
                                    trabajadores[numTrabajadores][1] = name;
                                    trabajadores[numTrabajadores][2] = email;
                                    trabajadores[numTrabajadores][3] = cargo;
                                    
                                    System.out.println("Agregado correctamente!");
                                    
                                    guardados[guardadosPorRector][0] = id;
                                    guardados[guardadosPorRector][1] = email;
                                    numTrabajadores++;

                                    break;
                                    
                                case 2:
                                    
                                    break;
                                default:
                                    throw new AssertionError();
                            }

                        } while (opcionAdmin != 5);

                    } else {
                        System.out.println("Algo salio mal!");
                    }
                    break;

                case 2:
                    //Sesion Coordinador
                    if(guardadosPorRector == 0){ //Verificar si hay trabjadores
                        System.out.println("No Hay trabajadores!");
                    }
                    
                    System.out.println("Digite el id: ");
                    String idWorker = entrada.next();
                    System.out.println("Digite el Email: ");
                    String emailWorker = entrada.next();
                    
                    boolean acceso = false;
                    
                    for(int i = 0; i < guardadosPorRector; i++){
                        if(idWorker.equals(guardadosPorRector[i][0]) && emailWorker.equals(guardadosPorRector[i][1]){
                            
                        }
                    }
                    
                    break;
                default:
                    throw new AssertionError();
            }

        } while (true);

    }
}
