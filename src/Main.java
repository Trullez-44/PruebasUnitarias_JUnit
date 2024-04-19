import TallerPractico.Cabina;
import TallerPractico.SistemaControlTeleferico;
import TallerPractico.Usuario;

public class Main {
    public static void main(String[] args) {

                // Crear instancia del sistema de control del teleférico
                SistemaControlTeleferico sistema = new SistemaControlTeleferico();

                // Crear dos cabinas
                sistema.crearCabina(1, 8);
                sistema.crearCabina(2, 10);

                // Crear un usuario
                Usuario usuario = new Usuario("Juan", 30);

                // Solicitar un viaje en la primera cabina
                sistema.solicitarViaje(usuario, sistema.getCabinas().get(0));

                // Cambiar el estado de la primera cabina a "en movimiento"
                sistema.getCabinas().get(0).cambiarEstado("en movimiento");

                // Mover la primera cabina a la segunda cabina
                sistema.moverCabina(sistema.getCabinas().get(0), sistema.getCabinas().get(1));

                // Solicitar un viaje en la segunda cabina
                sistema.solicitarViaje(usuario, sistema.getCabinas().get(1));

                // Cambiar el estado de la segunda cabina a "en movimiento"
                sistema.getCabinas().get(1).cambiarEstado("en movimiento");

                // Mover la segunda cabina a la primera cabina
                sistema.moverCabina(sistema.getCabinas().get(1), sistema.getCabinas().get(0));

                // Solicitar un viaje en la primera cabina
                sistema.solicitarViaje(usuario, sistema.getCabinas().get(0));

                // Eliminar la segunda cabina
                sistema.eliminarCabina(sistema.getCabinas().get(1));
            }
        }