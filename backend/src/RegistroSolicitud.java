public class RegistroSolicitud {

    public static void registrar(String cliente, String producto) {

        if (cliente == null || cliente.trim().isEmpty()) {
            System.out.println("Error: El cliente no puede estar vacío.");
            return;
        }

        if (producto == null || producto.trim().isEmpty()) {
            System.out.println("Error: El producto no puede estar vacío.");
            return;
        }

        String tecnico = "Carlos Ramirez";
        String estado = "Registrado";

        System.out.println("==========================================");
        System.out.println("     SISTEMA POSTVENTA BEATX");
        System.out.println("==========================================");
        System.out.println("Cliente : " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Estado  : " + estado);
        System.out.println("Técnico : " + tecnico);
        System.out.println("Solicitud registrada correctamente.");
        System.out.println("==========================================");
    }

}