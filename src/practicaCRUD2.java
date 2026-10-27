import java.util.Scanner;

public class practicaCRUD2 {
    public static void main(String[] args) {

        int capacidad = 0;
        Scanner in = new Scanner(System.in);
        byte opcionMenu = 0;
        boolean salir = false;
        int contadorProductosRegistrados = 0;

        System.out.println("Bienvenido a la tienda");

        System.out.println("------------------------------------");
        System.out.println("Ingrese la capacidad de inventario");
        System.out.println("------------------------------------");

        do {
            capacidad = in.nextInt();

            if (capacidad <= 0) {
                System.out.println("Debes ingresar un valor valido para continuar!");
            }
        } while (capacidad <= 0);

        String[] codigo = new String[capacidad];
        String[] nombre = new String[capacidad];
        double[] precio = new double[capacidad];
        int[] stock = new int[capacidad];


        do {
            System.out.println("Seleccione la opción a seguir");
            System.out.println("""
                        1) LISTAR PRODUCTOS
                        2) REGISTRAR PRODUCTO
                        3) BUSCAR PRODUCTO
                        4) ACTUALIZAR PRODUCTO
                        5) ELIMINAR PRODUCTO
                        6) RESUMEN DEL INVENTARIO
                        7) SALIR
                    """);

            opcionMenu = in.nextByte();
            in.nextLine();

            switch (opcionMenu) {
                case 1:
                    if (codigo[0] == null) {
                        System.out.println("-------------------------------");
                        System.out.println("No hay productos que mostrar!!");
                        System.out.println("-------------------------------\n");
                    } else {
                        System.out.println("CODIGO\t || NOMBRE\t || PRECIO\t || CANTIDAD");
                        for (int i = 0; i < codigo.length; i++) {
                            System.out.println(codigo[i] + "\t||" + nombre[i] + "\t||" + precio[i] + "\t||" + stock[i]);
                        }
                    }
                    break;


                case 2:
                    for (int i = 0; i <= capacidad - 1; i++ ){
                        System.out.println("Ingrese el codigo de producto");
                        codigo[i] = in.nextLine();

                        System.out.println("Ingrese nombre de producto con ID - " +  codigo[i]);
                        nombre[i] = in.nextLine();

                        System.out.println("Ingrese precio de producto - " + nombre[i]);
                        precio[i] = in.nextDouble();

                        System.out.println("Ingrese el stock de este producto " + nombre[i]);
                        stock[i] = in.nextInt();

                        contadorProductosRegistrados += 1;

                    }
                    break;
            }
        } while (salir == false);
    }
}
