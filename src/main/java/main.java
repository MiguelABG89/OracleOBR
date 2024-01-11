import static data.FunVarCiudad.funcionCiudad;
import static data.InsertarDatos.insertar;
import static data.SelecionarDatos.notasMediasAlumnos;

public class main {
    public static void main(String[] args) {
        boolean salir = false;
        String opcion = "";
        do {
            System.out.println("0. Salir");
            System.out.println("1. Listar los clientes y el número de artículos que ha comprado");
            System.out.println("2. Listar los diferentes productos y el número de unidades vendidas");
            System.out.println("3. Insertar una venta");
            System.out.println("4. Obtener un listado de ventas de un cliente");

            opcion = libs.Leer.pedirCadena("Introduce una opción");
            switch (opcion) {
                case "0" -> {salir = true;}
                case "1" -> {insertar();}
                case "2" -> notasMediasAlumnos();
                case "3" -> funcionCiudad();

                default -> {System.out.println("Opción incorrecta");}
            }
        }while (!salir);

    }
}
