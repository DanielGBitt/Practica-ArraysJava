import java.util.Scanner;

public class practicaCRUD {
    public static void main() {
        System.out.println("---------------------------------------------");
        System.out.println("Bienvenido a la tienda de videojuegos - ROOM");
        System.out.println("---------------------------------------------\n");

        byte opcion = 0;
        byte capacidad = 0;
        byte contadorLoop = 0;
        byte opcionSalidaRegistro = 0;

        int contadorVideoJuegos = 0;

        String codigo = "";

        boolean exit = false;
        Scanner in = new Scanner(System.in);


        System.out.println("Ingresa la capacidad deseada de videojuegos");

        do {
            capacidad = in.nextByte();
            if (capacidad <= 0) {
                System.out.println("Debes ingresar un numero valido para continuar");
            }
        } while (capacidad <= 0);

        String[] nombreVideoJuego = new String[capacidad];
        String[] codigoVideoJuego = new String[capacidad];

        do {
            System.out.println("""
                        -----------------------
                        MENU - CRUD
                        -----------------------
                        1). Registrar videojuego
                        2). Listar videojuegos
                        3). Buscar por código
                        4). Actualizar videojuego
                        5). Eliminar videojuego
                        6). Salir del programa
                        ------------------------------
                    """);

            opcion = in.nextByte();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Posicion " + contadorVideoJuegos);
                    System.out.println("Capacidad de registro " + capacidad);
                    System.out.println("----------------------------------");
                    contadorLoop = capacidad;

                    for (int i = 0; i <= contadorLoop - 1; i++) {

                        if (contadorVideoJuegos >= capacidad) {
                            System.out.println("Alcanzaste el maximo de registro permitido!!");
                        } else {
                            //INGRESAMOS CAMPOS
                            System.out.println("Ingrese nombre del videojuego");
                            nombreVideoJuego[contadorVideoJuegos] = in.nextLine();
                            System.out.println("Ahora codigo");
                            codigoVideoJuego[contadorVideoJuegos] = in.nextLine();
                            System.out.println("Videojuego registrado exitosamente!\n");
                            //CONTADOR VIDEOJUEGOS
                            contadorVideoJuegos += 1;


                            if (contadorVideoJuegos >= capacidad) {
                                System.out.println("Alcanzaste el maximo de registro permitido!!");
                            } else {
                                //MENU
                                System.out.println("""
                                            ¿Quieres volver al menu principal??
                                            1) SI
                                            2) NO
                                        """);

                                opcionSalidaRegistro = in.nextByte();
                                in.nextLine();

                                switch (opcionSalidaRegistro) {
                                    case 1:
                                        contadorLoop = 1;
                                        break;
                                    case 2:
                                        contadorLoop = capacidad;
                                }
                            }


                        }


                    }

                    break;


                case 2:

                    if (contadorVideoJuegos == 0) {
                        System.out.println("No hay videojuegos que mostrar!!");
                    } else {
                        System.out.println("Listado de videojuegos");
                        System.out.println("--------------------------------");
                        System.out.println("Video juegos registrados: " + contadorVideoJuegos);
                        System.out.println("Filas vacias " + (capacidad - contadorVideoJuegos));
                        System.out.println("-------------------------");
                        for (int i = 0; i <= contadorVideoJuegos - 1; i++) {
                            System.out.println("NOMBRE\t\t || CODIGO");
                            System.out.println(nombreVideoJuego[i] + "\t\t||\t\t" + codigoVideoJuego[i]);
                        }
                        System.out.println("-------------------------");
                    }

                    break;


                case 3:
                    System.out.println("Busca por Codigo");
                    codigo = in.nextLine();

                    System.out.println("------------------------------------------");
                    for (int i = 0; i <= contadorVideoJuegos - 1; i++) {
                        if (codigoVideoJuego[i].equalsIgnoreCase(codigo)) {
                            System.out.println("El video juego que buscas es: " + nombreVideoJuego[i]);
                        }
                    }
                    System.out.println("------------------------------------------");

                    break;


                case 4:

                    System.out.println("Ingresa el codigo del videojuego que quieres actualizar");
                    codigo = in.nextLine();

                    for (int i = 0; i <= contadorVideoJuegos - 1; i++) {
                        if (codigoVideoJuego[i].equalsIgnoreCase(codigo)) {
                            System.out.println("Ingresa el nuevo nombre a modificar");
                            nombreVideoJuego[i] = in.nextLine();

                            System.out.println("Juego actualizado exitosamente!!");

                        } else {
                            System.out.println("No existe un juego con ese ID");
                        }
                    }


                    break;

                case 5:
                    System.out.println("Ingresa el codigo del videojuego que quieres eliminar");
                    codigo = in.nextLine();
                    for (int i = 0; i <= contadorVideoJuegos - 1; i++) {
                        if (codigoVideoJuego[i].equalsIgnoreCase(codigo)) {
                            nombreVideoJuego[i] = nombreVideoJuego[i + 1];
                            codigoVideoJuego[i] = codigoVideoJuego[i + 1];
                        }else {
                            System.out.println("No existe un juego con ese ID");
                        }
                    }
                    contadorVideoJuegos --;
                    System.out.println("Juego eliminado exitosamente");

                    break;

                case 6:
                    exit = true;
                    System.out.println("-------------------------------------");
                    System.out.println("Gracias por utilizar el programa!");
                    System.out.println("-------------------------------------");
                    break;
            }
        } while (exit == false);

    }
}


/*
CRUD - TIENDA DE VIDEOJUEGOS

Crear un programa en Java para administrar videojuegos usando
arreglos paralelos, Scanner, if-else, switch, for y do-while.

Cada videojuego tendrá:
- Código (int)
- Nombre (String)
- Plataforma (String)
- Precio (double)
- Cantidad disponible (int)

1. CAPACIDAD
- Solicitar la capacidad máxima de videojuegos.
- Validar que sea mayor que cero.
- Crear los arreglos paralelos correspondientes.

2. MENÚ PRINCIPAL (do-while + switch)
1. Administrar videojuegos
2. Generar reportes
3. Salir

3. ADMINISTRAR VIDEOJUEGOS
1. Registrar videojuego
2. Listar videojuegos
3. Buscar por código
4. Actualizar videojuego
5. Eliminar videojuego
6. Volver al menú principal

4. REPORTES
1. Cantidad de videojuegos registrados
2. Videojuego más caro
3. Videojuego más económico
4. Valor total del inventario
   (precio * cantidad disponible)
5. Volver al menú principal

5. CONDICIONES
- No superar la capacidad máxima.
- Listar únicamente videojuegos registrados.
- Buscar mediante el código.
- Actualizar los datos sin modificar el código.
- Al eliminar, desplazar los datos posteriores
  una posición hacia la izquierda.
- Disminuir el contador después de eliminar.
- No actualizar, eliminar ni generar reportes de
  precios si no hay videojuegos registrados.
- Informar cuando una opción no sea válida.

IMPORTANTE:
- Usar arreglos paralelos, no ArrayList.
- Usar un contador para controlar los registros.
- No implementar clases adicionales.
- Desarrollar el programa por etapas.
*/
