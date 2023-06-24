package paquete1;

import java.util.Scanner;
import java.util.ArrayList;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Prestamo>lista = new ArrayList<>();
        String op;

        String nombre = "";
        String apellido = "";
        String username = "";

        String nombreI;
        String siglas;
                
        int tiempoPrestamo = 0;
        String ciudad = "";

        String tipoAutomovil;
        String marcaAutomovil;
        double valorAutomovil;
        
        String nivelEstudio;
        double valorCarrera;

        do {
            Persona persona = null;
//            InstitucionEducativa institucionEducativa = null;
            
            System.out.println(""
                    + "Seleccione\n"
                    + "\t1). Prestamo Automovil\n"
                    + "\t2). Prestamo Educativo\n"
                    + "Ingrese la opcion: ");
            op = entrada.nextLine();

            if (op.equals("1") || op.equals("2")) {
                System.out.println("Ingrese los nombres del Prestamista"); 
                nombre = entrada.nextLine();
                System.out.println("Ingrese los apellidos del Prestamista");
                apellido = entrada.nextLine();
                System.out.println("Ingrese el username del Prestamista");
                username = entrada.nextLine();
                System.out.println("Ingrese el tiempo en meses para el prestamo: ");
                tiempoPrestamo = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Igrese la ciudad del prestamo: ");
                ciudad = entrada.nextLine();
            }

            if (op.equals("1")) {
                System.out.println("Ingrese el tipo de Automovil: ");
                tipoAutomovil = entrada.nextLine();
                System.out.println("Ingrese la marca del Automovil: ");
                marcaAutomovil = entrada.nextLine();
                System.out.println("Ingrese el valor del Automovil: ");
                valorAutomovil = entrada.nextDouble();
                
                persona = new Persona(nombre,apellido, username );
                PrestamoAutomovil prestamoAut = new PrestamoAutomovil(
                        tipoAutomovil, marcaAutomovil, persona, 
                        valorAutomovil, persona, tiempoPrestamo, ciudad);
                prestamoAut.calcularValorMensualAutomovil();
                lista.add(prestamoAut);
//                System.out.println(prestamoAut);
                
                
            } else if (op.equals("2")) {
                System.out.println("Ingrese el nombre de ls Institucion: ");
                nombreI = entrada.nextLine();
                System.out.println("Ingrese las siglas de la Institucion: ");
                siglas = entrada.nextLine();
                System.out.println("Ingrese el nivel de Estudio: ");
                nivelEstudio = entrada.nextLine();
                System.out.println("Ingrese el valor de la Carrera: ");
                valorCarrera = entrada.nextDouble();
                                
                persona = new Persona(nombre,apellido, username );
                InstitucionEducativa institucionEdu = new InstitucionEducativa(
                        nombreI, siglas);
                PrestamoEducativo prestamoEdu = new PrestamoEducativo(
                        nivelEstudio, valorCarrera, institucionEdu, 
                        persona, tiempoPrestamo, ciudad);
                prestamoEdu.calcularValorMensualEducativo();
                lista.add(prestamoEdu);
//                System.out.println(prestamoEdu);

                
            } else {
                System.out.println("Opcion Invalida");
            }

            entrada.nextLine();
            System.out.println(""
                    + "Ingrese 'SI' si desea contiunar en el proceso,"
                    + "si desea terminar el proceso ingrese 'NO': ");
            op = entrada.nextLine();
        } while (op.equalsIgnoreCase("Si"));
        
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
