public class practicaCRUD {
    public static void main() {
        System.out.println("Bienvenido a la tienda de videojuegos - ROOM");

        System.out.println("""
                    1). Registrar videojuego
                    2). Listar videojuegos
                    3). Buscar por código
                    4). Actualizar videojuego
                    5). Eliminar videojuego
                    6). Volver al menú principal
                """);


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
