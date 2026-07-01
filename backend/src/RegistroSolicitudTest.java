public class RegistroSolicitudTest {

    public static void main(String[] args) {

        System.out.println("========== PRUEBA 1 ==========");
        RegistroSolicitud.registrar("Juan Perez", "Guitarra Yamaha");

        System.out.println();

        System.out.println("========== PRUEBA 2 ==========");
        RegistroSolicitud.registrar("Maria Lopez", "Teclado Casio");

        System.out.println();

        System.out.println("========== PRUEBA 3 ==========");
        RegistroSolicitud.registrar("", "Batería Pearl");

        System.out.println();

        System.out.println("========== PRUEBA 4 ==========");
        RegistroSolicitud.registrar("Luis Gómez", "");

        System.out.println();

        System.out.println("========== PRUEBA 5 ==========");
        RegistroSolicitud.registrar("Diego Gutierrez", "Piano Digital Roland");

        System.out.println();

        System.out.println("==========================================");
        System.out.println("Todas las pruebas finalizaron correctamente.");
        System.out.println("Sistema Web de Atención Postventa BeatX.");
        System.out.println("==========================================");

    }

}