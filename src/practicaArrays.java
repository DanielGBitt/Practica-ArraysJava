import java.util.Scanner;

public class practicaArrays {
    public static void main(String[] args) {

        //Variables
        int cantidadEstudiantes = 0;
        int acumNotas = 0;
        int notaMayor = 0;
        int notaMenor = 0;
        double promedioGrupal = 0;

        //Input
        Scanner in = new Scanner(System.in);


        System.out.println("Profe, Bienvenido al sistema de pregistro de notas de estudiantes!");

        System.out.println("Ingrese la cantidad de estudiantes que tiene el grupo");

        do {
            cantidadEstudiantes = in.nextInt();
            in.nextLine();
            if (cantidadEstudiantes <= 0) {
                System.out.println("Debes ingresar un valor valido!!");
            }
        } while (cantidadEstudiantes <= 0);

        //Arrays
        String[] nombreEstudiantes = new String[cantidadEstudiantes];
        int[] notaEstudiantes = new int[cantidadEstudiantes];

        for (int i = 0; i <= cantidadEstudiantes - 1; i++) {
            System.out.println("Ingrese el nombre del estudiante # " + i);
            nombreEstudiantes[i] = in.nextLine();
            System.out.println("Ahora ingrese la nota del estudiante " + nombreEstudiantes[i]);
            notaEstudiantes[i] = in.nextInt();
            acumNotas += notaEstudiantes[i];
            in.nextLine();

        }

        // Calculamos el promedio

        promedioGrupal = (double) acumNotas / cantidadEstudiantes;


        System.out.println("--------------------------------------------");
        System.out.println("NOMBRE ESTUDIANTE || NOTA ESTUDIANTE");
        System.out.println("---------------------------------------------");
        notaMayor = notaEstudiantes[0];
        notaMenor = notaEstudiantes[0];
        for (int l = 0; l <= cantidadEstudiantes - 1; l++) {

            if (notaEstudiantes[l] > notaMayor) {
                notaMayor = notaEstudiantes[l];
            }

            if (notaEstudiantes[l] < notaMenor) {
                notaMenor = notaEstudiantes[l];
            }

            System.out.println(nombreEstudiantes[l] + "\t\t\t || \t" + notaEstudiantes[l]);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Nota mayor " + notaMayor);
        System.out.println("Nota Menor " + notaMenor);
        System.out.println("Promedio general del grupo " + promedioGrupal);
        System.out.println("--------------------------------------------");
    }
}


/*
        Un profesor requiere registrar las N notas obtenidas por sus estudiantes
        en la materia de lógica de programación, para poder
        obtener el promedio de notas del grupo.

        Nota:  *el programa le debe preguntar al profe la cantidad de estudiantes que tiene en el grupo.
            *El profe podrá ingresar el nombre y la nota de cada estudiante.
            * al finalizar el programa debe mostrar el listado de los estudiantes y sus notas.
            * también debe mostrar el promedio general del grupo, la nota mayor y la nota menor.
 */