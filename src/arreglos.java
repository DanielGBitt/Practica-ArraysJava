import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {

        /*

         Un profesor necesita saber la edad de sus 5 estudiantes para poder
         obtener el promedio de edad del grupo

         */

        /*int edad1= 0, edad2= 0, edad3 = 0;
        //Asi se hacia antiguamente
*/
/*
        int[] edades = new int[5];
        //Primer forma
*/

  /*
        //Segunda forma

        // Ingresar datos en el array
        edades[0] = 30;
        edades[1] = 25;
        edades[2] = 20;
        edades[3] = 60;
        edades[4] = 15;
*/
        int[] edades = new int[5];
        String[] nombres = new String[5];
        int suma = 0;
        double promedio = 0;
        Scanner in = new Scanner(System.in);

        // Ingresar datos

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el nombre del estudiante " + (i + 1));
            nombres[i] = in.nextLine();

            System.out.println("Ingresa la edad del estudiante " + nombres[i]);
            edades[i] = in.nextInt();
            in.nextLine();
            suma += edades[i];
        }

        promedio = suma / edades.length;
        System.out.println("----------------");
        System.out.println("Nombre" + "|" + "Edad");
        System.out.println("-----------------------");
        for (int r = 0; r < edades.length; r++){
            System.out.println(nombres[r] + "|"+ edades[r]);
        }
        System.out.println("-------------------------");
        System.out.println("Promedio " + promedio);
        System.out.println("---------------------------");
    }
}

